package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

import org.jboss.pressgang.ccms.utils.constants.CommonConstants;

public enum RESTContentSpecTypeV1 {
    BOOK, ARTICLE, BOOK_DRAFT, ARTICLE_DRAFT;

    public static RESTContentSpecTypeV1 getContentSpecType(final Integer id) {
        switch (id) {
            case CommonConstants.CS_BOOK:
                return BOOK;
            case CommonConstants.CS_BOOK_DRAFT:
                return BOOK_DRAFT;
            case CommonConstants.CS_ARTICLE:
                return ARTICLE;
            case CommonConstants.CS_ARTICLE_DRAFT:
                return ARTICLE_DRAFT;
            default:
                return null;
        }
    }

    public static Integer getContentSpecTypeId(final RESTContentSpecTypeV1 csType) {
        if (csType == null) return null;

        switch (csType) {
            case BOOK:
                return CommonConstants.CS_BOOK;
            case BOOK_DRAFT:
                return CommonConstants.CS_BOOK_DRAFT;
            case ARTICLE:
                return CommonConstants.CS_ARTICLE;
            case ARTICLE_DRAFT:
                return CommonConstants.CS_ARTICLE_DRAFT;
            default:
                return null;
        }
    }
}
