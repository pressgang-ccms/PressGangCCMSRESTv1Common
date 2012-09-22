package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyCategoryTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryTagV1;

public class RESTPropertyCategoryTagCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTPropertyCategoryTagV1, RESTPropertyCategoryTagCollectionV1, RESTPropertyCategoryTagCollectionItemV1>
{   
    private RESTPropertyCategoryTagV1 item;

    public RESTPropertyCategoryTagCollectionItemV1()
    {
        
    }
    
    public RESTPropertyCategoryTagCollectionItemV1(final RESTPropertyCategoryTagV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTPropertyCategoryTagCollectionItemV1(final RESTPropertyCategoryTagV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyCategoryTagCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTPropertyCategoryTagCollectionItemV1 retValue = new RESTPropertyCategoryTagCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTPropertyCategoryTagV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyCategoryTagV1 item)
    {
        this.item = item;
    }
}