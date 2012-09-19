package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTopicCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTopicCollectionV1 extends RESTBaseCollectionV1<RESTTopicV1, RESTTopicCollectionV1, RESTTopicCollectionItemV1>
{
    @Override
    protected void addItem(final RESTTopicV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTTopicCollectionItemV1>());
        }
        
        getItems().add(new RESTTopicCollectionItemV1(item, state));
    }
}
