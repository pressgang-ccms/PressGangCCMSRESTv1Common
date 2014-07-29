/*
  Copyright 2011-2014 Red Hat

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

package org.jboss.pressgang.ccms.rest.v1.entities.join;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyCategoryInPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyCategoryInPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePropertyCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.IPropertyTagToPropertyCategoryV1;

public class RESTPropertyCategoryInPropertyTagV1 extends RESTBasePropertyCategoryV1<RESTPropertyCategoryInPropertyTagV1,
        RESTPropertyCategoryInPropertyTagCollectionV1, RESTPropertyCategoryInPropertyTagCollectionItemV1> implements
        IPropertyTagToPropertyCategoryV1 {
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static final String RELATIONSHIP_SORT_NAME = "propertyTagSort";

    private Integer relationshipId = null;
    private Integer relationshipSort = null;

    /**
     * A list of the Envers revision numbers
     */
    private RESTPropertyCategoryInPropertyTagCollectionV1 revisions = null;

    public RESTPropertyCategoryInPropertyTagV1() {

    }

    public RESTPropertyCategoryInPropertyTagV1(final RESTPropertyCategoryV1 category) {
        category.cloneInto(this, false);
    }

    @Override
    public RESTPropertyCategoryInPropertyTagCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTPropertyCategoryInPropertyTagCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public Integer getRelationshipId() {
        return relationshipId;
    }

    @Override
    public void setRelationshipId(final Integer relationshipId) {
        this.relationshipId = relationshipId;
    }

    public void explicitSetRelationshipId(final Integer relationshipId) {
        this.relationshipId = relationshipId;
        setParameterToConfigured(RELATIONSHIP_ID_NAME);
    }

    @Override
    public Integer getRelationshipSort() {
        return relationshipSort;
    }

    @Override
    public void setRelationshipSort(final Integer relationshipSort) {
        this.relationshipSort = relationshipSort;
    }

    public void explicitSetRelationshipSort(final Integer relationshipSort) {
        this.relationshipSort = relationshipSort;
        setParameterToConfigured(RELATIONSHIP_SORT_NAME);
    }

    @Override
    public RESTPropertyCategoryInPropertyTagV1 clone(final boolean deepCopy) {
        final RESTPropertyCategoryInPropertyTagV1 retValue = new RESTPropertyCategoryInPropertyTagV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTPropertyCategoryInPropertyTagV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.relationshipId = relationshipId;
        clone.relationshipSort = relationshipSort;

        if (deepCopy) {
            if (getRevisions() != null) {
                clone.revisions = new RESTPropertyCategoryInPropertyTagCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = revisions;
        }
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTPropertyCategoryInPropertyTagV1)) return false;

        if (!super.equals(other)) return false;

        final RESTPropertyCategoryInPropertyTagV1 otherCasted = (RESTPropertyCategoryInPropertyTagV1) other;

        if (relationshipId == null && otherCasted.relationshipId == null) return true;

        if ((relationshipId == null || otherCasted.relationshipId == null)) return false;

        return relationshipId.equals(otherCasted.relationshipId);
    }

}
