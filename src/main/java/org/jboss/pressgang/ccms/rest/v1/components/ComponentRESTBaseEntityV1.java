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

package org.jboss.pressgang.ccms.rest.v1.components;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class ComponentRESTBaseEntityV1 {
    private final RESTBaseEntityV1 source;

    public ComponentRESTBaseEntityV1(final RESTBaseEntityV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public static boolean returnDirtyState(final List<? extends RESTBaseEntityV1> list) {
        checkArgument(list != null, "The list parameter can not be null");

        for (final RESTBaseEntityV1 entity : list) {
            if (entity.returnDirtyState()) return true;
        }

        return false;
    }

    public static boolean returnDirtyStateForCollectionItems(final List<? extends RESTBaseEntityCollectionItemV1> list) {
        checkArgument(list != null, "The list parameter can not be null");

        for (final RESTBaseEntityCollectionItemV1 entity : list) {
            if (entity.getItem().returnDirtyState()) return true;
        }

        return false;
    }
}
