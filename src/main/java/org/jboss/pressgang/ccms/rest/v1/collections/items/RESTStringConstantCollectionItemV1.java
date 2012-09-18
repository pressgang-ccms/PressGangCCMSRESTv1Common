package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTStringConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTStringConstantV1;

public class RESTStringConstantCollectionItemV1 extends RESTBaseCollectionItemV1<RESTStringConstantV1, RESTStringConstantCollectionV1, RESTStringConstantCollectionItemV1>
{
    public RESTStringConstantCollectionItemV1()
    {
        
    }
    
    public RESTStringConstantCollectionItemV1(final RESTStringConstantV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTStringConstantCollectionItemV1(final RESTStringConstantV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTStringConstantCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTStringConstantCollectionItemV1 retValue = new RESTStringConstantCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
