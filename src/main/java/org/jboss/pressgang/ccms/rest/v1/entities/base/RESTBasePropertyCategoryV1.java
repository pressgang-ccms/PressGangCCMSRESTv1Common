package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagInPropertyCategoryCollectionV1;

public abstract class RESTBasePropertyCategoryV1<T extends RESTBasePropertyCategoryV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>, V extends RESTBaseCollectionItemV1<T, U, V>>
    extends RESTBasePrimaryEntityV1<T, U, V>
{
	public static final String NAME_NAME = "name";
	public static final String DESCRIPTION_NAME = "description";
	public static final String PROPERTY_TAGS_NAME = "propertyTags";
	
	protected String name = null;
	protected String description = null;
	protected RESTPropertyTagInPropertyCategoryCollectionV1 propertyTags = null;
	
	public void cloneInto(final RESTBasePropertyCategoryV1<?, ?, ?> clone, final boolean deepCopy)
	{
		super.cloneInto(clone, deepCopy);
		
		clone.name = this.name;
		clone.description = description;
		
		if (deepCopy)
		{
		    if (this.propertyTags != null)
            {
                clone.propertyTags = new RESTPropertyTagInPropertyCategoryCollectionV1();
                this.propertyTags.cloneInto(clone.propertyTags, deepCopy);
            }
		}
		else
		{
		    clone.propertyTags = this.propertyTags;
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
	
	public RESTPropertyTagInPropertyCategoryCollectionV1 getPropertyTags()
    {
        return propertyTags;
    }

    public void setPropertyTags(final RESTPropertyTagInPropertyCategoryCollectionV1 propertyTags)
    {
        this.propertyTags = propertyTags;
    }
	
	@Override
    public boolean equals(final Object other)
    {
        if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTBasePropertyCategoryV1))
            return false;
        
        return super.equals(other);
    }
}
