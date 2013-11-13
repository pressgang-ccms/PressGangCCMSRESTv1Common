package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFileCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFileV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTFileCollectionV1 extends RESTBaseEntityCollectionV1<RESTFileV1, RESTFileCollectionV1, RESTFileCollectionItemV1> {
    private List<RESTFileCollectionItemV1> items = new ArrayList<RESTFileCollectionItemV1>();

    @Override
    public List<RESTFileCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTFileCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTFileV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTFileCollectionItemV1>();
        }

        items.add(new RESTFileCollectionItemV1(item, state));
    }
}
