package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTCategoryInTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryInTagV1;

public class RESTCategoryInTagCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTCategoryInTagV1, RESTCategoryInTagCollectionV1, RESTCategoryInTagCollectionItemV1>
{
    private RESTCategoryInTagV1 item;
    
    public RESTCategoryInTagCollectionItemV1()
    {
        
    }
    
    public RESTCategoryInTagCollectionItemV1(final RESTCategoryInTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTCategoryInTagCollectionItemV1(final RESTCategoryInTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCategoryInTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTCategoryInTagCollectionItemV1 retValue = new RESTCategoryInTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    @Override
    public RESTCategoryInTagV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTCategoryInTagV1 item)
    {
        this.item = item;
    }
}
