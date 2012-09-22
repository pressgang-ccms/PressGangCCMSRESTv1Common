package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;

public class RESTAssignedPropertyTagCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTAssignedPropertyTagV1, RESTAssignedPropertyTagCollectionV1, RESTAssignedPropertyTagCollectionItemV1>
{
    private RESTAssignedPropertyTagV1 item;
    
    public RESTAssignedPropertyTagCollectionItemV1()
    {
        
    }

    public RESTAssignedPropertyTagCollectionItemV1(final RESTAssignedPropertyTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTAssignedPropertyTagCollectionItemV1(final RESTAssignedPropertyTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTAssignedPropertyTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTAssignedPropertyTagCollectionItemV1 retValue = new RESTAssignedPropertyTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTAssignedPropertyTagV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTAssignedPropertyTagV1 item)
    {
        this.item = item;
    }
}
