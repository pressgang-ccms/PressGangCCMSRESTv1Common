package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.base;

import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeRelationshipTypeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.IBaseJoinEntityV1;

public interface ICSNodeToCSNodeV1 extends IBaseJoinEntityV1 {

    public RESTCSNodeRelationshipTypeV1 getRelationshipType();

    public void setRelationshipType(final RESTCSNodeRelationshipTypeV1 relationshipType);
}
