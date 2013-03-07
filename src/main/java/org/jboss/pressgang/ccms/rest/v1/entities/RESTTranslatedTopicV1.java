package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTranslatedTopicCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;

/**
 * The RESTTranslatedTopicV1 class is a combination of the TranslatedTopic and TranslatedTopicData classes. In the database,
 * a TranslatedTopic is a reference to a particular revision of a topic, and it has multiple TranslatedTopicData children for each locale
 * . From the REST point of view each RESTTranslatedTopicV1 combines the topic information from the TranslatedTopic,
 * and the translation information from the TranslatedTopicData class.
 *
 * @author Matthew Casperson
 */
public class RESTTranslatedTopicV1 extends RESTBaseTopicV1<RESTTranslatedTopicV1, RESTTranslatedTopicCollectionV1,
        RESTTranslatedTopicCollectionItemV1> {
    public static final String TOPICID_NAME = "topicId";
    public static final String TOPICREVISION_NAME = "topicRevision";
    public static final String TOPIC_NAME = "topic";
    public static final String TRANSLATEDTOPICSTRING_NAME = "translatedTopicString_OTM";
    public static final String TRANSLATIONPERCENTAGE_NAME = "translationPercentage";
    public static final String HTML_UPDATED = "htmlUpdated";
    public static final String OUTGOING_NAME = "outgoingTranslatedRelationships";
    public static final String INCOMING_NAME = "incomingTranslatedRelationships";
    public static final String ALL_LATEST_OUTGOING_NAME = "allLatestOutgoingRelationships";
    public static final String ALL_LATEST_INCOMING_NAME = "allLatestIncomingRelationships";

    protected RESTTopicV1 topic = null;
    protected Integer translatedTopicId = null;
    protected Integer topicId = null;
    protected Integer topicRevision = null;
    protected Integer translationPercentage = null;
    protected Date htmlUpdated = null;
    protected Boolean containsFuzzyTranslation = false;
    protected RESTTranslatedTopicStringCollectionV1 translatedTopicStrings = null;
    protected RESTTranslatedTopicCollectionV1 outgoingTranslatedRelationships = null;
    protected RESTTranslatedTopicCollectionV1 incomingTranslatedRelationships = null;
    protected RESTTranslatedTopicCollectionV1 outgoingRelationships = null;
    protected RESTTranslatedTopicCollectionV1 incomingRelationships = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTTranslatedTopicCollectionV1 revisions = null;

    @Override
    public RESTTranslatedTopicCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTranslatedTopicCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTranslatedTopicV1 clone(final boolean deepCopy) {
        final RESTTranslatedTopicV1 retValue = new RESTTranslatedTopicV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTranslatedTopicV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.topicId = this.topicId;
        clone.topicRevision = this.topicRevision;
        clone.translatedTopicId = this.translatedTopicId;
        clone.translationPercentage = this.translationPercentage;
        clone.containsFuzzyTranslation = this.containsFuzzyTranslation;

        if (deepCopy) {
            if (this.translatedTopicStrings != null) {
                clone.translatedTopicStrings = new RESTTranslatedTopicStringCollectionV1();
                this.translatedTopicStrings.cloneInto(clone.translatedTopicStrings, deepCopy);
            }

            if (this.outgoingTranslatedRelationships != null) {
                clone.outgoingTranslatedRelationships = new RESTTranslatedTopicCollectionV1();
                this.outgoingTranslatedRelationships.cloneInto(clone.outgoingTranslatedRelationships, deepCopy);
            }

            if (this.incomingTranslatedRelationships != null) {
                clone.incomingTranslatedRelationships = new RESTTranslatedTopicCollectionV1();
                this.incomingTranslatedRelationships.cloneInto(clone.incomingTranslatedRelationships, deepCopy);
            }

            if (this.incomingRelationships != null) {
                clone.incomingRelationships = new RESTTranslatedTopicCollectionV1();
                this.incomingRelationships.cloneInto(clone.incomingRelationships, deepCopy);
            }

            if (this.outgoingRelationships != null) {
                clone.outgoingRelationships = new RESTTranslatedTopicCollectionV1();
                this.outgoingRelationships.cloneInto(clone.outgoingRelationships, deepCopy);
            }

            if (this.revisions != null) {
                clone.revisions = new RESTTranslatedTopicCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }

            clone.setTopic(this.topic != null ? this.topic.clone(deepCopy) : null);
        } else {
            clone.translatedTopicStrings = this.translatedTopicStrings;
            clone.topic = this.topic;
            clone.outgoingTranslatedRelationships = this.outgoingTranslatedRelationships;
            clone.incomingTranslatedRelationships = this.incomingTranslatedRelationships;
            clone.outgoingRelationships = this.outgoingRelationships;
            clone.incomingRelationships = this.incomingRelationships;
            clone.revisions = this.revisions;
        }
    }

    public Integer getTranslatedTopicId() {
        return translatedTopicId;
    }

    public void setTranslatedTopicId(Integer translatedTopicId) {
        this.translatedTopicId = translatedTopicId;
    }

    public void explicitSetXml(final String xml) {
        setXml(xml);
        setParameterToConfigured(XML_NAME);
    }

    public void explicitSetXmlErrors(final String xmlErrors) {
        setXmlErrors(xmlErrors);
        setParameterToConfigured(XML_ERRORS_NAME);
    }

    public void explicitSetHtml(final String html) {
        setHtml(html);
        setParameterToConfigured(HTML_NAME);
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(final Integer topicId) {
        this.topicId = topicId;
    }

    public void explicitSetTopicId(final Integer topicId) {
        this.topicId = topicId;
        this.setParameterToConfigured(TOPICID_NAME);
    }

    public Integer getTopicRevision() {
        return topicRevision;
    }

    public void setTopicRevision(final Integer topicRevision) {
        this.topicRevision = topicRevision;
    }

    public RESTTopicV1 getTopic() {
        return topic;
    }

    public void setTopic(final RESTTopicV1 topic) {
        this.topic = topic;
    }

    public void explicitSetTopicRevision(final Integer topicRevision) {
        this.topicRevision = topicRevision;
        this.setParameterToConfigured(TOPICREVISION_NAME);
    }

    public Integer getTranslationPercentage() {
        return translationPercentage;
    }

    public void setTranslationPercentage(Integer translationPercentage) {
        this.translationPercentage = translationPercentage;
    }

    public void explicitSetTranslationPercentage(Integer translationPercentage) {
        this.translationPercentage = translationPercentage;
        this.setParameterToConfigured(TRANSLATIONPERCENTAGE_NAME);
    }

    public RESTTranslatedTopicStringCollectionV1 getTranslatedTopicStrings_OTM() {
        return translatedTopicStrings;
    }

    public void setTranslatedTopicStrings_OTM(final RESTTranslatedTopicStringCollectionV1 translatedTopicStrings) {
        this.translatedTopicStrings = translatedTopicStrings;
    }

    public void explicitSetTranslatedTopicString_OTM(final RESTTranslatedTopicStringCollectionV1 translatedTopicStrings) {
        this.translatedTopicStrings = translatedTopicStrings;
        this.setParameterToConfigured(TRANSLATEDTOPICSTRING_NAME);
    }

    public Date getHtmlUpdated() {
        return htmlUpdated;
    }

    public void setHtmlUpdated(final Date htmlUpdated) {
        this.htmlUpdated = htmlUpdated;
    }

    public void explicitSetHtmlUpdated(final Date htmlUpdated) {
        this.htmlUpdated = htmlUpdated;
        this.setParameterToConfigured(HTML_UPDATED);
    }

    public void explicitSetLocale(final String locale) {
        setLocale(locale);
        setParameterToConfigured(LOCALE_NAME);
    }

    public RESTTranslatedTopicCollectionV1 getOutgoingTranslatedRelationships() {
        return outgoingTranslatedRelationships;
    }

    public void setOutgoingTranslatedRelationships(final RESTTranslatedTopicCollectionV1 outgoingTranslatedRelationships) {
        this.outgoingTranslatedRelationships = outgoingTranslatedRelationships;
    }

    public RESTTranslatedTopicCollectionV1 getIncomingTranslatedRelationships() {
        return incomingTranslatedRelationships;
    }

    public void setIncomingTranslatedRelationships(final RESTTranslatedTopicCollectionV1 incomingTranslatedRelationships) {
        this.incomingTranslatedRelationships = incomingTranslatedRelationships;
    }

    @Override
    public RESTTranslatedTopicCollectionV1 getOutgoingRelationships() {
        return outgoingRelationships;
    }

    @Override
    public void setOutgoingRelationships(final RESTTranslatedTopicCollectionV1 outgoingRelationships) {
        this.outgoingRelationships = outgoingRelationships;
    }

    @Override
    public RESTTranslatedTopicCollectionV1 getIncomingRelationships() {
        return incomingRelationships;
    }

    @Override
    public void setIncomingRelationships(final RESTTranslatedTopicCollectionV1 incomingRelationships) {
        this.incomingRelationships = incomingRelationships;
    }

    public Boolean getContainsFuzzyTranslation() {
        return containsFuzzyTranslation;
    }

    public void setContainsFuzzyTranslation(final boolean containsFuzzyTranslation) {
        this.containsFuzzyTranslation = containsFuzzyTranslation;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTranslatedTopicV1)) return false;

        return super.equals(other);
    }
}
