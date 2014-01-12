package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProcessInformationCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTProcessInformationV1;

public class RESTProcessInformationCollectionV1  extends RESTBaseCollectionV1<RESTProcessInformationV1, RESTProcessInformationCollectionItemV1> {
    private List<RESTProcessInformationCollectionItemV1> items = new ArrayList<RESTProcessInformationCollectionItemV1>();

    @Override
    public List<RESTProcessInformationCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTProcessInformationCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTProcessInformationV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTProcessInformationCollectionItemV1>();
        }

        items.add(new RESTProcessInformationCollectionItemV1(item, state));
    }
}
