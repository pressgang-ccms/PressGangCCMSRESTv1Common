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

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTranslatedCSNodeStringV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = this.locale;

        if (deepCopy) {
            if (this.translatedNode != null) {
                clone.translatedNode = translatedNode.clone(deepCopy);
            }

            if (this.revisions != null) {
                clone.revisions = new RESTTranslatedCSNodeStringCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
            clone.translatedNode = this.translatedNode;
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
        this.setParameterToConfigured(LOCALE_NAME);
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
        if (!(other instanceof RESTTranslatedCSNodeStringV1)) return false;

        return super.equals(other);
    }

}
