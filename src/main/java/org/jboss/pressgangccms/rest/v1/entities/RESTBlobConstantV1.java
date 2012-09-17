package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTBlobConstantCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTBlobConstantCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

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
		
		retValue.name = this.name;
		
		if (deepCopy)
		{
			if (value != null)
			{
				retValue.value = new byte[value.length];
				System.arraycopy(value, 0, retValue.value, 0, value.length);
			}
			else
			{
				retValue.value = null;
			}
			
			if (this.revisions != null)
			{
				retValue.revisions = new RESTBlobConstantCollectionV1();
				this.revisions.cloneInto(retValue.revisions, deepCopy);
			}
		}
		else
		{
			retValue.value = value;
			retValue.revisions = this.revisions;
		}
		return retValue;
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


}
