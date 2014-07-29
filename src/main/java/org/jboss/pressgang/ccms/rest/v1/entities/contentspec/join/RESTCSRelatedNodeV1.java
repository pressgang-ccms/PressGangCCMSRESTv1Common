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

package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join.RESTCSRelatedNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTCSRelatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeRelationshipModeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeRelationshipTypeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.base.ICSNodeToCSNodeV1;

public class RESTCSRelatedNodeV1 extends RESTBaseCSNodeV1<RESTCSRelatedNodeV1, RESTCSRelatedNodeCollectionV1,
        RESTCSRelatedNodeCollectionItemV1> implements ICSNodeToCSNodeV1 {
    public static final String RELATIONSHIP_TYPE_NAME = "relationshipType";
    public static final String RELATIONSHIP_SORT_NAME = "relationshipSort";
    public static final String RELATIONSHIP_MODE_NAME = "relationshipMode";

    private Integer relationshipId = null;
    private RESTCSNodeRelationshipTypeV1 relationshipType = null;
    private Integer relationshipSort = null;
    private RESTCSNodeRelationshipModeV1 relationshipMode = null;
    private RESTCSRelatedNodeCollectionV1 revisions = null;

    public RESTCSRelatedNodeV1() {

    }

    public RESTCSRelatedNodeV1(final RESTCSNodeV1 node) {
        if (node != null) {
            node.cloneInto(this, true);
        }
    }

    @Override
    public RESTCSRelatedNodeCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTCSRelatedNodeCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCSRelatedNodeV1 clone(boolean deepCopy) {
        final RESTCSRelatedNodeV1 retValue = new RESTCSRelatedNodeV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCSRelatedNodeV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.relationshipType = relationshipType;
        clone.relationshipId = relationshipId;
        clone.relationshipSort = relationshipSort;
        clone.relationshipMode = relationshipMode;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTCSRelatedNodeCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = revisions;
        }
    }

    @Override
    public RESTCSNodeRelationshipTypeV1 getRelationshipType() {
        return relationshipType;
    }

    @Override
    public void setRelationshipType(final RESTCSNodeRelationshipTypeV1 relationshipType) {
        this.relationshipType = relationshipType;
    }

    public void explicitSetRelationshipType(final RESTCSNodeRelationshipTypeV1 relationshipType) {
        this.relationshipType = relationshipType;
        setParameterToConfigured(RELATIONSHIP_TYPE_NAME);
    }

    @Override
    public Integer getRelationshipId() {
        return relationshipId;
    }

    @Override
    public void setRelationshipId(final Integer relationshipId) {
        this.relationshipId = relationshipId;
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


    public RESTCSNodeRelationshipModeV1 getRelationshipMode() {
        return relationshipMode;
    }

    public void setRelationshipMode(RESTCSNodeRelationshipModeV1 relationshipMode) {
        this.relationshipMode = relationshipMode;
    }

    public void explicitSetRelationshipMode(RESTCSNodeRelationshipModeV1 relationshipMode) {
        this.relationshipMode = relationshipMode;
        setParameterToConfigured(RELATIONSHIP_MODE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTCSRelatedNodeV1)) return false;

        if (!super.equals(other)) return false;

        final RESTCSRelatedNodeV1 otherCasted = (RESTCSRelatedNodeV1) other;

        if (relationshipId == null && otherCasted.relationshipId == null) return true;

        if ((relationshipId == null || otherCasted.relationshipId == null)) return false;

        return relationshipId.equals(otherCasted.relationshipId);
    }
}
