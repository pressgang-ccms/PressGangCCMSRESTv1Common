package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

public enum RESTContentSpecTypeV1 {
    BOOK, ARTICLE;
    
    public static RESTContentSpecTypeV1 getContentSpecType(final int id) {
        switch (id) {
            case 1: return BOOK;
            case 2: return ARTICLE;
            default: return null;
        }
    }
    
    public static Integer getContentSpecTypeId(final RESTContentSpecTypeV1 csType) {
        if (csType == null) return null;
        
        switch (csType) {
            case BOOK: return 1;
            case ARTICLE: return 2;
            default: return null;
        }
    }
}
