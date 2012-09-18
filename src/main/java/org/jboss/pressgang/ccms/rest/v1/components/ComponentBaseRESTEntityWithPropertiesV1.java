package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;

/**
 * This is the base class for all entities that have Property Tags
 */
public abstract class ComponentBaseRESTEntityWithPropertiesV1<T extends RESTBaseEntityWithPropertiesV1<T, ?, ?>> 
{
	final T source;
	
	public ComponentBaseRESTEntityWithPropertiesV1(final T source)
	{
		this.source = source;
	}
	
	public RESTAssignedPropertyTagV1 returnProperty(final Integer propertyTagId)
	{
		return returnProperty(source, propertyTagId);
	}
	
	static public <T extends RESTBaseEntityWithPropertiesV1<T, ?, ?>> RESTAssignedPropertyTagV1 returnProperty(final T source, final Integer propertyTagId)
	{
		if (source.getProperties() != null && source.getProperties().getItems() != null)
		{
		    final List<RESTAssignedPropertyTagV1> properties = source.getProperties().returnItems();
			for (final RESTAssignedPropertyTagV1 property : properties)
			{
				if (property.getId().equals(propertyTagId))
					return property;
			}
		}

		return null;
	}
}
