package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTUserCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTUserV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTUserCollectionV1 extends RESTBaseCollectionV1<RESTUserV1, RESTUserCollectionV1, RESTUserCollectionItemV1>
{
    @Override
    protected void addItem(final RESTUserV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTUserCollectionItemV1>());
        }
        
        getItems().add(new RESTUserCollectionItemV1(item, state));
    }
}
