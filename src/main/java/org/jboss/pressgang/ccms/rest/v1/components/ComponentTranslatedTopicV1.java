/*
  Copyright 2011-2014 Red Hat

  This file is part of PresGang CCMS.

  PresGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PresGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PresGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.components;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslatedTopicStringV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslatedTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;
import org.jboss.pressgang.ccms.utils.constants.CommonConstants;
import org.jboss.pressgang.ccms.zanata.ZanataDetails;

/**
 * This component contains methods that can be applied against translated topics
 *
 * @author Matthew Casperson
 */
public class ComponentTranslatedTopicV1 extends ComponentBaseTopicV1 {
    final RESTTranslatedTopicV1 source;

    public ComponentTranslatedTopicV1(final RESTTranslatedTopicV1 source) {
        super(source);
        this.source = source;
    }

    public String returnZanataId() {
        return returnZanataId(source);
    }

    public static String returnZanataId(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getTranslatedCSNode() == null) {
            return source.getTopicId() + "-" + source.getTopicRevision();
        } else {
            return source.getTopicId() + "-" + source.getTopicRevision() + "-" + source.getTranslatedCSNode().getId();
        }
    }

    @Override
    public String returnBugzillaBuildId() {
        return returnBugzillaBuildId(source);
    }

    public static String returnBugzillaBuildId(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (!ComponentBaseTopicV1.returnIsDummyTopic(source)) {
            return "Translation " + returnZanataId(source) + " " + source.getLocale();
        } else {
            return ComponentTopicV1.returnBugzillaBuildId(source.getTopic());
        }
    }

    @Override
    public String returnPressGangCCMSURL() {
        return returnPressGangCCMSURL(source);
    }

    public static String returnPressGangCCMSURL(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        /*
         * If the topic isn't a dummy then link to the translated counterpart. If the topic is a dummy URL and the locale doesn't match
         * the historical topic's locale then it means that the topic has been pushed to zanata so link to the original pushed
         * translation. If neither of these rules apply then return null
         */
        final String serverUrl = System.getProperty(CommonConstants.PRESS_GANG_UI_SYSTEM_PROPERTY);
        if (!ComponentBaseTopicV1.returnIsDummyTopic(source)) {
            return (serverUrl.endsWith(
                    "/") ? serverUrl : (serverUrl + "/")) + "#TranslatedTopicResultsAndTranslatedTopicView;query;zanataIds=" +
                    returnZanataId(source) + ";locale1=" + source.getLocale() + "1;";
        } else if (hasBeenPushedForTranslation(source)) {
            return (serverUrl.endsWith(
                    "/") ? serverUrl : (serverUrl + "/")) + "#TranslatedTopicResultsAndTranslatedTopicView;query;zanataIds=" +
                    returnZanataId(source);
        } else {
            return (serverUrl.endsWith("/") ? serverUrl : (serverUrl + "/")) + "#SearchResultsAndTopicView;query;topicIds=" + source.getTopicId();
        }
    }

    @Override
    public RESTTranslatedTopicV1 returnRelatedTopicByID(final Integer id) {
        return returnRelatedTopicByID(source, id);
    }

    public static RESTTranslatedTopicV1 returnRelatedTopicByID(final RESTTranslatedTopicV1 source, final Integer id) {
        checkArgument(source != null, "The source parameter can not be null");

        RESTTranslatedTopicV1 relatedTopic = null;
        if (source.getOutgoingRelationships() != null && source.getOutgoingRelationships().getItems() != null) {
            final List<RESTTranslatedTopicV1> topics = source.getOutgoingRelationships().returnItems();
            for (final RESTTranslatedTopicV1 topic : topics) {
                if (topic.getTopicId().equals(id)
                        // Check that the translation is complete
                        //&& topic.getTranslationPercentage() >= 100
                        // Check that a related topic hasn't been set or the topics revision is higher then the current topic revision
                        && (relatedTopic == null || topic.getTopicRevision() > relatedTopic.getTopicRevision())) {
                    relatedTopic = topic;
                }
            }
        }
        return relatedTopic;
    }

    @Override
    public String returnXRefID() {
        return returnXRefID(source);
    }

    public static String returnXRefID(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (!ComponentBaseTopicV1.returnIsDummyTopic(source)) return "TranslatedTopicID" + source.getId();
        else if (hasBeenPushedForTranslation(source)) return "TranslatedTopicID" + returnPushedTranslationTopicId(source);
        else return ComponentTopicV1.returnErrorXRefID(source.getTopic());
    }

    @Override
    public String returnErrorXRefID() {
        return returnErrorXRefID(source);
    }

    public static String returnErrorXRefID(final RESTTranslatedTopicV1 source) {
        return CommonConstants.ERROR_XREF_ID_PREFIX + returnZanataId(source);
    }

    public Integer returnPushedTranslationTopicId() {
        return returnPushedTranslationTopicId(source);
    }

    public static Integer returnPushedTranslationTopicId(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (!ComponentBaseTopicV1.returnIsDummyTopic(source)) return source.getTranslatedTopicId();

        /* Check that a translation exists that is the same locale as the base topic */
        RESTTranslatedTopicV1 pushedTranslatedTopic = null;
        if (source.getTopic().getTranslatedTopics_OTM() != null && source.getTopic().getTranslatedTopics_OTM().getItems() != null) {
            final Integer topicRev = source.getTopicRevision();
            final List<RESTTranslatedTopicV1> topics = source.getTopic().getTranslatedTopics_OTM().returnItems();
            for (final RESTTranslatedTopicV1 translatedTopic : topics) {
                if (translatedTopic.getLocale().equals(source.getTopic().getLocale()) &&
                        // Ensure that the topic revision is less than or equal to the source revision
                        (topicRev == null || translatedTopic.getTopicRevision() <= topicRev) &&
                        // Check if this translated topic is a higher revision then the current stored translation
                        (pushedTranslatedTopic == null || pushedTranslatedTopic.getTopicRevision() < translatedTopic.getTopicRevision()))
                    pushedTranslatedTopic = translatedTopic;
            }
        }

        return pushedTranslatedTopic == null ? null : pushedTranslatedTopic.getTranslatedTopicId();
    }

    public RESTTranslatedTopicV1 returnPushedTranslatedTopic() {
        return returnPushedTranslatedTopic(source);
    }

    public static RESTTranslatedTopicV1 returnPushedTranslatedTopic(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (!ComponentBaseTopicV1.returnIsDummyTopic(source)) return source;

        if (source.getTopic() != null) {
            return ComponentTopicV1.returnPushedTranslatedTopic(source.getTopic(), source.getTranslatedCSNode());
        } else  {
            return null;
        }
    }

    public boolean hasBeenPushedForTranslation() {
        return hasBeenPushedForTranslation(source);
    }

    public static boolean hasBeenPushedForTranslation(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (!ComponentBaseTopicV1.returnIsDummyTopic(source)) return true;

        /* Check that a translation exists that is the same locale as the base topic */
        boolean baseTranslationExists = false;
        if (source.getTopic().getTranslatedTopics_OTM() != null && source.getTopic().getTranslatedTopics_OTM().getItems() != null) {
            final List<RESTTranslatedTopicV1> topics = source.getTopic().getTranslatedTopics_OTM().returnItems();
            for (final RESTTranslatedTopicV1 translatedTopic : topics) {
                if (translatedTopic.getLocale().equals(source.getTopic().getLocale())) baseTranslationExists = true;
            }
        }

        return baseTranslationExists;
    }

    @Override
    public boolean hasRelationshipTo(final Integer id) {
        return hasRelationshipTo(source, id);
    }

    public static boolean hasRelationshipTo(final RESTTranslatedTopicV1 source, final Integer id) {
        return returnRelatedTopicByID(source, id) != null;
    }

    @Override
    public String returnXrefPropertyOrId(final Integer propertyTagId) {
        return returnXrefPropertyOrId(source, propertyTagId);
    }

    public static String returnXrefPropertyOrId(final RESTTranslatedTopicV1 source, final Integer propertyTagId) {
        final RESTAssignedPropertyTagV1 propTag = returnProperty(source, propertyTagId);
        if (propTag != null) {
            return propTag.getValue();
        } else {
            return returnXRefID(source);
        }
    }

    @Override
    public String returnEditorURL() {
        return returnEditorURL(source, new ZanataDetails());
    }

    public String returnEditorURL(final ZanataDetails zanataDetails) {
        return returnEditorURL(source, zanataDetails);
    }

    public static String returnEditorURL(final RESTTranslatedTopicV1 source, final ZanataDetails zanataDetails) {
        checkArgument(source != null, "The source parameter can not be null");

        final String zanataServerUrl = zanataDetails == null ? null : zanataDetails.getServer();
        final String zanataProject = zanataDetails == null ? null : zanataDetails.getProject();
        final String zanataVersion = zanataDetails == null ? null : zanataDetails.getVersion();

        if (zanataServerUrl != null && !zanataServerUrl.isEmpty() && zanataProject != null && !zanataProject.isEmpty() && zanataVersion
                != null && !zanataVersion.isEmpty()) {
            /*
             * If the topic isn't a dummy then link to the translated counterpart. If the topic is a dummy URL and the locale doesn't
             * match the historical topic's
             * locale then it means that the topic has been pushed to zanata so link to the original pushed translation. If neither of
             * these rules apply then link
             * to the standard topic.
             */
            if (!ComponentBaseTopicV1.returnIsDummyTopic(source)) {
                final String zanataId = returnZanataId(source);
                return zanataServerUrl + "webtrans/Application.html?project=" + zanataProject + "&amp;iteration=" + zanataVersion +
                        "&amp;doc=" + zanataId + "&amp;localeId=" + source.getLocale() + "#view:doc;doc:" + zanataId;
            } else if (hasBeenPushedForTranslation(source)) {
                final RESTTranslatedTopicV1 pushedTranslatedTopic = returnPushedTranslatedTopic(source);
                final String zanataId = returnZanataId(pushedTranslatedTopic);
                return zanataServerUrl + "webtrans/Application.html?project=" + zanataProject + "&amp;iteration=" + zanataVersion +
                        "&amp;doc=" + zanataId + "&amp;localeId=" + source.getLocale() + "#view:doc;doc:" + zanataId;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static boolean containsFuzzyTranslations(final RESTTranslatedTopicV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getTranslatedTopicStrings_OTM() != null && source.getTranslatedTopicStrings_OTM().getItems() != null) {
            final List<RESTTranslatedTopicStringV1> translatedTopicStrings = source.getTranslatedTopicStrings_OTM().returnItems();
            for (final RESTTranslatedTopicStringV1 translatedTopicString : translatedTopicStrings) {
                if (translatedTopicString.getFuzzyTranslation()) {
                    return true;
                }
            }
        }

        return false;
    }
}