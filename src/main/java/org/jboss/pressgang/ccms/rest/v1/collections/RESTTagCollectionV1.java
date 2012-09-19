package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTagCollectionV1 extends RESTBaseUpdateCollectionV1<RESTTagV1, RESTTagCollectionV1, RESTTagCollectionItemV1>
{
    @Override
    protected void addItem(final RESTTagV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTTagCollectionItemV1>());
        }
        
        getItems().add(new RESTTagCollectionItemV1(item, state));
    }
}
