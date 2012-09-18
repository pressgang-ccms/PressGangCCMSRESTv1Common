package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBugzillaBugCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTopicCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;

public class RESTTopicV1 extends RESTBaseTopicV1<RESTTopicV1, RESTTopicCollectionV1, RESTTopicCollectionItemV1>
{
	public static final String DESCRIPTION_NAME = "description";
	public static final String BUGZILLABUGS_NAME = "bugzillaBugs_OTM";
	public static final String TRANSLATEDTOPICS_NAME = "translatedTopics_OTM";
	
	protected String description = null;
	protected Date created = null;
	protected Date lastModified = null;
	protected RESTBugzillaBugCollectionV1 bugzillaBugs_OTM = null;
	protected RESTTranslatedTopicCollectionV1 translatedTopics_OTM = null;
	protected RESTTopicCollectionV1 outgoingRelationships = null;
	protected RESTTopicCollectionV1 incomingRelationships = null;
	/** A list of the Envers revision numbers */
	private RESTTopicCollectionV1 revisions = null;
	
	@Override
	public RESTTopicCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTTopicCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTTopicV1 clone(final boolean deepCopy)
	{
		final RESTTopicV1 retValue = new RESTTopicV1();
		
		this.cloneInto(retValue, deepCopy);
		
		return retValue;
	}
	
	public void cloneInto(final RESTTopicV1 clone, final boolean deepCopy)
	{
	    super.cloneInto(clone, deepCopy);

	    clone.description = this.description;
	    clone.created = this.created == null ? null : (Date)this.created.clone();
	    clone.lastModified = this.lastModified == null ? null : (Date)lastModified.clone();
        
        if (deepCopy)
        {
            if (this.bugzillaBugs_OTM != null)
            {
                clone.bugzillaBugs_OTM = new RESTBugzillaBugCollectionV1();
                this.bugzillaBugs_OTM.cloneInto(clone.bugzillaBugs_OTM, deepCopy);
            }
            
            if (this.translatedTopics_OTM != null)
            {
                clone.translatedTopics_OTM = new RESTTranslatedTopicCollectionV1();
                this.translatedTopics_OTM.cloneInto(clone.translatedTopics_OTM, deepCopy);
            }
            
            if (this.outgoingRelationships != null)
            {
                clone.outgoingRelationships = new RESTTopicCollectionV1();
                this.outgoingRelationships.cloneInto(clone.outgoingRelationships, deepCopy);
            }
            
            if (this.incomingRelationships != null)
            {
                clone.incomingRelationships = new RESTTopicCollectionV1();
                this.incomingRelationships.cloneInto(clone.incomingRelationships, deepCopy);
            }
            
            if (this.revisions != null)
            {
                clone.revisions = new RESTTopicCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        }
        else
        {
            clone.bugzillaBugs_OTM = this.bugzillaBugs_OTM;
            clone.translatedTopics_OTM = this.translatedTopics_OTM;
            clone.outgoingRelationships = this.outgoingRelationships;
            clone.incomingRelationships = this.incomingRelationships;
            clone.revisions = this.revisions;
        }
	}
	
	public void explicitSetTitle(final String title)
	{
		setTitle(title);
		setParameterToConfigured(TITLE_NAME);
	}
	
	public void explicitSetTags(final RESTTagCollectionV1 tags)
	{
		setTags(tags);
		setParameterToConfigured(TAGS_NAME);
	}
	
	public void explicitSetSourceUrls_OTM(final RESTTopicSourceUrlCollectionV1 sourceUrls)
	{
		setSourceUrls_OTM(sourceUrls);
		setParameterToConfigured(SOURCE_URLS_NAME);
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}
	
	public void explicitSetDescription(final String description)
	{
		setDescription(description);
		setParameterToConfigured(DESCRIPTION_NAME);
	}
	
	public Date getCreated()
	{
		return created;
	}

	public void setCreated(Date created)
	{
		this.created = created;
	}

	public void explicitSetXml(final String xml)
	{
		setXml(xml);
		setParameterToConfigured(XML_NAME);
	}

	public void explicitSetHtml(final String html)
	{
		setHtml(html);
		setParameterToConfigured(HTML_NAME);
	}
	
	public void explicitSetLocale(final String locale)
	{
		setLocale(locale);
		setParameterToConfigured(LOCALE_NAME);
	}

	public Date getLastModified()
	{
		return lastModified;
	}

	public void setLastModified(final Date lastModified)
	{
		this.lastModified = lastModified;
	}
	
	public RESTBugzillaBugCollectionV1 getBugzillaBugs_OTM()
	{
		return bugzillaBugs_OTM;
	}

	public void setBugzillaBugs_OTM(final RESTBugzillaBugCollectionV1 bugzillaBugs)
	{
		this.bugzillaBugs_OTM = bugzillaBugs;
	}
	
	public void explicitSetBugzillaBugs_OTM(final RESTBugzillaBugCollectionV1 bugzillaBugs)
	{
		setBugzillaBugs_OTM(bugzillaBugs);
		setParameterToConfigured(BUGZILLABUGS_NAME);
	}
	
	public void setLocaleExplicit(final String locale)
	{
		setLocale(locale);
		setParameterToConfigured(LOCALE_NAME);
	}
	
	public void explicitSetXmlErrors(final String xmlErrors)
	{
		setXmlErrors(xmlErrors);
		setParameterToConfigured(XML_ERRORS_NAME);
	}
	
	public RESTTranslatedTopicCollectionV1 getTranslatedTopics_OTM()
	{
		return translatedTopics_OTM;
	}

	public void setTranslatedTopics_OTM(final RESTTranslatedTopicCollectionV1 translatedTopics)
	{
		this.translatedTopics_OTM = translatedTopics;
	}
	
	public void explicitSetTranslatedTopics_OTM(final RESTTranslatedTopicCollectionV1 translatedTopics)
	{
		this.translatedTopics_OTM = translatedTopics;
		setParameterToConfigured(TRANSLATEDTOPICS_NAME);
	}
	
	@Override
	public RESTTopicCollectionV1 getOutgoingRelationships()
	{
		return outgoingRelationships;
	}

	@Override
	public void setOutgoingRelationships(final RESTTopicCollectionV1 outgoingRelationships)
	{
		this.outgoingRelationships = outgoingRelationships;
	}
	
	public void explicitSetOutgoingRelationships(final RESTTopicCollectionV1 outgoingRelationships)
	{
		setOutgoingRelationships(outgoingRelationships);
		setParameterToConfigured(OUTGOING_NAME);
	}

	@Override
	public RESTTopicCollectionV1 getIncomingRelationships()
	{
		return incomingRelationships;
	}

	@Override
	public void setIncomingRelationships(final RESTTopicCollectionV1 incomingRelationships)
	{
		this.incomingRelationships = incomingRelationships;
	}
	
	public void explicitSetIncomingRelationships(final RESTTopicCollectionV1 incomingRelationships)
	{
		setIncomingRelationships(incomingRelationships);
		setParameterToConfigured(INCOMING_NAME);
	}
	
	@Override
    public boolean equals(final Object other)
    {
	    if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTTopicV1))
            return false;
        
        return super.equals(other);
    }
}
