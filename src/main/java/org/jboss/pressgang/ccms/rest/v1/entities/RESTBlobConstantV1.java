package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBlobConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBlobConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

/**
 * A REST representation of the BlobConstants database entity
 */
public class RESTBlobConstantV1 extends RESTBasePrimaryEntityV1<RESTBlobConstantV1, RESTBlobConstantCollectionV1, RESTBlobConstantCollectionItemV1>
{
	public static final String NAME_NAME = "name";
	public static final String VALUE_NAME = "value";
	
	private String name = null;
	private byte[] value = null;
	/** A list of the Envers revision numbers */
	private RESTBlobConstantCollectionV1 revisions = null;
	
	@Override
	public RESTBlobConstantCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTBlobConstantCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTBlobConstantV1 clone(boolean deepCopy)
	{
		final RESTBlobConstantV1 retValue = new RESTBlobConstantV1();
		
		this.cloneInto(retValue, deepCopy);
		
		return retValue;
	}
	
	public void cloneInto(final RESTBlobConstantV1 clone, final boolean deepCopy)
	{
	    super.cloneInto(clone, deepCopy);

	    clone.name = this.name;
        
        if (deepCopy)
        {
            if (value != null)
            {
                clone.value = new byte[value.length];
                System.arraycopy(value, 0, clone.value, 0, value.length);
            }
            else
            {
                clone.value = null;
            }
            
            if (this.revisions != null)
            {
                clone.revisions = new RESTBlobConstantCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        }
        else
        {
            clone.value = value;
            clone.revisions = this.revisions;
        }
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}
	
	public void explicitSetName(final String name)
	{
		this.name = name;
		this.setParameterToConfigured(NAME_NAME);
	}

	public byte[] getValue()
	{
		return value;
	}

	public void setValue(final byte[] value)
	{
		this.value = value;
	}
	
	public void explicitSetValue(final byte[] value)
	{
		this.value = value;
		this.setParameterToConfigured(VALUE_NAME);
	}

	@Override
    public boolean equals(final Object other)
    {
	    if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTBlobConstantV1))
            return false;
        
        return super.equals(other);
    }
}
