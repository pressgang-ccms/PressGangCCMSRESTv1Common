package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

public enum RESTCSNodeRelationshipTypeV1 {
    PREREQUISITE, REFER_TO, LINK_LIST, NEXT, PREVIOUS;
    
    public static RESTCSNodeRelationshipTypeV1 getRelationshipType(final int id) {
        switch (id) {
            case 0: return PREREQUISITE;
            case 1: return REFER_TO;
            case 2: return LINK_LIST;
            case 3: return NEXT;
            case 4: return PREVIOUS;
            default: return null;
        }
    }
    
    public static Integer getRelationshipTypeId(final RESTCSNodeRelationshipTypeV1 relationshipType) {
        if (relationshipType == null) return null;
        
        switch (relationshipType) {
            case PREREQUISITE: return 0;
            case REFER_TO:  return 1;
            case LINK_LIST: return 2;
            case NEXT: return 3;
            case PREVIOUS: return 4;
            default: return null;
        }
    }
}