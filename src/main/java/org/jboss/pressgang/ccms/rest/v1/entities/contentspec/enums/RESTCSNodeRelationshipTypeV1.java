package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

public enum RESTCSNodeRelationshipTypeV1 {
    PREREQUISITE, REFER_TO, LINK_LIST, NEXT, PREVIOUS;
    
    public static RESTCSNodeRelationshipTypeV1 getRelationshipType(final int id) {
        switch (id) {
            case 1: return PREREQUISITE;
            case 2: return REFER_TO;
            case 3: return LINK_LIST;
            case 4: return NEXT;
            case 5: return PREVIOUS;
            default: return null;
        }
    }
    
    public static Integer getRelationshipTypeId(final RESTCSNodeRelationshipTypeV1 relationshipType) {
        if (relationshipType == null) return null;
        
        switch (relationshipType) {
            case PREREQUISITE: return 1;
            case REFER_TO:  return 2;
            case LINK_LIST: return 3;
            case NEXT: return 4;
            case PREVIOUS: return 5;
            default: return null;
        }
    }
}