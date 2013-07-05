package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTextContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTextContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseContentSpecV1;

public class RESTTextContentSpecV1 extends RESTBaseContentSpecV1<RESTTextContentSpecV1, RESTTextContentSpecCollectionV1,
        RESTTextContentSpecCollectionItemV1> {
    public static final String TEXT_NAME = "text";

    private String title = null;
    private String text = null;
    private RESTTextCSProcessingOptionsV1 processingOptions = null;
    private RESTTextContentSpecCollectionV1 revisions = null;

    @Override
    public RESTTextContentSpecCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTextContentSpecCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTextContentSpecV1 clone(final boolean deepCopy) {
        final RESTTextContentSpecV1 retValue = new RESTTextContentSpecV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTextContentSpecV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.title = this.title;
        clone.text = this.text;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTTextContentSpecCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }

            if (processingOptions != null) {
                clone.processingOptions = processingOptions.clone(deepCopy);
            }
        } else {
            clone.revisions = revisions;
            clone.processingOptions = processingOptions;
        }
    }

    public void explicitSetLocale(final String locale) {
        this.locale = locale;
        setParameterToConfigured(LOCALE_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        setParameterToConfigured(PROPERTIES_NAME);
    }

    public void explicitSetTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
        setParameterToConfigured(TAGS_NAME);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTextContentSpecV1)) return false;

        return super.equals(other);
    }

    public RESTTextCSProcessingOptionsV1 getProcessingOptions() {
        return processingOptions;
    }

    public void setProcessingOptions(RESTTextCSProcessingOptionsV1 processingOptions) {
        this.processingOptions = processingOptions;
    }
}
