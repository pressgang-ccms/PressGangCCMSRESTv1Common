package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProjectCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTProjectCollectionV1 extends RESTBaseCollectionV1<RESTProjectV1, RESTProjectCollectionV1, RESTProjectCollectionItemV1>
{
    @Override
    protected void addItem(final RESTProjectV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTProjectCollectionItemV1>());
        }
        
        getItems().add(new RESTProjectCollectionItemV1(item, state));
    }
}
