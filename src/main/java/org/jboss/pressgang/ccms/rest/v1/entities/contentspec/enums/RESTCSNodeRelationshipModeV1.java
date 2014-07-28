/*
  Copyright 2011-2014 Red Hat

  This file is part of PresGang CCMS.

  PresGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PresGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PresGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums;

import org.jboss.pressgang.ccms.utils.constants.CommonConstants;

public enum RESTCSNodeRelationshipModeV1 {
    ID, TARGET;

    public static RESTCSNodeRelationshipModeV1 getRelationshipMode(final int id) {
        switch (id) {
            case CommonConstants.CS_RELATIONSHIP_MODE_ID:
                return ID;
            case CommonConstants.CS_RELATIONSHIP_MODE_TARGET:
                return TARGET;
            default:
                return null;
        }
    }

    public static Integer getRelationshipModeId(final RESTCSNodeRelationshipModeV1 relationshipMode) {
        if (relationshipMode == null) return null;

        switch (relationshipMode) {
            case ID:
                return CommonConstants.CS_RELATIONSHIP_MODE_ID;
            case TARGET:
                return CommonConstants.CS_RELATIONSHIP_MODE_TARGET;
            default:
                return null;
        }
    }
}