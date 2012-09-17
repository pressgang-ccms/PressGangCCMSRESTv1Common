package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.join.RESTCategoryTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseTagV1;
import org.jboss.pressgangccms.rest.v1.entities.join.RESTTagCategoryV1;

public class RESTTagV1 extends RESTBaseTagV1<RESTTagV1, RESTTagCollectionV1, RESTTagCollectionItemV1>
{
	/** A list of the Envers revision numbers */
	private RESTTagCollectionV1 revisions = null;
	
	public RESTTagV1()
	{
	    
	}
	
	public RESTTagV1(final RESTTagCategoryV1 tagCategory)
    {
        tagCategory.cloneInto(this, false);
    }
	
	@Override
	public RESTTagCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTTagCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTTagV1 clone(boolean deepCopy)
	{
		final RESTTagV1 retValue = new RESTTagV1();
		
		this.cloneInto(retValue, deepCopy);
		
		if (deepCopy)
		{
			if (this.revisions != null)
			{
				retValue.revisions = new RESTTagCollectionV1();
				this.revisions.cloneInto(retValue.revisions, deepCopy);
			}
		}
		else
		{
			retValue.revisions = this.revisions;
		}
		
		return retValue;
	}
	
	public void explicitSetName(final String name)
    {
        this.name = name;
        this.setParameterToConfigured(NAME_NAME);
    }
	
	public void explicitSetDescription(final String description)
    {
        this.description = description;
        this.setParameterToConfigured(DESCRIPTION_NAME);
    }
	
	public void explicitSetCategories(final RESTCategoryTagCollectionV1 categories)
    {
        this.categories = categories;
        this.setParameterToConfigured(CATEGORIES_NAME);
    }
	
	public void explicitSetParentTags(final RESTTagCollectionV1 parentTags)
    {
        this.parentTags = parentTags;
        this.setParameterToConfigured(PARENT_TAGS_NAME);
    }
	
	public void explicitSetChildTags(final RESTTagCollectionV1 childTags)
    {
        this.childTags = childTags;
        this.setParameterToConfigured(CHILD_TAGS_NAME);
    }
	
	public void explicitSetProjects(final RESTProjectCollectionV1 projects)
    {
        this.projects = projects;
        this.setParameterToConfigured(PROJECTS_NAME);
    }
}
