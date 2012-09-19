package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterCollectionV1 extends RESTBaseCollectionV1<RESTFilterV1, RESTFilterCollectionV1, RESTFilterCollectionItemV1>
{
    @Override
    protected void addItem(final RESTFilterV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTFilterCollectionItemV1>());
        }
        
        getItems().add(new RESTFilterCollectionItemV1(item, state));
    }
}
