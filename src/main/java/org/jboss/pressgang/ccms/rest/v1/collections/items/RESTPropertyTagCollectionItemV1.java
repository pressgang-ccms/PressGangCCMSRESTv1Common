package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;

public class RESTPropertyTagCollectionItemV1 extends RESTBaseCollectionItemV1<RESTPropertyTagV1, RESTPropertyTagCollectionV1, RESTPropertyTagCollectionItemV1>
{   
    private static final Integer MAX_STATE = 2;

    public RESTPropertyTagCollectionItemV1()
    {
        
    }
    
    public RESTPropertyTagCollectionItemV1(final RESTPropertyTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTPropertyTagCollectionItemV1(final RESTPropertyTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTPropertyTagCollectionItemV1 retValue = new RESTPropertyTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    @Override
    protected boolean validState(final Integer state)
    {
        return !(state == null || state < MIN_STATE || state > MAX_STATE);
    }
}
