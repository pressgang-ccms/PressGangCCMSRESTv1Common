package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTopicCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTTopicCollectionV1 extends RESTBaseEntityCollectionV1<RESTTopicV1, RESTTopicCollectionV1, RESTTopicCollectionItemV1> {
    private List<RESTTopicCollectionItemV1> items = new ArrayList<RESTTopicCollectionItemV1>();

    @Override
    public List<RESTTopicCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTTopicCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTTopicV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTTopicCollectionItemV1>();
        }

        items.add(new RESTTopicCollectionItemV1(item, state));
    }
}
