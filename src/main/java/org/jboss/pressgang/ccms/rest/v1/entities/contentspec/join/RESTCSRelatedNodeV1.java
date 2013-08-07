package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join.RESTCSRelatedNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTCSRelatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeRelationshipTypeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.base.ICSNodeToCSNodeV1;

public class RESTCSRelatedNodeV1 extends RESTBaseCSNodeV1<RESTCSRelatedNodeV1, RESTCSRelatedNodeCollectionV1,
        RESTCSRelatedNodeCollectionItemV1> implements ICSNodeToCSNodeV1 {
    public static final String RELATIONSHIP_TYPE_NAME = "relationshipType";
    public static final String RELATIONSHIP_SORT_NAME = "relationshipSort";

    private Integer relationshipId = null;
    private RESTCSNodeRelationshipTypeV1 relationshipType = null;
    private Integer relationshipSort = null;
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
