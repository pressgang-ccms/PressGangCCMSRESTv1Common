package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTRoleCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTUserCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTRoleCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTRoleV1 extends RESTBasePrimaryEntityV1<RESTRoleV1, RESTRoleCollectionV1, RESTRoleCollectionItemV1>
{
	public static final String NAME_NAME = "name";
	public static final String DESCRIPTION_NAME = "description";
	public static final String CHILDROLES_NAME = "childRoles";
	public static final String PARENTROLES_NAME = "parentRoles";
	public static final String USERS_NAME = "users";
	
	private String name = null;
	private String description = null;
	private RESTUserCollectionV1 users = null;
	private RESTRoleCollectionV1 childRoles = null;
	private RESTRoleCollectionV1 parentRoles = null;
	/** A list of the Envers revision numbers */
	private RESTRoleCollectionV1 revisions = null;
	
	@Override
	public RESTRoleCollectionV1 getRevisions()
	{
		return revisions;
	}

	@Override
	public void setRevisions(final RESTRoleCollectionV1 revisions)
	{
		this.revisions = revisions;
	}
	
	@Override
	public RESTRoleV1 clone(boolean deepCopy)
	{
		final RESTRoleV1 retValue = new RESTRoleV1();
		
		this.cloneInto(retValue, deepCopy);
		
		retValue.name = this.name;
		retValue.description = description;
		
		if (deepCopy)
		{
			if (this.users != null)
			{
				retValue.users = new RESTUserCollectionV1();
				this.users.cloneInto(retValue.users, deepCopy);
			}
			
			if (this.childRoles != null)
			{
				retValue.childRoles = new RESTRoleCollectionV1();
				this.childRoles.cloneInto(retValue.childRoles, deepCopy);
			}
			
			if (this.parentRoles != null)
			{
				retValue.parentRoles = new RESTRoleCollectionV1();
				this.parentRoles.cloneInto(retValue.parentRoles, deepCopy);
			}
			
			if (this.revisions != null)
			{
				retValue.revisions = new RESTRoleCollectionV1();
				this.revisions.cloneInto(retValue.revisions, deepCopy);
			}
		}
		else
		{
			retValue.users = this.users;
			retValue.childRoles = this.childRoles;
			retValue.parentRoles = this.parentRoles;
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

	public RESTUserCollectionV1 getUsers()
	{
		return users;
	}

	public void setUsers(final RESTUserCollectionV1 users)
	{
		this.users = users;
	}
	
	public void explicitSetUsers(final RESTUserCollectionV1 users)
	{
		this.users = users;
		this.setParameterToConfigured(USERS_NAME);
	}

	public RESTRoleCollectionV1 getChildRoles()
	{
		return childRoles;
	}

	public void setChildRoles(final RESTRoleCollectionV1 childRoles)
	{
		this.childRoles = childRoles;
	}
	
	public void explicitSetChildRoles(final RESTRoleCollectionV1 childRoles)
	{
		this.childRoles = childRoles;
		this.setParameterToConfigured(CHILDROLES_NAME);
	}

	public RESTRoleCollectionV1 getParentRoles()
	{
		return parentRoles;
	}

	public void setParentRoles(final RESTRoleCollectionV1 parentRoles)
	{
		this.parentRoles = parentRoles;
	}
	
	public void explicitSetParentRoles(final RESTRoleCollectionV1 parentRoles)
	{
		this.parentRoles = parentRoles;
		this.setParameterToConfigured(PARENTROLES_NAME);
	}
}
