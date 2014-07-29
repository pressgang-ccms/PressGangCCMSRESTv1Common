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

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTTagInCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTTagInCategoryV1;

import static com.google.common.base.Preconditions.checkArgument;

public class ComponentCategoryV1 {
    final RESTCategoryV1 source;

    public ComponentCategoryV1(final RESTCategoryV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public boolean containsTag(final Integer tagId) {
        return containsTag(source, tagId);
    }

    public static boolean containsTag(final RESTCategoryV1 source, final Integer tagId) {
        return returnTag(source, tagId) != null;
    }

    public RESTTagInCategoryV1 returnTag(final Integer tagId) {
        return returnTag(source, tagId);
    }

    public static RESTTagInCategoryV1 returnTag(final RESTCategoryV1 source, final Integer tagId) {
        checkArgument(source != null, "The source parameter can not be null");
        
        /* Strictly speaking a category can not be a parent to a tag with no id */
        if (tagId == null) return null;

        if (source.getTags() != null && source.getTags().getItems() != null) {
            for (final RESTTagInCategoryCollectionItemV1 tagItem : source.getTags().getItems()) {
                final RESTTagInCategoryV1 tag = tagItem.getItem();
                if (tag != null && tagId.equals(tag.getId()) && !tagItem.returnIsRemoveItem()) return tag;
            }
        }

        return null;
    }
}
