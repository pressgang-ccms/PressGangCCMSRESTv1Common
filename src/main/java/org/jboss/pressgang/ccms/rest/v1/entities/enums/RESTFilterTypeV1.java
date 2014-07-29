/*
  Copyright 2011-2014 Red Hat

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

package org.jboss.pressgang.ccms.rest.v1.entities.enums;

import org.jboss.pressgang.ccms.utils.constants.CommonConstants;

public enum RESTFilterTypeV1 {
    TOPIC, CONTENT_SPEC;

    public static RESTFilterTypeV1 getFilterType(final Integer id) {
        switch (id) {
            case CommonConstants.FILTER_TOPIC:
                return TOPIC;
            case CommonConstants.FILTER_CONTENT_SPEC:
                return CONTENT_SPEC;
            default:
                return null;
        }
    }

    public static Integer getFilterTypeId(final RESTFilterTypeV1 type) {
        if (type == null) return null;

        switch (type) {
            case TOPIC:
                return CommonConstants.FILTER_TOPIC;
            case CONTENT_SPEC:
                return CommonConstants.FILTER_CONTENT_SPEC;
            default:
                return null;
        }
    }
}
