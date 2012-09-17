package org.jboss.pressgangccms.rest.v1.entities.base;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1;


public abstract class RESTBaseEntityV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>, V extends RESTBaseCollectionItemV1<T, U, V>>
{
	public static final String REVISIONS_NAME = "revisions";
	public static final String LOG_DETAILS_NAME = "logDetails";
	
	/** The id of the entity */
	private Integer id = null;
	/** The revision of the entity */
	private Integer revision = null;
	/**
	 * Maintains a list of the database fields that have been specifically set
	 * on this object. This allows us to distinguish them from those that are
	 * just null by default
	 */
	private List<String> configuredParameters = null;
	/** The names of collections that can be expanded */
	private List<String> expand = null;
	private RESTLogDetailsV1 logDetails = null;

	abstract public U getRevisions();

	abstract public void setRevisions(U revisions);
	
	/**
	 * @return true if this entity's state would trigger a change in the database, and false otherwise
	 */
	public boolean returnDirtyState()
	{
		if (this.configuredParameters != null && !this.configuredParameters.isEmpty()) return true;
		return false;
	}
	
	@Override
	public boolean equals(final Object other)
	{
		if (!(other instanceof RESTBaseEntityV1))
			return false;
		
		@SuppressWarnings("rawtypes")
		final RESTBaseEntityV1 otherCasted = (RESTBaseEntityV1)other;
		
		if (this.id == null && otherCasted.id == null)
			return true;
		
		if (this.id == null || otherCasted.id == null)
			return false;
		
		return (this.id.equals(otherCasted.id));
	}
	
	@Override
	public int hashCode()
	{
		if (this.id == null)
			return 0;
		return id.hashCode();
	}
		
	public void cloneInto(final RESTBaseEntityV1<?, ?, ?> clone, final boolean deepCopy)
	{
		clone.setId(this.id == null ? null : new Integer(this.id));
		clone.setRevision(this.revision);
		clone.setExpand(this.expand);
		
		if (deepCopy)
		{
		    if (this.logDetails != null)
		    {
		        clone.setLogDetails(this.logDetails.clone(deepCopy));
		    }
		}
		else
		{
		    clone.setLogDetails(this.logDetails);
		}
	}
	
	/**
	 * @param deepCopy true if referenced objects should be copied, false if the referenced themselves should be copied
	 * @return A clone of this object
	 */
	public abstract T clone(final boolean deepCopy);
	
	/**
	 * This is a convenience method that adds a value to the configuredParameters collection
	 * @param parameter The parameter to specify as configured
	 */
	protected void setParameterToConfigured(final String parameter)
	{
		if (configuredParameters == null)
			configuredParameters = new ArrayList<String>();
		if (!configuredParameters.contains(parameter))
			configuredParameters.add(parameter);
	}
	
	public boolean hasParameterSet(final String parameter)
	{
		return getConfiguredParameters() != null && getConfiguredParameters().contains(parameter);
	}

	public List<String> getExpand()
	{
		return expand;
	}

	public void setExpand(final List<String> expand)
	{
		this.expand = expand;
	}

	public List<String> getConfiguredParameters()
	{
		return configuredParameters;
	}

	public void setConfiguredParameters(List<String> configuredParameters)
	{
		this.configuredParameters = configuredParameters;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getRevision()
	{
		return revision;
	}

	public void setRevision(final Integer revision)
	{
		this.revision = revision;
	}

    public RESTLogDetailsV1 getLogDetails()
    {
        return logDetails;
    }

    public void setLogDetails(final RESTLogDetailsV1 logDetails)
    {
        this.logDetails = logDetails;
    }
}
