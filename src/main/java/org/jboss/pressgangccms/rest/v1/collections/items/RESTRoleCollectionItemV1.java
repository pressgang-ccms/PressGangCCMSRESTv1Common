package org.jboss.pressgangccms.rest.v1.collections.items;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTRoleCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTRoleV1;

public class RESTRoleCollectionItemV1 extends RESTBaseCollectionItemV1<RESTRoleV1, RESTRoleCollectionV1, RESTRoleCollectionItemV1>
{
    public RESTRoleCollectionItemV1()
    {
        
    }
    
    public RESTRoleCollectionItemV1(final RESTRoleV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTRoleCollectionItemV1(final RESTRoleV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTRoleCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTRoleCollectionItemV1 retValue = new RESTRoleCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
