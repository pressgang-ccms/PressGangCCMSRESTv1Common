package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterCategoryCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterCategoryV1, RESTFilterCategoryCollectionV1, RESTFilterCategoryCollectionItemV1>
{
    @Override
    protected void addItem(final RESTFilterCategoryV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTFilterCategoryCollectionItemV1>());
        }
        
        getItems().add(new RESTFilterCategoryCollectionItemV1(item, state));
    }
}
