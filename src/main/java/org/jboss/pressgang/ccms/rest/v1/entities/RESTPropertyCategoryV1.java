package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePropertyCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryTagV1;

public class RESTPropertyCategoryV1 extends RESTBasePropertyCategoryV1<RESTPropertyCategoryV1, RESTPropertyCategoryCollectionV1, RESTPropertyCategoryCollectionItemV1>
{
	/** A list of the Envers revision numbers */
	private RESTPropertyCategoryCollectionV1 revisions = null;
	
	public RESTPropertyCategoryV1()
	{
	    
	}
    
    public RESTPropertyCategoryV1(final RESTPropertyCategoryTagV1 propertyTagCategoryWithSort)
    {
        propertyTagCategoryWithSort.cloneInto(this, false);
    }
	
	@Override
	public RESTPropertyCategoryCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTPropertyCategoryCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTPropertyCategoryV1 clone(boolean deepCopy)
	{
		final RESTPropertyCategoryV1 retValue = new RESTPropertyCategoryV1();
		
		this.cloneInto(retValue, deepCopy);
		
		return retValue;
	}
	
	public void cloneInto(final RESTPropertyCategoryV1 clone, final boolean deepCopy)
	{
	    super.cloneInto(clone, deepCopy);

	    clone.description = this.description;
	    clone.name = this.name;
	    
        if (deepCopy)
        {       
            if (this.revisions != null)
            {
                clone.revisions = new RESTPropertyCategoryCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        }
        else
        {
            clone.revisions = this.revisions;
        }
	}
	
	public void explicitSetDescription(final String description)
    {
        this.description = description;
        this.setParameterToConfigured(DESCRIPTION_NAME);
    }
	
	public void explicitSetName(final String name)
    {
        this.name = name;
        this.setParameterToConfigured(NAME_NAME);
    }
	
	@Override
    public boolean equals(final Object other)
    {
	    if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTPropertyCategoryV1))
            return false;
        
        return super.equals(other);
    }
    
    public void explicitSetPropertyTags(final RESTPropertyTagCategoryCollectionV1 propertyTags)
    {
        this.propertyTags = propertyTags;
        this.setParameterToConfigured(PROPERTY_TAGS_NAME);
    }
}
