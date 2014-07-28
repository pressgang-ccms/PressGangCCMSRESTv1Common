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

package org.jboss.pressgang.ccms.rest.v1.entities.join;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyTagInPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagInPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.IPropertyTagToPropertyCategoryV1;

public class RESTPropertyTagInPropertyCategoryV1 extends RESTBasePropertyTagV1<RESTPropertyTagInPropertyCategoryV1,
        RESTPropertyTagInPropertyCategoryCollectionV1, RESTPropertyTagInPropertyCategoryCollectionItemV1> implements
        IPropertyTagToPropertyCategoryV1 {
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static final String RELATIONSHIP_SORT_NAME = "propertyTagSort";

    private Integer relationshipId = null;
    private Integer relationshipSort = null;

    /**
     * A list of the Envers revision numbers
     */
    private RESTPropertyTagInPropertyCategoryCollectionV1 revisions = null;

    public RESTPropertyTagInPropertyCategoryV1() {

    }

    public RESTPropertyTagInPropertyCategoryV1(final RESTPropertyTagV1 propertyTag) {
        propertyTag.cloneInto(this, false);
    }

    @Override
    public RESTPropertyTagInPropertyCategoryCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTPropertyTagInPropertyCategoryCollectionV1 revisions) {
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
    public RESTPropertyTagInPropertyCategoryV1 clone(final boolean deepCopy) {
        final RESTPropertyTagInPropertyCategoryV1 retValue = new RESTPropertyTagInPropertyCategoryV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTPropertyTagInPropertyCategoryV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.relationshipId = relationshipId;
        clone.relationshipSort = relationshipSort;

        if (deepCopy) {
            if (getRevisions() != null) {
                clone.revisions = new RESTPropertyTagInPropertyCategoryCollectionV1();
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
        if (!(other instanceof RESTPropertyTagInPropertyCategoryV1)) return false;

        if (!super.equals(other)) return false;

        final RESTPropertyTagInPropertyCategoryV1 otherCasted = (RESTPropertyTagInPropertyCategoryV1) other;

        if (relationshipId == null && otherCasted.relationshipId == null) return true;

        if ((relationshipId == null || otherCasted.relationshipId == null)) return false;

        return relationshipId.equals(otherCasted.relationshipId);
    }

}
