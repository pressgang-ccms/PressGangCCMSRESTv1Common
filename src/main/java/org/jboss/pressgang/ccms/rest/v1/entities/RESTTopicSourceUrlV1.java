package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTopicSourceUrlCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTTopicSourceUrlV1 extends RESTBaseEntityV1<RESTTopicSourceUrlV1, RESTTopicSourceUrlCollectionV1,
        RESTTopicSourceUrlCollectionItemV1> {
    public static final String URL_NAME = "url";
    public static final String DESCRIPTION_NAME = "description";
    public static final String TITLE_NAME = "title";

    private String url = null;
    private String title = null;
    private String description = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTTopicSourceUrlCollectionV1 revisions = null;

    @Override
    public RESTTopicSourceUrlCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTopicSourceUrlCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTopicSourceUrlV1 clone(boolean deepCopy) {
        final RESTTopicSourceUrlV1 retValue = new RESTTopicSourceUrlV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTopicSourceUrlV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.url = url;
        clone.description = description;
        clone.title = title;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTTopicSourceUrlCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = revisions;
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void explicitSetUrl(final String url) {
        this.url = url;
        setParameterToConfigured(URL_NAME);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void explicitSetTitle(final String title) {
        this.title = title;
        setParameterToConfigured(TITLE_NAME);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTopicSourceUrlV1)) return false;

        return super.equals(other);
    }
}
