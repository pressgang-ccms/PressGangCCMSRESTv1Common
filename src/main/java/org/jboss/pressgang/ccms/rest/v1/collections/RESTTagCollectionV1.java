package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTTagCollectionV1 extends RESTBaseUpdateCollectionV1<RESTTagV1, RESTTagCollectionV1, RESTTagCollectionItemV1> {
    private List<RESTTagCollectionItemV1> items = new ArrayList<RESTTagCollectionItemV1>();

    @Override
    public List<RESTTagCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTTagCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTTagV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTTagCollectionItemV1>();
        }

        items.add(new RESTTagCollectionItemV1(item, state));
    }
}
