package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTContentSpecTypeV1;

public class RESTContentSpecV1 extends RESTBaseEntityWithPropertiesV1<RESTContentSpecV1, RESTContentSpecCollectionV1,
        RESTContentSpecCollectionItemV1> {

    public static final String LAST_PUBLISHED_NAME = "lastPublished";
    public static final String LOCALE_NAME = "locale";
    public static final String CHILDREN_NAME = "children_OTM";
    public static final String TYPE_NAME = "type";
    public static final String TAGS_NAME = "tags";
    public static final String CONDITION_NAME = "condition";
    public static final String TRANSLATED_CONTENT_SPECS_NAME = "translatedContentSpecs";
    public static final String TEXT_NAME = "text";

    private String locale = null;
    private String condition = null;
    private Date lastPublished = null;
    private Date lastModified = null;
    private String errors = null;
    private String failedContentSpec = null;
    private String text = null;
    private RESTContentSpecTypeV1 type = null;
    private RESTContentSpecCollectionV1 revisions = null;
    private RESTCSNodeCollectionV1 children_OTM = null;
    private RESTTagCollectionV1 tags = null;
    private RESTTranslatedContentSpecCollectionV1 translatedContentSpecs = null;

    @Override
    public RESTContentSpecCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTContentSpecCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTContentSpecV1 clone(final boolean deepCopy) {
        final RESTContentSpecV1 retValue = new RESTContentSpecV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTContentSpecV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = this.locale;
        clone.condition = this.condition;
        clone.lastPublished = this.lastPublished == null ? null : (Date) lastPublished.clone();
        clone.lastModified = this.lastModified == null ? null : (Date) lastModified.clone();
        clone.errors = this.errors;
        clone.failedContentSpec = this.failedContentSpec;
        clone.text = this.text;

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTContentSpecCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }

            if (this.children_OTM != null) {
                clone.children_OTM = new RESTCSNodeCollectionV1();
                this.children_OTM.cloneInto(clone.children_OTM, deepCopy);
            }

            if (this.tags != null) {
                clone.tags = new RESTTagCollectionV1();
                this.tags.cloneInto(clone.tags, deepCopy);
            }

            if (this.translatedContentSpecs != null) {
                clone.translatedContentSpecs = new RESTTranslatedContentSpecCollectionV1();
                this.translatedContentSpecs.cloneInto(clone.translatedContentSpecs, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
            clone.children_OTM = this.children_OTM;
            clone.tags = this.tags;
            clone.translatedContentSpecs = this.translatedContentSpecs;
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
    }

    public void explicitSetCondition(final String condition) {
        this.condition = condition;
        this.setParameterToConfigured(CONDITION_NAME);
    }

    public Date getLastPublished() {
        return lastPublished;
    }

    public void setLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
    }

    public void explicitSetLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
        this.setParameterToConfigured(LAST_PUBLISHED_NAME);
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

    public void explicitSetType(final RESTContentSpecTypeV1 type) {
        this.type = type;
        this.setParameterToConfigured(TYPE_NAME);
    }

    public RESTCSNodeCollectionV1 getChildren_OTM() {
        return children_OTM;
    }

    public void setChildren_OTM(final RESTCSNodeCollectionV1 children) {
        this.children_OTM = children;
    }

    public void explicitSetChildren_OTM(final RESTCSNodeCollectionV1 children) {
        this.children_OTM = children;
        this.setParameterToConfigured(CHILDREN_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        this.setParameterToConfigured(PROPERTIES_NAME);
    }

    public RESTTagCollectionV1 getTags() {
        return tags;
    }

    public void setTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
    }

    public void explicitSetTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
        this.setParameterToConfigured(TAGS_NAME);
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void explicitSetText(String text) {
        this.text = text;
        setParameterToConfigured(TEXT_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTContentSpecV1)) return false;

        return super.equals(other);
    }
}
