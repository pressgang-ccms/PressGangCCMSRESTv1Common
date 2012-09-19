package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTCategoryCollectionV1 extends RESTBaseCollectionV1<RESTCategoryV1, RESTCategoryCollectionV1, RESTCategoryCollectionItemV1>
{
    @Override
    protected void addItem(final RESTCategoryV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTCategoryCollectionItemV1>());
        }
        
        getItems().add(new RESTCategoryCollectionItemV1(item, state));
    }
}
