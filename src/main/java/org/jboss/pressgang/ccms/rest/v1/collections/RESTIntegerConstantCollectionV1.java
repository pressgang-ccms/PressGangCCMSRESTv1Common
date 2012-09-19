package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTIntegerConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTIntegerConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTIntegerConstantCollectionV1 extends RESTBaseCollectionV1<RESTIntegerConstantV1, RESTIntegerConstantCollectionV1, RESTIntegerConstantCollectionItemV1>
{
    @Override
    protected void addItem(final RESTIntegerConstantV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTIntegerConstantCollectionItemV1>());
        }
        
        getItems().add(new RESTIntegerConstantCollectionItemV1(item, state));
    }
}
