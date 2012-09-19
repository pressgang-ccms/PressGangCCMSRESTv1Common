package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterTagCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterTagV1, RESTFilterTagCollectionV1, RESTFilterTagCollectionItemV1>
{
    @Override
    protected void addItem(final RESTFilterTagV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTFilterTagCollectionItemV1>());
        }
        
        getItems().add(new RESTFilterTagCollectionItemV1(item, state));
    }
}
