/*
  Copyright 2011-2014 Red Hat, Inc

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTranslatedTopicStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTranslatedStringV1;

public class RESTTranslatedTopicStringV1 extends RESTBaseTranslatedStringV1<RESTTranslatedTopicStringV1,
        RESTTranslatedTopicStringCollectionV1, RESTTranslatedTopicStringCollectionItemV1> {
    public static final String TRANSLATEDTOPIC_NAME = "translatedTopic";
    public static final String ORIGINALSTRING_NAME = "originalString";

    private RESTTranslatedTopicV1 translatedTopic = null;
    private String originalString = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTTranslatedTopicStringCollectionV1 revisions = null;

    @Override
    public RESTTranslatedTopicStringCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTranslatedTopicStringCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTranslatedTopicStringV1 clone(final boolean deepCopy) {
        final RESTTranslatedTopicStringV1 retValue = new RESTTranslatedTopicStringV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTranslatedTopicStringV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.originalString = originalString;

        if (deepCopy) {
            clone.translatedTopic = translatedTopic != null ? translatedTopic.clone(deepCopy) : null;

            if (revisions != null) {
                clone.revisions = new RESTTranslatedTopicStringCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }  else {
                clone.revisions = null;
            }
        } else {
            clone.translatedTopic = translatedTopic;
            clone.revisions = revisions;
        }
    }

    public RESTTranslatedTopicV1 getTranslatedTopic() {
        return translatedTopic;
    }

    public void setTranslatedTopic(final RESTTranslatedTopicV1 translatedTopic) {
        this.translatedTopic = translatedTopic;
    }

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(final String originalString) {
        this.originalString = originalString;
    }

    public void explicitSetOriginalString(final String originalString) {
        this.originalString = originalString;
        setParameterToConfigured(ORIGINALSTRING_NAME);
    }

    public void explicitSetTranslatedString(final String translatedString) {
        this.translatedString = translatedString;
        setParameterToConfigured(TRANSLATEDSTRING_NAME);
    }

    public void explicitSetFuzzyTranslation(final Boolean fuzzyTranslation) {
        this.fuzzyTranslation = fuzzyTranslation;
        setParameterToConfigured(FUZZY_TRANSLATION_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTranslatedTopicStringV1)) return false;

        return super.equals(other);
    }
}
