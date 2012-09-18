package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;

public class RESTCategoryCollectionItemV1 extends RESTBaseCollectionItemV1<RESTCategoryV1, RESTCategoryCollectionV1, RESTCategoryCollectionItemV1>
{
    public RESTCategoryCollectionItemV1()
    {
        
    }
    
    public RESTCategoryCollectionItemV1(final RESTCategoryV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTCategoryCollectionItemV1(final RESTCategoryV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCategoryCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTCategoryCollectionItemV1 retValue = new RESTCategoryCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
