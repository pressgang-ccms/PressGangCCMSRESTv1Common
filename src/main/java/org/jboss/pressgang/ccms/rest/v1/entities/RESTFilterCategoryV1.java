package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTFilterCategoryV1 extends RESTBaseEntityV1<RESTFilterCategoryV1, RESTFilterCategoryCollectionV1,
        RESTFilterCategoryCollectionItemV1> {
    public static final String CATEGORY_NAME = "category";
    public static final String PROJECT_NAME = "project";
    public static final String STATE_NAME = "state";
    public static final String FILTER_NAME = "filter";

    private RESTCategoryV1 category = null;
    private RESTProjectV1 project = null;
    private Integer state = null;
    private RESTFilterV1 filter = null;

    private RESTFilterCategoryCollectionV1 revisions = null;

    @Override
    public RESTFilterCategoryCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterCategoryCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterCategoryV1 clone(boolean deepCopy) {
        final RESTFilterCategoryV1 retValue = new RESTFilterCategoryV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTFilterCategoryV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.state = this.state;

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTFilterCategoryCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }

            if (this.project != null) {
                clone.project = this.project.clone(deepCopy);
            }

            if (this.category != null) {
                clone.category = this.category.clone(deepCopy);
            }

            if (this.filter != null) {
                clone.filter = this.filter.clone(deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
            clone.category = this.category;
            clone.project = this.project;
            clone.filter = this.filter;
        }
    }

    public RESTCategoryV1 getCategory() {
        return category;
    }

    public void setCategory(final RESTCategoryV1 category) {
        this.category = category;
    }

    public void explicitSetCategory(final RESTCategoryV1 category) {
        this.category = category;
        this.setParameterToConfigured(CATEGORY_NAME);
    }

    public RESTProjectV1 getProject() {
        return project;
    }

    public void setProject(final RESTProjectV1 project) {
        this.project = project;
    }

    public void explicitSetProject(final RESTProjectV1 project) {
        this.project = project;
        this.setParameterToConfigured(PROJECT_NAME);
    }

    public Integer getState() {
        return state;
    }

    public void setState(final Integer state) {
        this.state = state;
    }

    public void explicitSetState(final Integer state) {
        this.state = state;
        this.setParameterToConfigured(STATE_NAME);
    }

    public RESTFilterV1 getFilter() {
        return filter;
    }

    public void setFilter(final RESTFilterV1 filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTFilterCategoryV1)) return false;

        return super.equals(other);
    }
}
