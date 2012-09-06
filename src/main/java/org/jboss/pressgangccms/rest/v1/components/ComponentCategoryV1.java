package org.jboss.pressgangccms.rest.v1.components;

import org.jboss.pressgangccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTagV1;

public class ComponentCategoryV1
{
	final RESTCategoryV1 source;
	
	public ComponentCategoryV1(final RESTCategoryV1 source)
	{
		this.source = source;
	}
	
	public boolean containsTag(final int tagId)
	{
		return containsTag(source, tagId);
	}
	
	static public boolean containsTag(final RESTCategoryV1 source, final int tagId)
	{
		if (source == null) throw new IllegalArgumentException("source cannot be null");
		
		if (source.getTags() != null && source.getTags().getItems() != null)
		{
			for (final RESTTagV1 tag : source.getTags().getItems())
				if (tagId == tag.getId() && !tag.getRemoveItem())
					return true;
		}

		return false;
	}
}
