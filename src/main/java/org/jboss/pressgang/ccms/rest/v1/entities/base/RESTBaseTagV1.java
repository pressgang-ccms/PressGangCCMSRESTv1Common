package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTCategoryInTagCollectionV1;

public abstract class RESTBaseTagV1<T extends RESTBaseTagV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>,
        V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String CATEGORIES_NAME = "categories";
    public static final String PARENT_TAGS_NAME = "parentTags";
    public static final String CHILD_TAGS_NAME = "childTags";
    public static final String PROJECTS_NAME = "projects";

    protected String name = null;
    protected String description = null;
    protected RESTCategoryInTagCollectionV1 categories = null;
    protected RESTTagCollectionV1 parentTags = null;
    protected RESTTagCollectionV1 childTags = null;
    protected RESTProjectCollectionV1 projects = null;

    public void cloneInto(final RESTBaseTagV1<?, ?, ?> clone, boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = this.name;
        clone.description = description;

        if (deepCopy) {
            if (this.categories != null) {
                clone.categories = new RESTCategoryInTagCollectionV1();
                this.categories.cloneInto(clone.categories, deepCopy);
            }

            if (this.parentTags != null) {
                clone.parentTags = new RESTTagCollectionV1();
                this.parentTags.cloneInto(clone.parentTags, deepCopy);
            }

            if (this.childTags != null) {
                clone.childTags = new RESTTagCollectionV1();
                this.childTags.cloneInto(clone.childTags, deepCopy);
            }

            if (this.projects != null) {
                clone.projects = new RESTProjectCollectionV1();
                this.projects.cloneInto(clone.projects, deepCopy);
            }
        } else {
            clone.categories = this.categories;
            clone.parentTags = this.parentTags;
            clone.childTags = this.childTags;
            clone.projects = this.projects;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public RESTCategoryInTagCollectionV1 getCategories() {
        return categories;
    }

    public void setCategories(final RESTCategoryInTagCollectionV1 categories) {
        this.categories = categories;
    }

    public RESTTagCollectionV1 getParentTags() {
        return parentTags;
    }

    public void setParentTags(final RESTTagCollectionV1 parentTags) {
        this.parentTags = parentTags;
    }

    public RESTTagCollectionV1 getChildTags() {
        return childTags;
    }

    public void setChildTags(final RESTTagCollectionV1 childTags) {
        this.childTags = childTags;
    }

    public RESTProjectCollectionV1 getProjects() {
        return projects;
    }

    public void setProjects(final RESTProjectCollectionV1 projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseTagV1)) return false;

        return super.equals(other);
    }
}
