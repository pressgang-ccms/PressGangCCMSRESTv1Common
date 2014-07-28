/*
  Copyright 2011-2014 Red Hat

  This file is part of PresGang CCMS.

  PresGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PresGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PresGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTCategoryInTagCollectionV1;

public abstract class RESTBaseTagV1<T extends RESTBaseTagV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {
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
            } else {
                clone.categories = null;
            }

            if (this.parentTags != null) {
                clone.parentTags = new RESTTagCollectionV1();
                this.parentTags.cloneInto(clone.parentTags, deepCopy);
            } else {
                clone.parentTags = null;
            }

            if (this.childTags != null) {
                clone.childTags = new RESTTagCollectionV1();
                this.childTags.cloneInto(clone.childTags, deepCopy);
            } else {
                clone.childTags = null;
            }

            if (this.projects != null) {
                clone.projects = new RESTProjectCollectionV1();
                this.projects.cloneInto(clone.projects, deepCopy);
            } else {
                clone.projects = null;
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
