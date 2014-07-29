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

package org.jboss.pressgang.ccms.rest.v1.components;

import static com.google.common.base.Preconditions.checkArgument;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyTagInPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyTagInPropertyCategoryV1;

/**
 * Contains useful functions that run against a RESTPropertyCategoryV1, but which are not included in the RESTPropertyCategoryV1
 * class to prevent possible contamination with non GWT compatible code.
 */
public final class ComponentPropertyCategoryV1 {
    final RESTPropertyCategoryV1 source;

    public ComponentPropertyCategoryV1(final RESTPropertyCategoryV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public boolean containsTag(final Integer tagId) {
        return isInCategory(source, tagId);
    }

    public static boolean isInCategory(final RESTPropertyCategoryV1 source, final Integer childId) {
        checkArgument(source != null, "The source parameter can not be null");

        if (childId == null) return false;

        if (source.getPropertyTags() != null && source.getPropertyTags().getItems() != null) {
            for (final RESTPropertyTagInPropertyCategoryCollectionItemV1 childItem : source.getPropertyTags().getItems()) {
                final RESTPropertyTagInPropertyCategoryV1 child = childItem.getItem();
                if (child != null && childId.equals(child.getId()) && !childItem.returnIsRemoveItem()) return true;
            }
        }

        return false;
    }
}
