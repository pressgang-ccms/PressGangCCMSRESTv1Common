package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedNodeStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSTranslatedNodeStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTranslatedStringV1;

public class RESTCSTranslatedNodeStringV1 extends RESTBaseTranslatedStringV1<RESTCSTranslatedNodeStringV1,
        RESTCSTranslatedNodeStringCollectionV1, RESTCSTranslatedNodeStringCollectionItemV1> {
    public static final String TRANSLATEDNODE_NAME = "translatedNode";
    public static final String LOCALE_NAME = "locale";

    private RESTCSTranslatedNodeV1 translatedNode = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTCSTranslatedNodeStringCollectionV1 revisions = null;
    private String locale = null;

    @Override
    public RESTCSTranslatedNodeStringCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTCSTranslatedNodeStringCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCSTranslatedNodeStringV1 clone(final boolean deepCopy) {
        final RESTCSTranslatedNodeStringV1 retValue = new RESTCSTranslatedNodeStringV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCSTranslatedNodeStringV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = this.locale;

        if (deepCopy) {
            if (this.translatedNode != null) {
                clone.translatedNode = translatedNode.clone(deepCopy);
            }

            if (this.revisions != null) {
                clone.revisions = new RESTCSTranslatedNodeStringCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
            clone.translatedNode = this.translatedNode;
        }
    }

    public RESTCSTranslatedNodeV1 getTranslatedNode() {
        return translatedNode;
    }

    public void setTranslatedNode(final RESTCSTranslatedNodeV1 translatedNode) {
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
        this.setParameterToConfigured(LOCALE_NAME);
    }

    public void explicitSetOriginalString(final String originalString) {
        this.originalString = originalString;
        this.setParameterToConfigured(ORIGINALSTRING_NAME);
    }

    public void explicitSetTranslatedString(final String translatedString) {
        this.translatedString = translatedString;
        this.setParameterToConfigured(TRANSLATEDSTRING_NAME);
    }

    public void explicitSetFuzzyTranslation(final Boolean fuzzyTranslation) {
        this.fuzzyTranslation = fuzzyTranslation;
        this.setParameterToConfigured(FUZZY_TRANSLATION_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTCSTranslatedNodeStringV1)) return false;

        return super.equals(other);
    }

}
