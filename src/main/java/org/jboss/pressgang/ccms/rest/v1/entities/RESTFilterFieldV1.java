package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterFieldCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterFieldCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTFilterFieldV1 extends RESTBaseEntityV1<RESTFilterFieldV1, RESTFilterFieldCollectionV1, RESTFilterFieldCollectionItemV1>
{
    public static final String NAME_NAME = "name";
    public static final String VALUE_NAME = "value";
    public static final String DESCRIPTION_NAME = "description";
    public static final String FILTER_NAME = "filter";
    
    private String name = null;
    private String value = null;
    private String description = null;
    private RESTFilterV1 filter = null;
    
    private RESTFilterFieldCollectionV1 revisions = null;
    
    @Override
    public RESTFilterFieldCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterFieldCollectionV1 revisions)
    {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterFieldV1 clone(boolean deepCopy)
    {
        final RESTFilterFieldV1 retValue = new RESTFilterFieldV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTFilterFieldV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);

        clone.description = this.description;
        clone.name = this.name;
        clone.value = this.value;
        
        if (deepCopy)
        {
            if (this.revisions != null)
            {
                clone.revisions = new RESTFilterFieldCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
            
            if (this.filter != null)
            {
                clone.filter = this.filter.clone(deepCopy);
            }
        }
        else
        {
            clone.revisions = this.revisions;
            clone.filter = this.filter;
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

    public String getValue()
    {
        return value;
    }

    public void setValue(final String value)
    {
        this.value = value;
    }
    
    public void explicitSetValue(final String value)
    {
        this.value = value;
        this.setParameterToConfigured(VALUE_NAME);
    }
    
    public RESTFilterV1 getFilter()
    {
        return filter;
    }

    public void setFilter(final RESTFilterV1 filter)
    {
        this.filter = filter;
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (!(other instanceof RESTFilterFieldV1))
            return false;
        
        return super.equals(other);
    }
}