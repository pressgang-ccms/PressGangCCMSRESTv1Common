package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join.RESTCSRelatedNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTCSRelatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeRelationshipTypeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.base.ICSNodeToCSNodeV1;

public class RESTCSRelatedNodeV1 extends RESTBaseCSNodeV1<RESTCSRelatedNodeV1, RESTCSRelatedNodeCollectionV1,
        RESTCSRelatedNodeCollectionItemV1> implements ICSNodeToCSNodeV1 {
    public static final String RELATIONSHIP_TYPE_NAME = "relationshipType";

    private Integer relationshipId = null;
    private RESTCSNodeRelationshipTypeV1 relationshipType = null;
    private RESTCSRelatedNodeCollectionV1 revisions = null;

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

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCSRelatedNodeV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.relationshipType = this.relationshipType;
        clone.relationshipId = this.relationshipId;

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTCSRelatedNodeCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
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
        this.setParameterToConfigured(RELATIONSHIP_TYPE_NAME);
    }

    @Override
    public Integer getRelationshipId() {
        return relationshipId;
    }

    @Override
    public void setRelationshipId(final Integer relationshipId) {
        this.relationshipId = relationshipId;
    }
}
