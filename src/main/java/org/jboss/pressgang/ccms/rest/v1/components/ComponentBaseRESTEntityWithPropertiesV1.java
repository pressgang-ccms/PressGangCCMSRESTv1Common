package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;

/**
 * This is the base class for all entities that have Property Tags
 */
public abstract class ComponentBaseRESTEntityWithPropertiesV1
{
	final RESTBaseEntityWithPropertiesV1 source;
	
	public ComponentBaseRESTEntityWithPropertiesV1(final RESTBaseEntityWithPropertiesV1 source)
	{
		this.source = source;
	}
	
	public RESTAssignedPropertyTagV1 returnProperty(final Integer propertyTagId)
	{
		return returnProperty(source, propertyTagId);
	}
	
	static public RESTAssignedPropertyTagV1 returnProperty(final RESTBaseEntityWithPropertiesV1 source, final Integer propertyTagId)
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
