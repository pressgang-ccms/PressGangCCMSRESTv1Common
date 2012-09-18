package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTRoleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTUserCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTUserCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTUserV1 extends RESTBasePrimaryEntityV1<RESTUserV1, RESTUserCollectionV1, RESTUserCollectionItemV1>
{
	public static final String NAME_NAME = "name";
	public static final String DESCRIPTION_NAME = "description";
	public static final String ROLES_NAME = "roles";

	private String name = null;
	private String description = null;
	private RESTRoleCollectionV1 roles = null;
	/** A list of the Envers revision numbers */
	private RESTUserCollectionV1 revisions = null;
	
	@Override
	public RESTUserCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTUserCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTUserV1 clone(boolean deepCopy)
	{
		final RESTUserV1 retValue = new RESTUserV1();
		
		this.cloneInto(retValue, deepCopy);
		
		return retValue;
	}
	
	public void cloneInto(final RESTUserV1 clone, final boolean deepCopy)
	{
	    super.cloneInto(clone, deepCopy);

	    clone.name = this.name;
	    clone.description = description;
        
        if (deepCopy)
        {
            if (this.roles != null)
            {
                clone.roles = new RESTRoleCollectionV1();
                this.roles.cloneInto(clone.roles, deepCopy);
            }
            
            if (this.revisions != null)
            {
                clone.revisions = new RESTUserCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        }
        else
        {
            clone.roles = this.roles;
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
		this.description = description;
		this.setParameterToConfigured(DESCRIPTION_NAME);
	}

	public RESTRoleCollectionV1 getRoles()
	{
		return roles;
	}

	public void setRoles(final RESTRoleCollectionV1 roles)
	{
		this.roles = roles;
	}
	
	public void explicitSetRoles(final RESTRoleCollectionV1 roles)
	{
		this.roles = roles;
		this.setParameterToConfigured(ROLES_NAME);
	}
	
	@Override
    public boolean equals(final Object other)
    {
	    if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTUserV1))
            return false;
        
        return super.equals(other);
    }
}
