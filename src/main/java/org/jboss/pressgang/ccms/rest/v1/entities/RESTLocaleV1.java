package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLocaleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTLocaleCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTLocaleV1 extends RESTBasePrimaryEntityV1<RESTLocaleV1, RESTLocaleCollectionV1, RESTLocaleCollectionItemV1> {
    public static String VALUE_NAME = "value";
    public static String TRANSLATION_VALUE_NAME = "translationValue";
    public static String BUILD_VALUE_NAME = "buildValue";

    private String value;
    private String translationValue;
    private String buildValue;
    private RESTLocaleCollectionV1 revisions;

    @Override
    public RESTLocaleCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTLocaleCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTLocaleV1 clone(final boolean deepCopy) {
        final RESTLocaleV1 retValue = new RESTLocaleV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTLocaleV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.value = value;
        clone.translationValue = translationValue;
        clone.buildValue = buildValue;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTLocaleCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
            clone.revisions = revisions;
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void explicitSetValue(String value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    public String getTranslationValue() {
        return translationValue;
    }

    public void setTranslationValue(String translationValue) {
        this.translationValue = translationValue;
    }

    public void explicitSetTranslationValue(String translationValue) {
        this.translationValue = translationValue;
        setParameterToConfigured(TRANSLATION_VALUE_NAME);
    }

    public String getBuildValue() {
        return buildValue;
    }

    public void setBuildValue(String buildValue) {
        this.buildValue = buildValue;
    }

    public void explicitSetBuildValue(String buildValue) {
        this.buildValue = buildValue;
        setParameterToConfigured(BUILD_VALUE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTLocaleV1)) return false;

        // Make sure the value equals
        final RESTLocaleV1 otherLocale = (RESTLocaleV1) other;
        if (value != null && !value.equals(otherLocale.value)) return false;
        if (value == null && otherLocale.value != null) return false;

        return super.equals(other);
    }
}
