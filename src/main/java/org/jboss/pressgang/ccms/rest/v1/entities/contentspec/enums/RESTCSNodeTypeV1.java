package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

import org.jboss.pressgang.ccms.utils.constants.CommonConstants;

public enum RESTCSNodeTypeV1 {
    TOPIC, SECTION, CHAPTER, APPENDIX, PART, PROCESS, COMMENT, META_DATA;

    public static RESTCSNodeTypeV1 getNodeType(final int id) {
        switch (id) {
            case CommonConstants.CS_NODE_TOPIC:
                return TOPIC;
            case CommonConstants.CS_NODE_SECTION:
                return SECTION;
            case CommonConstants.CS_NODE_CHAPTER:
                return CHAPTER;
            case CommonConstants.CS_NODE_APPENDIX:
                return APPENDIX;
            case CommonConstants.CS_NODE_PART:
                return PART;
            case CommonConstants.CS_NODE_PROCESS:
                return PROCESS;
            case CommonConstants.CS_NODE_COMMENT:
                return COMMENT;
            case CommonConstants.CS_NODE_META_DATA:
                return META_DATA;
            default:
                return null;
        }
    }

    public static Integer getNodeTypeId(final RESTCSNodeTypeV1 nodeType) {
        if (nodeType == null) return null;

        switch (nodeType) {
            case TOPIC:
                return CommonConstants.CS_NODE_TOPIC;
            case SECTION:
                return CommonConstants.CS_NODE_SECTION;
            case CHAPTER:
                return CommonConstants.CS_NODE_CHAPTER;
            case APPENDIX:
                return CommonConstants.CS_NODE_APPENDIX;
            case PART:
                return CommonConstants.CS_NODE_PART;
            case PROCESS:
                return CommonConstants.CS_NODE_PROCESS;
            case COMMENT:
                return CommonConstants.CS_NODE_COMMENT;
            case META_DATA:
                return CommonConstants.CS_NODE_META_DATA;
            default:
                return null;
        }
    }
}
