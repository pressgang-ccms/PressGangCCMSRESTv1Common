package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBugzillaBugCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTBugzillaBugV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTBugzillaBugCollectionV1 extends RESTBaseUpdateCollectionV1<RESTBugzillaBugV1, RESTBugzillaBugCollectionV1, RESTBugzillaBugCollectionItemV1>
{
    @Override
    protected void addItem(final RESTBugzillaBugV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTBugzillaBugCollectionItemV1>());
        }
        
        getItems().add(new RESTBugzillaBugCollectionItemV1(item, state));
    }
}
