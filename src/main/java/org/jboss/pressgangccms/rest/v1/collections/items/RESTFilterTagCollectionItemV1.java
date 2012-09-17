package org.jboss.pressgangccms.rest.v1.collections.items;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTFilterTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterTagV1;

public class RESTFilterTagCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTFilterTagV1, RESTFilterTagCollectionV1, RESTFilterTagCollectionItemV1>
{
    public RESTFilterTagCollectionItemV1()
    {
        
    }
    
    public RESTFilterTagCollectionItemV1(final RESTFilterTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTFilterTagCollectionItemV1(final RESTFilterTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFilterTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTFilterTagCollectionItemV1 retValue = new RESTFilterTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
