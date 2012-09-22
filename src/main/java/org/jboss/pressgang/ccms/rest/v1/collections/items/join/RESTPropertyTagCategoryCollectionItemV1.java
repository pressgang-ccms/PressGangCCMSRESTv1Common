package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyTagCategoryV1;

public class RESTPropertyTagCategoryCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTPropertyTagCategoryV1, RESTPropertyTagCategoryCollectionV1, RESTPropertyTagCategoryCollectionItemV1>
{   
    private RESTPropertyTagCategoryV1 item;

    public RESTPropertyTagCategoryCollectionItemV1()
    {
        
    }
    
    public RESTPropertyTagCategoryCollectionItemV1(final RESTPropertyTagCategoryV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTPropertyTagCategoryCollectionItemV1(final RESTPropertyTagCategoryV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyTagCategoryCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTPropertyTagCategoryCollectionItemV1 retValue = new RESTPropertyTagCategoryCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTPropertyTagCategoryV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyTagCategoryV1 item)
    {
        this.item = item;
    }
}