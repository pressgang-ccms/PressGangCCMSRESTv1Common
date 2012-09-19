package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterLocaleCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterLocaleV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterLocaleCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1, RESTFilterLocaleCollectionItemV1>
{
    @Override
    protected void addItem(final RESTFilterLocaleV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTFilterLocaleCollectionItemV1>());
        }
        
        getItems().add(new RESTFilterLocaleCollectionItemV1(item, state));
    }
}
