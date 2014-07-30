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

import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;

import static com.google.common.base.Preconditions.checkArgument;

public class ComponentProjectV1 {
    final RESTProjectV1 source;

    public ComponentProjectV1(final RESTProjectV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public boolean containsTag(final Integer tagId) {
        return containsTag(source, tagId);
    }

    public static boolean containsTag(final RESTProjectV1 source, final Integer tagId) {
        checkArgument(source != null, "The source parameter can not be null");

        if (tagId == null) return false;

        if (source.getTags() != null && source.getTags().getItems() != null) {
            for (final RESTTagCollectionItemV1 tagItem : source.getTags().getItems()) {
                final RESTTagV1 tag = tagItem.getItem();
                if (tag != null && tagId.equals(tag.getId()) && !tagItem.returnIsRemoveItem()) return true;
            }
        }

        return false;
    }
}
