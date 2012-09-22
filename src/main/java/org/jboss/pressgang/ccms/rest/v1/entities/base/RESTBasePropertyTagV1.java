package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyCategoryTagCollectionV1;

public abstract class RESTBasePropertyTagV1<T extends RESTBasePropertyTagV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>, V extends RESTBaseCollectionItemV1<T, U, V>>
    extends RESTBasePrimaryEntityV1<T, U, V>
{
	public static final String NAME_NAME = "name";
	public static final String DESCRIPTION_NAME = "description";
	public static final String REGEX_NAME = "regex";
	public static final String CANBENULL_NAME = "canBeNull";
	public static final String ISUNIQUE_NAME = "isUnique";
	public static final String PROPERTY_CATEGORIES_NAME = "propertyCategories";
	
	protected String name = null;
	protected String description = null;
	protected String regex = null;
	protected boolean canBeNull;
	protected boolean isUnique;
	
	protected RESTPropertyCategoryTagCollectionV1 propertyCategories = null;
	
	public void cloneInto(final RESTBasePropertyTagV1<?, ?, ?> clone, final boolean deepCopy)
	{
		super.cloneInto(clone, deepCopy);
		
		clone.name = this.name;
		clone.description = description;
		clone.regex = this.regex;
		clone.canBeNull = this.canBeNull;
		clone.isUnique = this.isUnique;
		
		if (deepCopy)
		{
		    if (this.propertyCategories != null)
            {
                clone.propertyCategories = new RESTPropertyCategoryTagCollectionV1();
                this.propertyCategories.cloneInto(clone.propertyCategories, deepCopy);
            }
		}
		else
		{
		    clone.propertyCategories = this.propertyCategories;
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
	
    public RESTPropertyCategoryTagCollectionV1 getPropertyCategories()
    {
        return propertyCategories;
    }

    public void setPropertyCategories(final RESTPropertyCategoryTagCollectionV1 propertyTagCategories)
    {
        this.propertyCategories = propertyTagCategories;
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
