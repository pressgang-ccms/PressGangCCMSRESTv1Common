package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

public enum RESTCSNodeTypeV1 {
    TOPIC, SECTION, CHAPTER, APPENDIX, PART, PROCESS, COMMENT;
    
    public static RESTCSNodeTypeV1 getNodeType(final int id) {
        switch (id) {
            case 1: return TOPIC;
            case 2: return SECTION;
            case 3: return CHAPTER;
            case 4: return APPENDIX;
            case 5: return PART;
            case 6: return PROCESS;
            case 7: return COMMENT;
            default: return null;
        }
    }
    
    public static Integer getNodeTypeId(final RESTCSNodeTypeV1 nodeType) {
        if (nodeType == null) return null;
        
        switch (nodeType) {
            case TOPIC: return 1;
            case SECTION: return 2;
            case CHAPTER: return 3;
            case APPENDIX: return 4;
            case PART: return 5;
            case PROCESS: return 6;
            case COMMENT: return 7;
            default: return null;
        }
    }
}
