package org.jboss.pressgangccms.rest.v1.components;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;

/**
 * This is the base class for all entities that have Property Tags
 */
public abstract class ComponentBaseRESTEntityWithPropertiesV1<T extends RESTBaseEntityWithPropertiesV1<T, U>, U extends BaseRestCollectionV1<T, U>> 
{
	final T source;
	
	public ComponentBaseRESTEntityWithPropertiesV1(final T source)
	{
		this.source = source;
	}
	
	public RESTPropertyTagV1 returnProperty(final Integer propertyTagId)
	{
		return ComponentBaseRESTEntityWithPropertiesV1.<T, U>returnProperty(source, propertyTagId);
	}
	
	static public <T extends RESTBaseEntityWithPropertiesV1<T, U>, U extends BaseRestCollectionV1<T, U>> RESTPropertyTagV1 returnProperty(final T source, final Integer propertyTagId)
	{
		if (source.getProperties() != null && source.getProperties().getItems() != null)
		{
			for (final RESTPropertyTagV1 property : source.getProperties().getItems())
			{
				if (property.getId().equals(propertyTagId))
					return property;
			}
		}

		return null;
	}
}
