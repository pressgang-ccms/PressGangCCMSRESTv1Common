package org.jboss.pressgangccms.rest.v1.collections.items;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTIntegerConstantCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTIntegerConstantV1;

public class RESTIntegerConstantCollectionItemV1 extends RESTBaseCollectionItemV1<RESTIntegerConstantV1, RESTIntegerConstantCollectionV1, RESTIntegerConstantCollectionItemV1>
{
    public RESTIntegerConstantCollectionItemV1()
    {
        
    }
    
    public RESTIntegerConstantCollectionItemV1(final RESTIntegerConstantV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTIntegerConstantCollectionItemV1(final RESTIntegerConstantV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTIntegerConstantCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTIntegerConstantCollectionItemV1 retValue = new RESTIntegerConstantCollectionItemV1();
        
        super.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
}
