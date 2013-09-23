package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTApplicationUndefinedEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTApplicationUndefinedEntityV1;

public class RESTApplicationUndefinedEntityCollectionV1 extends RESTBaseUndefinedSettingCollectionV1<RESTApplicationUndefinedEntityV1,
        RESTApplicationUndefinedEntityCollectionItemV1> {
    private List<RESTApplicationUndefinedEntityCollectionItemV1> items = new ArrayList<RESTApplicationUndefinedEntityCollectionItemV1>();

    @Override
    public List<RESTApplicationUndefinedEntityCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTApplicationUndefinedEntityCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(RESTApplicationUndefinedEntityV1 item, Integer state) {
        if (items == null) {
            items = new ArrayList<RESTApplicationUndefinedEntityCollectionItemV1>();
        }

        items.add(new RESTApplicationUndefinedEntityCollectionItemV1(item, state));
    }
}
