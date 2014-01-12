package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTServerUndefinedEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTServerUndefinedEntityV1;

public class RESTServerUndefinedEntityCollectionV1 extends RESTBaseUndefinedSettingCollectionV1<RESTServerUndefinedEntityV1,
        Integer, RESTServerUndefinedEntityCollectionItemV1> {
    private List<RESTServerUndefinedEntityCollectionItemV1> items = new ArrayList<RESTServerUndefinedEntityCollectionItemV1>();

    @Override
    public List<RESTServerUndefinedEntityCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTServerUndefinedEntityCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(RESTServerUndefinedEntityV1 item, Integer state) {
        if (items == null) {
            items = new ArrayList<RESTServerUndefinedEntityCollectionItemV1>();
        }

        items.add(new RESTServerUndefinedEntityCollectionItemV1(item, state));
    }
}
