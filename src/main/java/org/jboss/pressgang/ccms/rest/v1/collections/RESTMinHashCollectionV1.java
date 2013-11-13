package org.jboss.pressgang.ccms.rest.v1.collections;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTMinHashCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProjectCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTMinHashV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;

import java.util.ArrayList;
import java.util.List;


public class RESTMinHashCollectionV1  extends RESTBaseCollectionV1<RESTMinHashV1, RESTMinHashCollectionV1, RESTMinHashCollectionItemV1> {
    private List<RESTMinHashCollectionItemV1> items = new ArrayList<RESTMinHashCollectionItemV1>();

    @Override
    public List<RESTMinHashCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTMinHashCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTMinHashV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTMinHashCollectionItemV1>();
        }

        items.add(new RESTMinHashCollectionItemV1(item, state));
    }
}
