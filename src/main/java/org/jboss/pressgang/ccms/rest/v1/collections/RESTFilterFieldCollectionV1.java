package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterFieldCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterFieldV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterFieldCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterFieldV1, RESTFilterFieldCollectionV1, RESTFilterFieldCollectionItemV1>
{
    @Override
    protected void addItem(final RESTFilterFieldV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTFilterFieldCollectionItemV1>());
        }
        
        getItems().add(new RESTFilterFieldCollectionItemV1(item, state));
    }
}
