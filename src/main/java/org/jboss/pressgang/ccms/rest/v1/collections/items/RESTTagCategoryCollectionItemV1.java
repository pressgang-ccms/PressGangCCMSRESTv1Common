package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTTagCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTTagCategoryV1;

public class RESTTagCategoryCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTTagCategoryV1, RESTTagCategoryCollectionV1, RESTTagCategoryCollectionItemV1>
{
    private RESTTagCategoryV1 item;
    
    public RESTTagCategoryCollectionItemV1()
    {
        
    }
    
    public RESTTagCategoryCollectionItemV1(final RESTTagCategoryV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTTagCategoryCollectionItemV1(final RESTTagCategoryV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTagCategoryCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTTagCategoryCollectionItemV1 retValue = new RESTTagCategoryCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTTagCategoryV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTTagCategoryV1 item)
    {
        this.item = item;
    }
}