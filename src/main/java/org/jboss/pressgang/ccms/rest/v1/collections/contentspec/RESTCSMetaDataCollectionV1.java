package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSMetaDataCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSMetaDataV1;

public class RESTCSMetaDataCollectionV1 extends RESTBaseCollectionV1<RESTCSMetaDataV1, RESTCSMetaDataCollectionV1,
        RESTCSMetaDataCollectionItemV1> {

    private List<RESTCSMetaDataCollectionItemV1> items;

    @Override
    public List<RESTCSMetaDataCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTCSMetaDataCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCSMetaDataV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTCSMetaDataCollectionItemV1>();
        }

        items.add(new RESTCSMetaDataCollectionItemV1(item, state));
    }
}
