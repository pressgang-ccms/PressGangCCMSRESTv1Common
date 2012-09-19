package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTStringConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTStringConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTStringConstantCollectionV1 extends RESTBaseCollectionV1<RESTStringConstantV1, RESTStringConstantCollectionV1, RESTStringConstantCollectionItemV1>
{
    @Override
    protected void addItem(final RESTStringConstantV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTStringConstantCollectionItemV1>());
        }
        
        getItems().add(new RESTStringConstantCollectionItemV1(item, state));
    }
}
