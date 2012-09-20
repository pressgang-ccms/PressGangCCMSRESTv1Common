package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;

public class RESTProjectCollectionItemV1 extends RESTBaseCollectionItemV1<RESTProjectV1, RESTProjectCollectionV1, RESTProjectCollectionItemV1>
{
    private RESTProjectV1 item;
    
    public RESTProjectCollectionItemV1()
    {
        
    }
    
    public RESTProjectCollectionItemV1(final RESTProjectV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTProjectCollectionItemV1(final RESTProjectV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTProjectCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTProjectCollectionItemV1 retValue = new RESTProjectCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTProjectV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTProjectV1 item)
    {
        this.item = item;
    }
}