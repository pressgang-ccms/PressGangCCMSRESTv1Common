package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTranslatedTopicStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTranslatedStringV1;

public class RESTTranslatedTopicStringV1 extends RESTBaseTranslatedStringV1<RESTTranslatedTopicStringV1, RESTTranslatedTopicStringCollectionV1, RESTTranslatedTopicStringCollectionItemV1>
{
	public static final String TRANSLATEDTOPIC_NAME = "translatedTopic";
	
	private RESTTranslatedTopicV1 translatedTopic = null;
	/** A list of the Envers revision numbers */
	private RESTTranslatedTopicStringCollectionV1 revisions = null;
	
	@Override
	public RESTTranslatedTopicStringCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTTranslatedTopicStringCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTTranslatedTopicStringV1 clone(final boolean deepCopy)
	{
		final RESTTranslatedTopicStringV1 retValue = new RESTTranslatedTopicStringV1();
		
		this.cloneInto(retValue, deepCopy);

		return retValue;
	}
	
	public void cloneInto(final RESTTranslatedTopicStringV1 clone, final boolean deepCopy)
	{
	    super.cloneInto(clone, deepCopy);
	    
        if (deepCopy)
        {
            clone.translatedTopic = this.translatedTopic != null ? this.translatedTopic.clone(deepCopy) : null;
            
            if (this.revisions != null)
            {
                clone.revisions = new RESTTranslatedTopicStringCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        }
        else
        {
            clone.translatedTopic = this.translatedTopic;
            clone.revisions = this.revisions;
        }
	}

	public RESTTranslatedTopicV1 getTranslatedTopic()
	{
		return translatedTopic;
	}

	public void setTranslatedTopic(final RESTTranslatedTopicV1 translatedTopic)
	{
		this.translatedTopic = translatedTopic;
	}
	
	public void explicitSetOriginalString(final String originalString)
	{
		this.originalString = originalString;
		this.setParameterToConfigured(ORIGINALSTRING_NAME);
	}
	
	public void explicitSetTranslatedString(final String translatedString)
	{
		this.translatedString = translatedString;
		this.setParameterToConfigured(TRANSLATEDSTRING_NAME);
	}
    
    public void explicitSetFuzzyTranslation(final Boolean fuzzyTranslation)
    {
        this.fuzzyTranslation = fuzzyTranslation;
        this.setParameterToConfigured(FUZZY_TRANSLATION_NAME);
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTTranslatedTopicStringV1))
            return false;
        
        return super.equals(other);
    }
}
