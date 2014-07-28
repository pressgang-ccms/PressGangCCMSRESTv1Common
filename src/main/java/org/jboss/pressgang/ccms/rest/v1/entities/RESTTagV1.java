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

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTagV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTTagCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
            clone.revisions = this.revisions;
        }
    }

    public void explicitSetName(final String name) {
        this.name = name;
        this.setParameterToConfigured(NAME_NAME);
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        this.setParameterToConfigured(DESCRIPTION_NAME);
    }

    public void explicitSetCategories(final RESTCategoryInTagCollectionV1 categories) {
        this.categories = categories;
        this.setParameterToConfigured(CATEGORIES_NAME);
    }

    public void explicitSetParentTags(final RESTTagCollectionV1 parentTags) {
        this.parentTags = parentTags;
        this.setParameterToConfigured(PARENT_TAGS_NAME);
    }

    public void explicitSetChildTags(final RESTTagCollectionV1 childTags) {
        this.childTags = childTags;
        this.setParameterToConfigured(CHILD_TAGS_NAME);
    }

    public void explicitSetProjects(final RESTProjectCollectionV1 projects) {
        this.projects = projects;
        this.setParameterToConfigured(PROJECTS_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        this.setParameterToConfigured(PROPERTIES_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTagV1)) return false;

        return super.equals(other);
    }
}
