package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSTranslatedStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTranslatedStringV1;

public class RESTCSTranslatedStringV1 extends RESTBaseTranslatedStringV1<RESTCSTranslatedStringV1, RESTCSTranslatedStringCollectionV1,
        RESTCSTranslatedStringCollectionItemV1> {

    public static final String LOCALE_NAME = "locale";

    /**
     * A list of the Envers revision numbers
     */
    private RESTCSTranslatedStringCollectionV1 revisions = null;
    private String locale = null;

    @Override
    public RESTCSTranslatedStringCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTCSTranslatedStringCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCSTranslatedStringV1 clone(final boolean deepCopy) {
        final RESTCSTranslatedStringV1 retValue = new RESTCSTranslatedStringV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCSTranslatedStringV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = this.locale;

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTCSTranslatedStringCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
        }
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
        if (!(other instanceof RESTCSTranslatedStringV1)) return false;

        return super.equals(other);
    }

}
