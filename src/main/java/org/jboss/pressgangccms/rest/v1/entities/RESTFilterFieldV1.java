package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTFilterFieldCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTFilterFieldV1 extends RESTBaseEntityV1<RESTFilterFieldV1, RESTFilterFieldCollectionV1>
{
    public static final String NAME_NAME = "name";
    public static final String VALUE_NAME = "value";
    public static final String DESCRIPTION_NAME = "description";
    
    private String name = null;
    private String value = null;
    private String description = null;
    
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
        
        retValue.description = this.description;
        retValue.name = this.name;
        retValue.value = this.value;
        
        if (deepCopy)
        {
            if (this.revisions != null)
            {
                retValue.revisions = new RESTFilterFieldCollectionV1();
                revisions.cloneInto(retValue.revisions, deepCopy);
            }
        }
        else
        {
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
}