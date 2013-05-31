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

    public ComponentBaseRESTEntityWithPropertiesV1(final RESTBaseEntityWithPropertiesV1<?, ?, ?> source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public RESTAssignedPropertyTagV1 returnProperty(final Integer propertyTagId) {
        return returnProperty(source, propertyTagId);
    }

    public static RESTAssignedPropertyTagV1 returnProperty(final RESTBaseEntityWithPropertiesV1<?, ?, ?> source, final Integer propertyTagId) {
        if (source != null && source.getProperties() != null && source.getProperties().getItems() != null) {
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
        final List<RESTAssignedPropertyTagV1> properties = new ArrayList<RESTAssignedPropertyTagV1>();
        if (source != null && source.getProperties() != null && source.getProperties().getItems() != null) {
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

    public static List<RESTAssignedPropertyTagCollectionItemV1> returnPropertyItems(final RESTBaseEntityWithPropertiesV1<?, ?, ?> source,
            final Integer propertyTagId) {
        final List<RESTAssignedPropertyTagCollectionItemV1> properties = new ArrayList<RESTAssignedPropertyTagCollectionItemV1>();
        if (source != null && source.getProperties() != null && source.getProperties().getItems() != null) {
            for (final RESTAssignedPropertyTagCollectionItemV1 propertyItem : source.getProperties().getItems()) {
                final RESTAssignedPropertyTagV1 property = propertyItem.getItem();
                if (property != null && property.getId().equals(propertyTagId)) properties.add(propertyItem);
            }
        }

        return properties;
    }
}
