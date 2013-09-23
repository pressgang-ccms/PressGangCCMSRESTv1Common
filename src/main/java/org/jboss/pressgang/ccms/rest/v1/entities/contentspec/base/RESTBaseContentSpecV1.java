package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTContentSpecTypeV1;

public abstract class RESTBaseContentSpecV1<T extends RESTBaseEntityWithPropertiesV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>,
        V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {

    public static final String LAST_PUBLISHED_NAME = "lastPublished";
    public static final String LOCALE_NAME = "locale";
    public static final String TYPE_NAME = "type";
    public static final String TAGS_NAME = "tags";
    public static final String TRANSLATED_CONTENT_SPECS_NAME = "translatedContentSpecs";

    protected String locale = null;
    protected Date lastPublished = null;
    protected Date lastModified = null;
    protected String errors = null;
    protected String failedContentSpec = null;
    protected RESTContentSpecTypeV1 type = null;
    protected RESTTagCollectionV1 tags = null;
    protected RESTTranslatedContentSpecCollectionV1 translatedContentSpecs = null;

    public void cloneInto(final RESTBaseContentSpecV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = locale;
        clone.lastPublished = lastPublished == null ? null : (Date) lastPublished.clone();
        clone.lastModified = lastModified == null ? null : (Date) lastModified.clone();
        clone.errors = errors;
        clone.failedContentSpec = failedContentSpec;

        if (deepCopy) {
            if (tags != null) {
                clone.tags = new RESTTagCollectionV1();
                tags.cloneInto(clone.tags, deepCopy);
            } else {
                clone.tags = null;
            }

            if (translatedContentSpecs != null) {
                clone.translatedContentSpecs = new RESTTranslatedContentSpecCollectionV1();
                translatedContentSpecs.cloneInto(clone.translatedContentSpecs, deepCopy);
            } else {
                clone.translatedContentSpecs = null;
            }
        } else {
            clone.tags = tags;
            clone.translatedContentSpecs = translatedContentSpecs;
        }
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public Date getLastPublished() {
        return lastPublished;
    }

    public void setLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(final Date lastModified) {
        this.lastModified = lastModified;
    }

    public RESTContentSpecTypeV1 getType() {
        return type;
    }

    public void setType(final RESTContentSpecTypeV1 type) {
        this.type = type;
    }

    public RESTTagCollectionV1 getTags() {
        return tags;
    }

    public void setTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
    }

    public RESTTranslatedContentSpecCollectionV1 getTranslatedContentSpecs() {
        return translatedContentSpecs;
    }

    public void setTranslatedContentSpecs(final RESTTranslatedContentSpecCollectionV1 translatedContentSpecs) {
        this.translatedContentSpecs = translatedContentSpecs;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(final String errors) {
        this.errors = errors;
    }

    public String getFailedContentSpec() {
        return failedContentSpec;
    }

    public void setFailedContentSpec(final String failedContentSpec) {
        this.failedContentSpec = failedContentSpec;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseContentSpecV1)) return false;

        return super.equals(other);
    }
}
