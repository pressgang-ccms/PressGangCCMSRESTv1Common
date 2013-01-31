package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProjectCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTProjectV1 extends RESTBasePrimaryEntityV1<RESTProjectV1, RESTProjectCollectionV1, RESTProjectCollectionItemV1> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String TAGS_NAME = "tags";

    private String name = null;
    private String description = null;
    private RESTTagCollectionV1 tags = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTProjectCollectionV1 revisions = null;

    @Override
    public RESTProjectCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTProjectCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTProjectV1 clone(boolean deepCopy) {
        final RESTProjectV1 retValue = new RESTProjectV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTProjectV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = this.name;
        clone.description = description;

        if (deepCopy) {
            if (this.tags != null) {
                clone.tags = new RESTTagCollectionV1();
                this.tags.cloneInto(clone.tags, deepCopy);
            }

            if (this.revisions != null) {
                clone.revisions = new RESTProjectCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.tags = this.tags;
            clone.revisions = this.revisions;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void explicitSetName(final String name) {
        this.name = name;
        this.setParameterToConfigured(NAME_NAME);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        this.setParameterToConfigured(DESCRIPTION_NAME);
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

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTProjectV1)) return false;

        return super.equals(other);
    }
}
