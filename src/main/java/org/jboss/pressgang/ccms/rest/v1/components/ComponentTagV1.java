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

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProjectCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTCategoryInTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryInTagV1;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * This component contains methods that can be applied against tags
 *
 * @author Matthew Casperson
 */
public class ComponentTagV1 extends ComponentBaseRESTEntityWithPropertiesV1 {
    final RESTTagV1 source;

    public ComponentTagV1(final RESTTagV1 source) {
        super(source);
        this.source = source;
    }

    public boolean containedInCategory(final Integer categoryId) {
        return containedInCategory(source, categoryId);
    }

    public static boolean containedInCategory(final RESTBaseTagV1<?, ?, ?> source, final Integer categoryId) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getCategories() != null && source.getCategories().getItems() != null) {
            for (final RESTCategoryInTagCollectionItemV1 categoryItem : source.getCategories().getItems()) {
                final RESTCategoryInTagV1 category = categoryItem.getItem();
                if (category != null && categoryId.equals(category.getId()) && !categoryItem.returnIsRemoveItem()) return true;
            }
        }

        return false;
    }

    public boolean containedInCategory(final List<Integer> categoryIds) {
        return containedInCategory(source, categoryIds);
    }

    public static boolean containedInCategory(final RESTBaseTagV1<?, ?, ?> source, final List<Integer> categoryIds) {
        if (categoryIds == null) return false;

        for (final Integer categoryId : categoryIds) {
            if (containedInCategory(source, categoryId)) {
                return true;
            }
        }

        return false;
    }

    public boolean containedInProject(final Integer id) {
        return containedInCategory(source, id);
    }

    public static boolean containedInProject(final RESTBaseTagV1<?, ?, ?> source, final Integer id) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getProjects() != null && source.getProjects().getItems() != null) {
            for (final RESTProjectCollectionItemV1 projectItem : source.getProjects().getItems()) {
                final RESTProjectV1 project = projectItem.getItem();
                if (id.equals(project.getId()) && !projectItem.returnIsRemoveItem()) return true;
            }
        }

        return false;
    }
}
