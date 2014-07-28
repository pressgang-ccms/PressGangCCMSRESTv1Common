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

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyCategoryInPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryInPropertyTagV1;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Contains useful functions that run against a RESTPropertyTagV1, but which are not included in the RESTPropertyTagV1
 * class to prevent possible contamination with non GWT compatible code.
 */
public final class ComponentPropertyTagV1 {
    final RESTPropertyTagV1 source;

    public ComponentPropertyTagV1(final RESTPropertyTagV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public boolean containsTag(final Integer tagId) {
        return isInCategory(source, tagId);
    }

    public static boolean isInCategory(final RESTPropertyTagV1 source, final Integer childId) {
        checkArgument(source != null, "The source parameter can not be null");

        if (childId == null) return false;

        if (source.getPropertyCategories() != null && source.getPropertyCategories().getItems() != null) {
            for (final RESTPropertyCategoryInPropertyTagCollectionItemV1 childItem : source.getPropertyCategories().getItems()) {
                final RESTPropertyCategoryInPropertyTagV1 child = childItem.getItem();
                if (child != null && childId.equals(child.getId()) && !childItem.returnIsRemoveItem()) return true;
            }
        }

        return false;
    }
}
