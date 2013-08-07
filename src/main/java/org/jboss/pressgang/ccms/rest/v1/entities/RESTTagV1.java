package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTCategoryInTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTTagInCategoryV1;

public class RESTTagV1 extends RESTBaseTagV1<RESTTagV1, RESTTagCollectionV1, RESTTagCollectionItemV1> {
    /**
     * A list of the Envers revision numbers
     */
    private RESTTagCollectionV1 revisions = null;

    public RESTTagV1() {

    }

    public RESTTagV1(final RESTTagInCategoryV1 tagCategory) {
        tagCategory.cloneInto(this, false);
    }

    @Override
    public RESTTagCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTagCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTagV1 clone(boolean deepCopy) {
        final RESTTagV1 retValue = new RESTTagV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTagV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTTagCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = revisions;
        }
    }

    public void explicitSetName(final String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public void explicitSetCategories(final RESTCategoryInTagCollectionV1 categories) {
        this.categories = categories;
        setParameterToConfigured(CATEGORIES_NAME);
    }

    public void explicitSetParentTags(final RESTTagCollectionV1 parentTags) {
        this.parentTags = parentTags;
        setParameterToConfigured(PARENT_TAGS_NAME);
    }

    public void explicitSetChildTags(final RESTTagCollectionV1 childTags) {
        this.childTags = childTags;
        setParameterToConfigured(CHILD_TAGS_NAME);
    }

    public void explicitSetProjects(final RESTProjectCollectionV1 projects) {
        this.projects = projects;
        setParameterToConfigured(PROJECTS_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        setParameterToConfigured(PROPERTIES_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTagV1)) return false;

        return super.equals(other);
    }
}
