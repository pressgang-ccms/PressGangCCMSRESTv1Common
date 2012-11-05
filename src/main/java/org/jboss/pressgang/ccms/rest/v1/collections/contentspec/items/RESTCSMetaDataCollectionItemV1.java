package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSMetaDataCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSMetaDataV1;

public class RESTCSMetaDataCollectionItemV1 extends RESTBaseCollectionItemV1<RESTCSMetaDataV1, RESTCSMetaDataCollectionV1, RESTCSMetaDataCollectionItemV1>
{
    private RESTCSMetaDataV1 item;
    
    public RESTCSMetaDataCollectionItemV1()
    {
        
    }
    
    public RESTCSMetaDataCollectionItemV1(final RESTCSMetaDataV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTCSMetaDataCollectionItemV1(final RESTCSMetaDataV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSMetaDataCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTCSMetaDataCollectionItemV1 retValue = new RESTCSMetaDataCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    @Override
    public RESTCSMetaDataV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTCSMetaDataV1 item)
    {
        this.item = item;
    }
}
