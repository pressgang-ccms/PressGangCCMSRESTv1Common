package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyCategoryInPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryInPropertyTagV1;

public class RESTPropertyCategoryInPropetyTagCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTPropertyCategoryInPropertyTagV1, RESTPropertyCategoryInPropertyTagCollectionV1, RESTPropertyCategoryInPropetyTagCollectionItemV1>
{   
    private RESTPropertyCategoryInPropertyTagV1 item;

    public RESTPropertyCategoryInPropetyTagCollectionItemV1()
    {
        
    }
    
    public RESTPropertyCategoryInPropetyTagCollectionItemV1(final RESTPropertyCategoryInPropertyTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTPropertyCategoryInPropetyTagCollectionItemV1(final RESTPropertyCategoryInPropertyTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyCategoryInPropetyTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTPropertyCategoryInPropetyTagCollectionItemV1 retValue = new RESTPropertyCategoryInPropetyTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTPropertyCategoryInPropertyTagV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyCategoryInPropertyTagV1 item)
    {
        this.item = item;
    }
}