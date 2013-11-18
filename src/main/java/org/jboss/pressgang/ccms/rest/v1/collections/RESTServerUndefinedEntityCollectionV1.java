package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTApplicationUndefinedEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTServerUndefinedEntityV1;

public class RESTServerUndefinedEntityCollectionV1 extends RESTBaseUndefinedSettingCollectionV1<RESTServerUndefinedEntityV1,
        Integer, RESTApplicationUndefinedEntityCollectionItemV1> {
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
    protected void addItem(RESTServerUndefinedEntityV1 item, Integer state) {
        if (items == null) {
            items = new ArrayList<RESTApplicationUndefinedEntityCollectionItemV1>();
        }

        items.add(new RESTApplicationUndefinedEntityCollectionItemV1(item, state));
    }
}
