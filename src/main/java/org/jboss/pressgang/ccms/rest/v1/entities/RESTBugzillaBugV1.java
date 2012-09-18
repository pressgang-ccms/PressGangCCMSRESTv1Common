package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBugzillaBugCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBugzillaBugCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;


public class RESTBugzillaBugV1 extends RESTBaseEntityV1<RESTBugzillaBugV1, RESTBugzillaBugCollectionV1, RESTBugzillaBugCollectionItemV1>
{
	public static final String BUG_ID = "bugzillaBugId";
	public static final String BUG_ISOPEN = "bugIsOpen";
	public static final String BUG_SUMMARY = "bugSummary";
	
	private Integer bugId = null;
	private Boolean isOpen = null;
	private String summary = null;
	/** A list of the Envers revision numbers */
	private RESTBugzillaBugCollectionV1 revisions = null;
	
	@Override
	public RESTBugzillaBugCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTBugzillaBugCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTBugzillaBugV1 clone(boolean deepCopy)
	{
		final RESTBugzillaBugV1 retValue = new RESTBugzillaBugV1();
		
		this.cloneInto(retValue, deepCopy);
		
		return retValue;
	}
	
	public void cloneInto(final RESTBugzillaBugV1 clone, final boolean deepCopy)
	{
	    super.cloneInto(clone, deepCopy);
	    
	    clone.bugId = this.bugId == null ? null : new Integer(this.bugId);
	    clone.isOpen = this.isOpen == null ? null : new Boolean(this.isOpen);
	    clone.summary = summary;
        
        
        if (deepCopy)
        {
            if (this.revisions != null)
            {
                clone.revisions = new RESTBugzillaBugCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }           
        }
        else
        {
            clone.revisions = this.revisions;
        }
        
	}

	public Integer getBugId()
	{
		return bugId;
	}

	public void setBugId(final Integer bugId)
	{
		this.bugId = bugId;
	}
	
	public void setBugIdExplicit(final Integer bugId)
	{
		this.bugId = bugId;
		this.setParameterToConfigured(BUG_ID);
	}

	public Boolean getIsOpen()
	{
		return isOpen;
	}

	public void setIsOpen(final Boolean isOpen)
	{
		this.isOpen = isOpen;
	}
	
	public void setIsOpenExplicit(final Boolean isOpen)
	{
		this.isOpen = isOpen;
		this.setParameterToConfigured(BUG_ISOPEN);
	}

	public String getSummary()
	{
		return summary;
	}

	public void setSummary(final String summary)
	{
		this.summary = summary;
	}
	
	public void setSummaryExplicit(final String summary)
	{
		this.summary = summary;
		this.setParameterToConfigured(BUG_SUMMARY);
	}

	@Override
    public boolean equals(final Object other)
    {
	    if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTBugzillaBugV1))
            return false;
        
        return super.equals(other);
    }

}
