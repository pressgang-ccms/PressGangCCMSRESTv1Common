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

package org.jboss.pressgang.ccms.rest.v1.entities.join;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTAssignedPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.IJoinPropertyTagV1;

public class RESTAssignedPropertyTagV1 extends RESTBasePropertyTagV1<RESTAssignedPropertyTagV1, RESTAssignedPropertyTagCollectionV1,
        RESTAssignedPropertyTagCollectionItemV1> implements IJoinPropertyTagV1 {
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static String VALUE_NAME = "value";

    private Integer relationshipId = null;
    private String value = null;
    private boolean valid;

    /**
     * A list of the Envers revision numbers
     */
    private RESTAssignedPropertyTagCollectionV1 revisions = null;

    public RESTAssignedPropertyTagV1() {

    }

    public RESTAssignedPropertyTagV1(final RESTPropertyTagV1 propertyTag) {
        if (propertyTag != null) {
            propertyTag.cloneInto(this, false);
        }
    }

    @Override
    public RESTAssignedPropertyTagCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTAssignedPropertyTagCollectionV1 revisions) {
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
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(final String value) {
        this.value = value;
    }

    public void explicitSetValue(final String value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public boolean getValid() {
        return valid;
    }

    @Override
    public void setValid(final boolean valid) {
        this.valid = valid;
    }

    @Override
    public RESTAssignedPropertyTagV1 clone(final boolean deepCopy) {
        final RESTAssignedPropertyTagV1 retValue = new RESTAssignedPropertyTagV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTAssignedPropertyTagV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.relationshipId = relationshipId;
        clone.value = value;
        clone.valid = valid;

        if (deepCopy) {
            if (getRevisions() != null) {
                clone.revisions = new RESTAssignedPropertyTagCollectionV1();
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
        if (!(other instanceof RESTAssignedPropertyTagV1)) return false;

        if (!super.equals(other)) return false;

        final RESTAssignedPropertyTagV1 otherCasted = (RESTAssignedPropertyTagV1) other;

        if (relationshipId == null && otherCasted.relationshipId == null) return true;

        if ((relationshipId == null || otherCasted.relationshipId == null)) return false;

        return relationshipId.equals(otherCasted.relationshipId);
    }
}
