package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTPropertyTagCollectionV1 extends RESTBaseCollectionV1<RESTPropertyTagV1, RESTPropertyTagCollectionV1, RESTPropertyTagCollectionItemV1>
{
    @Override
    protected void addItem(final RESTPropertyTagV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTPropertyTagCollectionItemV1>());
        }
        
        getItems().add(new RESTPropertyTagCollectionItemV1(item, state));
    }
}
