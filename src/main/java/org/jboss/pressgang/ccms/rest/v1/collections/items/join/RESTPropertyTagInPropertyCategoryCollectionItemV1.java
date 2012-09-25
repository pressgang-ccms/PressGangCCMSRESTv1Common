package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagInPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyTagInPropertyCategoryV1;

public class RESTPropertyTagInPropertyCategoryCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTPropertyTagInPropertyCategoryV1, RESTPropertyTagInPropertyCategoryCollectionV1, RESTPropertyTagInPropertyCategoryCollectionItemV1>
{   
    private RESTPropertyTagInPropertyCategoryV1 item;

    public RESTPropertyTagInPropertyCategoryCollectionItemV1()
    {
        
    }
    
    public RESTPropertyTagInPropertyCategoryCollectionItemV1(final RESTPropertyTagInPropertyCategoryV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTPropertyTagInPropertyCategoryCollectionItemV1(final RESTPropertyTagInPropertyCategoryV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyTagInPropertyCategoryCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTPropertyTagInPropertyCategoryCollectionItemV1 retValue = new RESTPropertyTagInPropertyCategoryCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTPropertyTagInPropertyCategoryV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyTagInPropertyCategoryV1 item)
    {
        this.item = item;
    }
}