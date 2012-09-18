package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTopicSourceUrlCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTTopicSourceUrlV1 extends RESTBaseEntityV1<RESTTopicSourceUrlV1, RESTTopicSourceUrlCollectionV1, RESTTopicSourceUrlCollectionItemV1>
{
	public static final String URL_NAME = "url";
	public static final String DESCRIPTION_NAME = "description";
	public static final String TITLE_NAME = "title";
	
	private String url = null;
	private String title = null;
	private String description = null;
	/** A list of the Envers revision numbers */
	private RESTTopicSourceUrlCollectionV1 revisions = null;
	
	@Override
	public RESTTopicSourceUrlCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTTopicSourceUrlCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTTopicSourceUrlV1 clone(boolean deepCopy)
	{
		final RESTTopicSourceUrlV1 retValue = new RESTTopicSourceUrlV1();
		
		this.cloneInto(retValue, deepCopy);
		
		return retValue;
	}
	
	public void cloneInto(final RESTTopicSourceUrlV1 clone, final boolean deepCopy)
	{
	    super.cloneInto(clone, deepCopy);
	    
	    clone.url = this.url;
	    clone.description = description;
	    clone.title = this.title;
        
        if (deepCopy)
        {       
            if (this.revisions != null)
            {
                clone.revisions = new RESTTopicSourceUrlCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        }
        else
        {
            clone.revisions = this.revisions;
        }
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(final String url)
	{
		this.url = url;
	}
	
	public void setUrlExplicit(final String url)
	{
		this.url = url;
		this.setParameterToConfigured(URL_NAME);
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(final String title)
	{
		this.title = title;
	}
	
	public void setTitleExplicit(final String title)
	{
		this.title = title;
		this.setParameterToConfigured(TITLE_NAME);
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}
	
	public void setDescriptionExplicit(final String description)
	{
		this.description = description;
		this.setParameterToConfigured(DESCRIPTION_NAME);
	}
	
	@Override
    public boolean equals(final Object other)
    {
        if (!(other instanceof RESTTopicSourceUrlV1))
            return false;
        
        return super.equals(other);
    }
}
