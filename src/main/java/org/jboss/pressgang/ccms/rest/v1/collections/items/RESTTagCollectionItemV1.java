package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;

public class RESTTagCollectionItemV1 extends RESTBaseCollectionItemV1<RESTTagV1, RESTTagCollectionV1, RESTTagCollectionItemV1>
{
    public RESTTagCollectionItemV1()
    {
        
    }
    
    public RESTTagCollectionItemV1(final RESTTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTTagCollectionItemV1(final RESTTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTTagCollectionItemV1 retValue = new RESTTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
