package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

import org.jboss.pressgang.ccms.utils.constants.CommonConstants;

public enum RESTContentSpecTypeV1 {
    BOOK, ARTICLE;

    public static RESTContentSpecTypeV1 getContentSpecType(final int id) {
        switch (id) {
            case CommonConstants.CS_BOOK:
                return BOOK;
            case CommonConstants.CS_ARTICLE:
                return ARTICLE;
            default:
                return null;
        }
    }

    public static Integer getContentSpecTypeId(final RESTContentSpecTypeV1 csType) {
        if (csType == null) return null;

        switch (csType) {
            case BOOK:
                return CommonConstants.CS_BOOK;
            case ARTICLE:
                return CommonConstants.CS_ARTICLE;
            default:
                return null;
        }
    }
}
