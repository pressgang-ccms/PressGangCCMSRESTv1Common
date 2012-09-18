package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;

public abstract class RESTBasePropertyTagV1<T extends RESTBasePropertyTagV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>, V extends RESTBaseCollectionItemV1<T, U, V>>
    extends RESTBasePrimaryEntityV1<T, U, V>
{
	public static String NAME_NAME = "name";
	public static String DESCRIPTION_NAME = "description";
	public static String REGEX_NAME = "regex";
	public static String CANBENULL_NAME = "canBeNull";
	public static String ISUNIQUE_NAME = "isUnique";
	
	protected String name = null;
	protected String description = null;
	protected String regex = null;
	protected boolean canBeNull;
	protected boolean isUnique;
	
	public void cloneInto(final RESTBasePropertyTagV1<?, ?, ?> clone, final boolean deepCopy)
	{
		super.cloneInto(clone, deepCopy);
		
		clone.name = this.name;
		clone.description = description;
		clone.regex = this.regex;
		clone.canBeNull = this.canBeNull;
		clone.isUnique = this.isUnique;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getRegex()
	{
		return regex;
	}

	public void setRegex(final String regex)
	{
		this.regex = regex;
	}

	public boolean getCanBeNull()
	{
		return canBeNull;
	}

	public void setCanBeNull(final boolean canBeNull)
	{
		this.canBeNull = canBeNull;
	}

	public boolean getIsUnique()
	{
		return isUnique;
	}

	public void setIsUnique(boolean isUnique)
	{
		this.isUnique = isUnique;
	}
	
	@Override
    public boolean equals(final Object other)
    {
        if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTBasePropertyTagV1))
            return false;
        
        return super.equals(other);
    }
}
