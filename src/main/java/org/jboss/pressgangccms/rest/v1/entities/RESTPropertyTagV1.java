package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTPropertyTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTPropertyTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBasePropertyTagV1;
import org.jboss.pressgangccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;

public class RESTPropertyTagV1 extends RESTBasePropertyTagV1<RESTPropertyTagV1, RESTPropertyTagCollectionV1, RESTPropertyTagCollectionItemV1>
{
	/** A list of the Envers revision numbers */
	private RESTPropertyTagCollectionV1 revisions = null;
	
	public RESTPropertyTagV1()
	{
	    
	}
	
    public RESTPropertyTagV1(final RESTAssignedPropertyTagV1 assignedPropertyTag)
    {
        assignedPropertyTag.cloneInto(this, false);
    }
	
	@Override
	public RESTPropertyTagCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTPropertyTagCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTPropertyTagV1 clone(boolean deepCopy)
	{
		final RESTPropertyTagV1 retValue = new RESTPropertyTagV1();
		
		this.cloneInto(retValue, deepCopy);
		
		if (deepCopy)
		{		
			if (this.revisions != null)
			{
				retValue.revisions = new RESTPropertyTagCollectionV1();
				this.revisions.cloneInto(retValue.revisions, deepCopy);
			}
		}
		else
		{
			retValue.revisions = this.revisions;
		}
		
		return retValue;
	}
	
	public void explicitSetDescription(final String description)
    {
        this.description = description;
        this.setParameterToConfigured(DESCRIPTION_NAME);
    }
	
	public void explicitSetIsUnique(boolean isUnique)
    {
        this.isUnique = isUnique;
        this.setParameterToConfigured(ISUNIQUE_NAME);
    }
	
	public void explicitSetCanBeNull(final boolean canBeNull)
    {
        this.canBeNull = canBeNull;
        this.setParameterToConfigured(CANBENULL_NAME);
    }
	
	public void explicitSetRegex(final String regex)
    {
        this.regex = regex;
        this.setParameterToConfigured(REGEX_NAME);
    }
	
	public void explicitSetName(final String name)
    {
        this.name = name;
        this.setParameterToConfigured(NAME_NAME);
    }
}
