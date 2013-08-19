package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTTagInCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryInTagV1;

public class RESTCategoryV1 extends RESTBaseCategoryV1<RESTCategoryV1, RESTCategoryCollectionV1, RESTCategoryCollectionItemV1> {
    /**
     * A list of the Envers revision numbers
     */
    private RESTCategoryCollectionV1 revisions = null;

    public RESTCategoryV1() {

    }

    public RESTCategoryV1(final RESTCategoryInTagV1 categoryTag) {
        categoryTag.cloneInto(this, false);
    }

    @Override
    public RESTCategoryCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTCategoryCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCategoryV1 clone(boolean deepCopy) {
        final RESTCategoryV1 retValue = new RESTCategoryV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCategoryV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (getRevisions() != null) {
                clone.revisions = new RESTCategoryCollectionV1();
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

    public void setSortExplicit(final Integer sort) {
        this.sort = sort;
        setParameterToConfigured(SORT_NAME);
    }

    public void explicitSetMutuallyExclusive(final boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        setParameterToConfigured(MUTUALLYEXCLUSIVE_NAME);
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public void explicitSetTags(final RESTTagInCategoryCollectionV1 tags) {
        this.tags = tags;
        setParameterToConfigured(TAGS_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTCategoryV1)) return false;

        return super.equals(other);
    }
}
