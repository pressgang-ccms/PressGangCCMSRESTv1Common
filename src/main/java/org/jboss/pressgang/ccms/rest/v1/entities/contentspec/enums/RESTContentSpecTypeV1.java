/*
  Copyright 2011-2014 Red Hat, Inc

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

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
