package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBlobConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTBlobConstantV1;

public class RESTBlobConstantCollectionItemV1 extends RESTBaseCollectionItemV1<RESTBlobConstantV1, RESTBlobConstantCollectionV1, RESTBlobConstantCollectionItemV1>
{
    public RESTBlobConstantCollectionItemV1()
    {
        
    }
    
    public RESTBlobConstantCollectionItemV1(final RESTBlobConstantV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTBlobConstantCollectionItemV1(final RESTBlobConstantV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTBlobConstantCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTBlobConstantCollectionItemV1 retValue = new RESTBlobConstantCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
