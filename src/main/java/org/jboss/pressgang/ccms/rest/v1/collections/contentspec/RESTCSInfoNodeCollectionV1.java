package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSInfoNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSInfoNodeV1;

public class RESTCSInfoNodeCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTCSInfoNodeV1, RESTCSInfoNodeCollectionV1,
        RESTCSInfoNodeCollectionItemV1> {
    private List<RESTCSInfoNodeCollectionItemV1> items = new ArrayList<RESTCSInfoNodeCollectionItemV1>();

    @Override
    public List<RESTCSInfoNodeCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTCSInfoNodeCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCSInfoNodeV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTCSInfoNodeCollectionItemV1>();
        }

        items.add(new RESTCSInfoNodeCollectionItemV1(item, state));
    }
}
