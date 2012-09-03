package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTFilterLocaleCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTFilterLocaleV1 extends RESTBaseEntityV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1>
{
    public static final String LOCALE_NAME = "locale";
    public static final String STATE_NAME = "state";
    public static final String FILTER_NAME = "filter";
    
    private String locale = null;
    private Integer state = null;
    private RESTFilterV1 filter = null;
    
    private RESTFilterLocaleCollectionV1 revisions = null;
    
    @Override
    public RESTFilterLocaleCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterLocaleCollectionV1 revisions)
    {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterLocaleV1 clone(boolean deepCopy)
    {
        final RESTFilterLocaleV1 retValue = new RESTFilterLocaleV1();
        
        this.cloneInto(retValue, deepCopy);
        
        retValue.locale = this.locale;
        retValue.state = this.state;
        
        if (deepCopy)
        {
            if (this.revisions != null)
            {
                retValue.revisions = new RESTFilterLocaleCollectionV1();
                revisions.cloneInto(retValue.revisions, deepCopy);
            }
            
            if (this.filter != null)
            {
                retValue.filter = this.filter.clone(deepCopy);
            }
        }
        else
        {
            retValue.revisions = this.revisions;
            retValue.filter = this.filter;
        }
        
        return retValue;
    }

    public String getLocale()
    {
        return locale;
    }

    public void setLocale(final String locale)
    {
        this.locale = locale;
    }
    
    public void explicitSetLocale(final String locale)
    {
        this.locale = locale;
        this.setParameterToConfigured(LOCALE_NAME);
    }
    
    public Integer getState()
    {
        return state;
    }

    public void setState(final Integer state)
    {
        this.state = state;
    }
    
    public void explicitSetState(final Integer state)
    {
        this.state = state;
        this.setParameterToConfigured(STATE_NAME);
    }
    
    public RESTFilterV1 getFilter()
    {
        return filter;
    }

    public void setFilter(final RESTFilterV1 filter)
    {
        this.filter = filter;
    }
    
    public void explicitSetFilter(final RESTFilterV1 filter)
    {
        this.filter = filter;
        this.setParameterToConfigured(FILTER_NAME);
    }
}
