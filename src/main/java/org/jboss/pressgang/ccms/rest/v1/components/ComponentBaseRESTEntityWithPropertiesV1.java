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

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTAssignedPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * This is the base class for all entities that have Property Tags
 */
public abstract class ComponentBaseRESTEntityWithPropertiesV1 {
    final RESTBaseEntityWithPropertiesV1<?, ?, ?> source;

    protected ComponentBaseRESTEntityWithPropertiesV1(final RESTBaseEntityWithPropertiesV1<?, ?, ?> source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public RESTAssignedPropertyTagV1 returnProperty(final Integer propertyTagId) {
        return returnProperty(source, propertyTagId);
    }

    public static RESTAssignedPropertyTagV1 returnProperty(final RESTBaseEntityWithPropertiesV1<?, ?, ?> source, final Integer propertyTagId) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getProperties() != null && source.getProperties().getItems() != null) {
            final List<RESTAssignedPropertyTagV1> properties = source.getProperties().returnItems();
            for (final RESTAssignedPropertyTagV1 property : properties) {
                if (property.getId().equals(propertyTagId)) return property;
            }
        }

        return null;
    }

    public List<RESTAssignedPropertyTagV1> returnProperties(final Integer propertyTagId) {
        return returnProperties(source, propertyTagId);
    }

    public static List<RESTAssignedPropertyTagV1> returnProperties(final RESTBaseEntityWithPropertiesV1<?, ?, ?> source, final Integer propertyTagId) {
        checkArgument(source != null, "The source parameter can not be null");

        final List<RESTAssignedPropertyTagV1> properties = new ArrayList<RESTAssignedPropertyTagV1>();
        if (source.getProperties() != null && source.getProperties().getItems() != null) {
            final List<RESTAssignedPropertyTagV1> propertyItems = source.getProperties().returnItems();
            for (final RESTAssignedPropertyTagV1 property : propertyItems) {
                if (property.getId().equals(propertyTagId)) properties.add(property);
            }
        }

        return properties;
    }

    public List<RESTAssignedPropertyTagCollectionItemV1> returnPropertyItems(final Integer propertyTagId) {
        return returnPropertyItems(source, propertyTagId);
    }

    public static List<RESTAssignedPropertyTagCollectionItemV1> returnPropertyItems(final RESTBaseEntityWithPropertiesV1<?, ?, ?> source, final Integer propertyTagId) {
        checkArgument(source != null, "The source parameter can not be null");

        final List<RESTAssignedPropertyTagCollectionItemV1> properties = new ArrayList<RESTAssignedPropertyTagCollectionItemV1>();
        if (source.getProperties() != null && source.getProperties().getItems() != null) {
            for (final RESTAssignedPropertyTagCollectionItemV1 propertyItem : source.getProperties().getItems()) {
                final RESTAssignedPropertyTagV1 property = propertyItem.getItem();
                if (property != null && property.getId().equals(propertyTagId)) properties.add(propertyItem);
            }
        }

        return properties;
    }
}
