/*
  Copyright 2011-2014 Red Hat

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

package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedCSNodeStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTranslatedCSNodeStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTranslatedStringV1;

public class RESTTranslatedCSNodeStringV1 extends RESTBaseTranslatedStringV1<RESTTranslatedCSNodeStringV1, RESTTranslatedCSNodeStringCollectionV1,
        RESTTranslatedCSNodeStringCollectionItemV1> {
    public static final String TRANSLATEDNODE_NAME = "translatedNode";
    public static final String LOCALE_NAME = "locale";

    private RESTTranslatedCSNodeV1 translatedNode = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTTranslatedCSNodeStringCollectionV1 revisions = null;
    private String locale = null;

    @Override
    public RESTTranslatedCSNodeStringCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTranslatedCSNodeStringCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTranslatedCSNodeStringV1 clone(final boolean deepCopy) {
        final RESTTranslatedCSNodeStringV1 retValue = new RESTTranslatedCSNodeStringV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTranslatedCSNodeStringV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = locale;

        if (deepCopy) {
            if (translatedNode != null) {
                clone.translatedNode = translatedNode.clone(deepCopy);
            } else {
                clone.translatedNode = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTTranslatedCSNodeStringCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
            clone.revisions = revisions;
            clone.translatedNode = translatedNode;
        }
    }

    public RESTTranslatedCSNodeV1 getTranslatedNode() {
        return translatedNode;
    }

    public void setTranslatedNode(final RESTTranslatedCSNodeV1 translatedNode) {
        this.translatedNode = translatedNode;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void explicitSetLocale(final String locale) {
        this.locale = locale;
        setParameterToConfigured(LOCALE_NAME);
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
        if (!(other instanceof RESTTranslatedCSNodeStringV1)) return false;

        return super.equals(other);
    }

}
