package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;

public abstract class RESTBaseTranslatedStringV1<T extends RESTBaseTranslatedStringV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>,
        V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBaseEntityV1<T, U, V> {
    public static final String ORIGINALSTRING_NAME = "originalString";
    public static final String TRANSLATEDSTRING_NAME = "translatedString";
    public static final String FUZZY_TRANSLATION_NAME = "fuzzyTranslation";

    protected String originalString = null;
    protected String translatedString = null;
    protected Boolean fuzzyTranslation = null;

    public void cloneInto(final RESTBaseTranslatedStringV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.originalString = this.originalString;
        clone.translatedString = this.translatedString;
        clone.fuzzyTranslation = this.fuzzyTranslation;
    }

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(final String originalString) {
        this.originalString = originalString;
    }

    public String getTranslatedString() {
        return translatedString;
    }

    public void setTranslatedString(final String translatedString) {
        this.translatedString = translatedString;
    }

    public Boolean getFuzzyTranslation() {
        return fuzzyTranslation;
    }

    public void setFuzzyTranslation(final Boolean fuzzyTranslation) {
        this.fuzzyTranslation = fuzzyTranslation;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseTranslatedStringV1)) return false;

        return super.equals(other);
    }
}
