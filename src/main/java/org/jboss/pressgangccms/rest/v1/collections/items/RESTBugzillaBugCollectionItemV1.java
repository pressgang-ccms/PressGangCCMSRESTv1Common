package org.jboss.pressgangccms.rest.v1.collections.items;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTBugzillaBugCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTBugzillaBugV1;

public class RESTBugzillaBugCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTBugzillaBugV1, RESTBugzillaBugCollectionV1, RESTBugzillaBugCollectionItemV1>
{
    public RESTBugzillaBugCollectionItemV1()
    {
        
    }
    
    public RESTBugzillaBugCollectionItemV1(final RESTBugzillaBugV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTBugzillaBugCollectionItemV1(final RESTBugzillaBugV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTBugzillaBugCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTBugzillaBugCollectionItemV1 retValue = new RESTBugzillaBugCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
