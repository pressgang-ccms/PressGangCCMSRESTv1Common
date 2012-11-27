package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

public enum RESTCSNodeTypeV1 {
    TOPIC, SECTION, CHAPTER, APPENDIX, PART, PROCESS, COMMENT;
    
    public static RESTCSNodeTypeV1 getNodeType(final int id) {
        switch (id) {
            case 0: return TOPIC;
            case 1: return SECTION;
            case 2: return CHAPTER;
            case 3: return APPENDIX;
            case 4: return PART;
            case 5: return PROCESS;
            case 6: return COMMENT;
            default: return null;
        }
    }
    
    public static Integer getNodeTypeId(final RESTCSNodeTypeV1 nodeType) {
        if (nodeType == null) return null;
        
        switch (nodeType) {
            case TOPIC: return 0;
            case SECTION: return 1;
            case CHAPTER: return 2;
            case APPENDIX: return 3;
            case PART: return 4;
            case PROCESS: return 5;
            case COMMENT: return 6;
            default: return null;
        }
    }
}
