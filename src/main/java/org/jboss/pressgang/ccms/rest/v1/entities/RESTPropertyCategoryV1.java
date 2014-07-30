/*
  Copyright 2011-2014 Red Hat, Inc

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagInPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePropertyCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryInPropertyTagV1;

public class RESTPropertyCategoryV1 extends RESTBasePropertyCategoryV1<RESTPropertyCategoryV1, RESTPropertyCategoryCollectionV1,
        RESTPropertyCategoryCollectionItemV1> {
    /**
     * A list of the Envers revision numbers
     */
    private RESTPropertyCategoryCollectionV1 revisions = null;

    public RESTPropertyCategoryV1() {

    }

    public RESTPropertyCategoryV1(final RESTPropertyCategoryInPropertyTagV1 propertyTagCategoryWithSort) {
        propertyTagCategoryWithSort.cloneInto(this, false);
    }

    @Override
    public RESTPropertyCategoryCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTPropertyCategoryCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTPropertyCategoryV1 clone(boolean deepCopy) {
        final RESTPropertyCategoryV1 retValue = new RESTPropertyCategoryV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTPropertyCategoryV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.description = description;
        clone.name = name;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTPropertyCategoryCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }  else {
                clone.revisions = null;
            }
        } else {
            clone.revisions = revisions;
        }
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public void explicitSetName(final String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTPropertyCategoryV1)) return false;

        return super.equals(other);
    }

    public void explicitSetPropertyTags(final RESTPropertyTagInPropertyCategoryCollectionV1 propertyTags) {
        this.propertyTags = propertyTags;
        setParameterToConfigured(PROPERTY_TAGS_NAME);
    }
}
