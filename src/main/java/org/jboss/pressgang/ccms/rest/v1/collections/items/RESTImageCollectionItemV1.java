package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTImageCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTImageV1;

public class RESTImageCollectionItemV1 extends RESTBaseCollectionItemV1<RESTImageV1, RESTImageCollectionV1, RESTImageCollectionItemV1>
{
    private RESTImageV1 item;
    
    public RESTImageCollectionItemV1()
    {
        
    }
    
    public RESTImageCollectionItemV1(final RESTImageV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTImageCollectionItemV1(final RESTImageV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTImageCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTImageCollectionItemV1 retValue = new RESTImageCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTImageV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTImageV1 item)
    {
        this.item = item;
    }
}