package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTApplicationUndefinedSettingCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTServerUndefinedSettingV1;

public class RESTServerUndefinedSettingCollectionV1 extends RESTBaseUndefinedSettingCollectionV1<RESTServerUndefinedSettingV1,
        String, RESTApplicationUndefinedSettingCollectionItemV1> {
    private List<RESTApplicationUndefinedSettingCollectionItemV1> items = new ArrayList<RESTApplicationUndefinedSettingCollectionItemV1>();

    @Override
    public List<RESTApplicationUndefinedSettingCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTApplicationUndefinedSettingCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(RESTServerUndefinedSettingV1 item, Integer state) {
        if (items == null) {
            items = new ArrayList<RESTApplicationUndefinedSettingCollectionItemV1>();
        }

        items.add(new RESTApplicationUndefinedSettingCollectionItemV1(item, state));
    }
}
