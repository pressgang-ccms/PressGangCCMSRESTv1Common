package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTextContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTextContentSpecV1;

public class RESTTextContentSpecCollectionV1 extends RESTBaseCollectionV1<RESTTextContentSpecV1, RESTTextContentSpecCollectionV1, RESTTextContentSpecCollectionItemV1> {
    private List<RESTTextContentSpecCollectionItemV1> items = new ArrayList<RESTTextContentSpecCollectionItemV1>();

    @Override
    public List<RESTTextContentSpecCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTTextContentSpecCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTTextContentSpecV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTTextContentSpecCollectionItemV1>();
        }

        items.add(new RESTTextContentSpecCollectionItemV1(item, state));
    }
}
