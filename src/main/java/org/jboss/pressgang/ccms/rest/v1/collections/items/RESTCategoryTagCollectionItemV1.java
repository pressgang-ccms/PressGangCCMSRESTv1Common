package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTCategoryTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryTagV1;

public class RESTCategoryTagCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTCategoryTagV1, RESTCategoryTagCollectionV1, RESTCategoryTagCollectionItemV1>
{
    public RESTCategoryTagCollectionItemV1()
    {
        
    }
    
    public RESTCategoryTagCollectionItemV1(final RESTCategoryTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTCategoryTagCollectionItemV1(final RESTCategoryTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCategoryTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTCategoryTagCollectionItemV1 retValue = new RESTCategoryTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
