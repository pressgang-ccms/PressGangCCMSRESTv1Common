package org.jboss.pressgangccms.rest.v1.collections.items;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTFilterLocaleCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterLocaleV1;

public class RESTFilterLocaleCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1, RESTFilterLocaleCollectionItemV1>
{
    public RESTFilterLocaleCollectionItemV1()
    {
        
    }
    
    public RESTFilterLocaleCollectionItemV1(final RESTFilterLocaleV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTFilterLocaleCollectionItemV1(final RESTFilterLocaleV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFilterLocaleCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTFilterLocaleCollectionItemV1 retValue = new RESTFilterLocaleCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
