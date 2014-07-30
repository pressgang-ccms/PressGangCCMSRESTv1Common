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

public enum RESTCSNodeRelationshipTypeV1 {
    PREREQUISITE, REFER_TO, LINK_LIST, NEXT, PREVIOUS;

    public static RESTCSNodeRelationshipTypeV1 getRelationshipType(final int id) {
        switch (id) {
            case CommonConstants.CS_RELATIONSHIP_PREREQUISITE:
                return PREREQUISITE;
            case CommonConstants.CS_RELATIONSHIP_REFER_TO:
                return REFER_TO;
            case CommonConstants.CS_RELATIONSHIP_LINK_LIST:
                return LINK_LIST;
            case CommonConstants.CS_RELATIONSHIP_NEXT:
                return NEXT;
            case CommonConstants.CS_RELATIONSHIP_PREVIOUS:
                return PREVIOUS;
            default:
                return null;
        }
    }

    public static Integer getRelationshipTypeId(final RESTCSNodeRelationshipTypeV1 relationshipType) {
        if (relationshipType == null) return null;

        switch (relationshipType) {
            case PREREQUISITE:
                return CommonConstants.CS_RELATIONSHIP_PREREQUISITE;
            case REFER_TO:
                return CommonConstants.CS_RELATIONSHIP_REFER_TO;
            case LINK_LIST:
                return CommonConstants.CS_RELATIONSHIP_LINK_LIST;
            case NEXT:
                return CommonConstants.CS_RELATIONSHIP_NEXT;
            case PREVIOUS:
                return CommonConstants.CS_RELATIONSHIP_PREVIOUS;
            default:
                return null;
        }
    }
}