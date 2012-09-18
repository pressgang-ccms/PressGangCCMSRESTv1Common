package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

@SuppressWarnings({"rawtypes", "unused"})
public class ComponentRESTBaseEntityV1
{
	private final RESTBaseEntityV1 source;

	public ComponentRESTBaseEntityV1(final RESTBaseEntityV1 source)
	{
		this.source = source;
	}
	
	static public boolean returnDirtyState(final List<? extends RESTBaseEntityV1> list)
	{
		for (final RESTBaseEntityV1 entity : list)
		{
			if (entity.returnDirtyState()) return true;
		}
		
		return false;
	}
}