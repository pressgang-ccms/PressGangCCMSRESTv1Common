package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseContentSpecV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTContentSpecTypeV1;

public class RESTContentSpecV1 extends RESTBaseContentSpecV1<RESTContentSpecV1, RESTContentSpecCollectionV1,
        RESTContentSpecCollectionItemV1> {
    public static final String CHILDREN_NAME = "children_OTM";
    public static final String CONDITION_NAME = "condition";
    public static final String BOOK_TAGS_NAME = "bookTags";

    private String condition = null;
    protected RESTTagCollectionV1 bookTags = null;
    private RESTContentSpecCollectionV1 revisions = null;
    private RESTCSNodeCollectionV1 children_OTM = null;

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

        clone.condition = this.condition;

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTContentSpecCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }

            if (bookTags != null) {
                clone.bookTags = new RESTTagCollectionV1();
                bookTags.cloneInto(clone.bookTags, deepCopy);
            }

            if (this.children_OTM != null) {
                clone.children_OTM = new RESTCSNodeCollectionV1();
                this.children_OTM.cloneInto(clone.children_OTM, deepCopy);
            }
        } else {
            clone.revisions = revisions;
            clone.bookTags = bookTags;
            clone.children_OTM = children_OTM;
        }
    }

    public void explicitSetLocale(final String locale) {
        this.locale = locale;
        setParameterToConfigured(LOCALE_NAME);
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
    }

    public void explicitSetCondition(final String condition) {
        this.condition = condition;
        setParameterToConfigured(CONDITION_NAME);
    }

    public void explicitSetLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
        setParameterToConfigured(LAST_PUBLISHED_NAME);
    }

    public void explicitSetType(final RESTContentSpecTypeV1 type) {
        this.type = type;
        setParameterToConfigured(TYPE_NAME);
    }

    public RESTCSNodeCollectionV1 getChildren_OTM() {
        return children_OTM;
    }

    public void setChildren_OTM(final RESTCSNodeCollectionV1 children_OTM) {
        this.children_OTM = children_OTM;
    }

    public void explicitSetChildren_OTM(final RESTCSNodeCollectionV1 children_OTM) {
        this.children_OTM = children_OTM;
        setParameterToConfigured(CHILDREN_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        setParameterToConfigured(PROPERTIES_NAME);
    }

    public void explicitSetTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
        setParameterToConfigured(TAGS_NAME);
    }

    public RESTTagCollectionV1 getBookTags() {
        return bookTags;
    }

    public void setBookTags(final RESTTagCollectionV1 bookTags) {
        this.bookTags = bookTags;
    }
    public void explicitSetBookTags(final RESTTagCollectionV1 bookTags) {
        this.bookTags = bookTags;
        setParameterToConfigured(BOOK_TAGS_NAME);
    }


    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTContentSpecV1)) return false;

        return super.equals(other);
    }
}
