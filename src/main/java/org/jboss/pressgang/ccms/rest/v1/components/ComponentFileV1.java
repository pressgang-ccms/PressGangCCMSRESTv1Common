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

package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTFileV1;

public class ComponentFileV1 {
    private final RESTFileV1 source;

    public ComponentFileV1(final RESTFileV1 source) {
        this.source = source;
    }

    public boolean isArchive() {
        return isArchive(source);
    }

    public static boolean isArchive(final RESTFileV1 source) {
        final String extension = getExtension(source);
        if ("zip".equalsIgnoreCase(extension)) {
            return true;
        } else {
            return false;
        }
    }

    public String getExtension() {
        return getExtension(source);
    }

    public static String getExtension(final RESTFileV1 source) {
        if (source.getFileName() != null) {
            final int lastPeriodIndex = source.getFileName().lastIndexOf(".");
            if (lastPeriodIndex != -1 && lastPeriodIndex < source.getFileName().length() - 1) {
                return source.getFileName().substring(lastPeriodIndex + 1);
            }
        }

        return null;
    }
}
