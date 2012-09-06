package org.jboss.pressgangccms.rest.v1.components;

import org.jboss.pressgangccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTProjectV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTagV1;

/**
 * This component contains methods that can be applied against tags
 * @author Matthew Casperson
 */
public class ComponentTagV1 extends ComponentBaseRESTEntityWithPropertiesV1<RESTTagV1, RESTTagCollectionV1>
{
	final RESTTagV1 source;
	
	public ComponentTagV1(final RESTTagV1 source)
	{
		super(source);
		this.source = source;
	}
	
	public boolean containedInCategory(final Integer categoryId)
	{
		return containedInCategory(source, categoryId);
	}
	
	static public boolean containedInCategory(final RESTTagV1 source, final Integer categoryId)
	{
		if (source.getCategories() != null && source.getCategories().getItems() != null)
		{
			for (final RESTCategoryV1 category : source.getCategories().getItems())
				if (categoryId.equals(category.getId()) && !category.getRemoveItem())
					return true;
		}

		return false;
	}
	
	public boolean containedInProject(final Integer id)
	{
		return containedInCategory(source, id);
	}
	
	static public boolean containedInProject(final RESTTagV1 source, final Integer id)
	{
		if (source.getProjects() != null && source.getProjects().getItems() != null)
		{
			for (final RESTProjectV1 project : source.getProjects().getItems())
				if (id.equals(project.getId()) && !project.getRemoveItem())
					return true;
		}

		return false;
	}
	
	public Integer getSortForCategory(final Integer id)
	{
		return getSortForCategory(source, id);
	}
	
	static public Integer getSortForCategory(final RESTTagV1 source, final Integer id)
	{
		if (source.getCategories() != null && source.getCategories().getItems() != null)
		{
			for (final RESTCategoryV1 category : source.getCategories().getItems())
			{
				if (category.getId().equals(id))
					return category.getSort();
			}
		}
		
		return null;
	}


	
}
