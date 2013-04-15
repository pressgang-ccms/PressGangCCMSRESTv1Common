package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

import org.jboss.pressgang.ccms.utils.constants.CommonConstants;

public enum RESTCSNodeRelationshipTypeV1 {
    PREREQUISITE, REFER_TO, LINK_LIST, NEXT, PREVIOUS;

    public static RESTCSNodeRelationshipTypeV1 getRelationshipType(final int id) {
        switch (id) {
            case CommonConstants.CS_RELATIONSHIP_PREREQUISITE:
                return PREREQUISITE;
            case CommonConstants.CS_RELATIONSHIP_REFER_TO:
                return REFER_TO;
            case CommonConstants.CS_RELATIONSHIP_LINK_LIST:
                return LINK_LIST;
            case CommonConstants.CS_RELATIONSHIP_NEXT:
                return NEXT;
            case CommonConstants.CS_RELATIONSHIP_PREVIOUS:
                return PREVIOUS;
            default:
                return null;
        }
    }

    public static Integer getRelationshipTypeId(final RESTCSNodeRelationshipTypeV1 relationshipType) {
        if (relationshipType == null) return null;

        switch (relationshipType) {
            case PREREQUISITE:
                return CommonConstants.CS_RELATIONSHIP_PREREQUISITE;
            case REFER_TO:
                return CommonConstants.CS_RELATIONSHIP_REFER_TO;
            case LINK_LIST:
                return CommonConstants.CS_RELATIONSHIP_LINK_LIST;
            case NEXT:
                return CommonConstants.CS_RELATIONSHIP_NEXT;
            case PREVIOUS:
                return CommonConstants.CS_RELATIONSHIP_PREVIOUS;
            default:
                return null;
        }
    }
}