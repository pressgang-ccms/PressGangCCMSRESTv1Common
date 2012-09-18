package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterV1;

public class RESTFilterCollectionItemV1 extends RESTBaseCollectionItemV1<RESTFilterV1, RESTFilterCollectionV1, RESTFilterCollectionItemV1>
{
    public RESTFilterCollectionItemV1()
    {
        
    }
    
    public RESTFilterCollectionItemV1(final RESTFilterV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTFilterCollectionItemV1(final RESTFilterV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFilterCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTFilterCollectionItemV1 retValue = new RESTFilterCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
