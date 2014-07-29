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

public enum RESTXMLFormat {
    DOCBOOK_45(CommonConstants.DOCBOOK_45_TITLE),
    DOCBOOK_50(CommonConstants.DOCBOOK_50_TITLE);

    String commonName;

    /**
     * @param commonName The common name for the format
     */
    RESTXMLFormat(final String commonName) {
        this.commonName = commonName;
    }

    public String getCommonName() {
        return commonName;
    }

    public static RESTXMLFormat getXMLFormat(final int id) {
        switch (id) {
            case 0:
                return DOCBOOK_45;
            case 1:
                return DOCBOOK_50;
            default:
                return null;
        }
    }

    public static Integer getXMLFormatId(final RESTXMLFormat format) {
        if (format == null) return null;

        switch (format) {
            case DOCBOOK_45:
                return 0;
            case DOCBOOK_50:
                return 1;
            default:
                return null;
        }
    }


}
