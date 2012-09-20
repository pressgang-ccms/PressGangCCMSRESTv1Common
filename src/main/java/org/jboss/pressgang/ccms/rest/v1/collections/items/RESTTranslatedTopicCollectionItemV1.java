package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslatedTopicV1;

public class RESTTranslatedTopicCollectionItemV1 extends RESTBaseCollectionItemV1<RESTTranslatedTopicV1, RESTTranslatedTopicCollectionV1, RESTTranslatedTopicCollectionItemV1>
{
    private RESTTranslatedTopicV1 item;
    
    public RESTTranslatedTopicCollectionItemV1()
    {
        
    }
    
    public RESTTranslatedTopicCollectionItemV1(final RESTTranslatedTopicV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTTranslatedTopicCollectionItemV1(final RESTTranslatedTopicV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTranslatedTopicCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTTranslatedTopicCollectionItemV1 retValue = new RESTTranslatedTopicCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTTranslatedTopicV1 getItem()
    {
        return item;
    }

    @Override
    public void setItem(final RESTTranslatedTopicV1 item)
    {
        this.item = item;
    }
}