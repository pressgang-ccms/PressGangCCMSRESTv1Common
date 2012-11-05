package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSTranslatedStringV1;

public class RESTCSTranslatedStringCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTCSTranslatedStringV1, RESTCSTranslatedStringCollectionV1, RESTCSTranslatedStringCollectionItemV1>
{
    private RESTCSTranslatedStringV1 item;
    
    public RESTCSTranslatedStringCollectionItemV1()
    {
        
    }
    
    public RESTCSTranslatedStringCollectionItemV1(final RESTCSTranslatedStringV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTCSTranslatedStringCollectionItemV1(final RESTCSTranslatedStringV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSTranslatedStringCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTCSTranslatedStringCollectionItemV1 retValue = new RESTCSTranslatedStringCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTCSTranslatedStringV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTCSTranslatedStringV1 item)
    {
        this.item = item;
    }
}