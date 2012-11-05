package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTCSRelatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.RESTCSRelatedNodeV1;

public class RESTCSRelatedNodeCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTCSRelatedNodeV1, RESTCSRelatedNodeCollectionV1, RESTCSRelatedNodeCollectionItemV1>
{
    private RESTCSRelatedNodeV1 item;
    
    public RESTCSRelatedNodeCollectionItemV1()
    {
        
    }
    
    public RESTCSRelatedNodeCollectionItemV1(final RESTCSRelatedNodeV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTCSRelatedNodeCollectionItemV1(final RESTCSRelatedNodeV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSRelatedNodeCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTCSRelatedNodeCollectionItemV1 retValue = new RESTCSRelatedNodeCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    @Override
    public RESTCSRelatedNodeV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTCSRelatedNodeV1 item)
    {
        this.item = item;
    }
}
