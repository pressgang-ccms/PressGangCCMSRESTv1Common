package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTServerUndefinedSettingCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTServerUndefinedSettingV1;

public class RESTServerUndefinedSettingCollectionV1 extends RESTBaseUndefinedSettingCollectionV1<RESTServerUndefinedSettingV1,
        String, RESTServerUndefinedSettingCollectionItemV1> {
    private List<RESTServerUndefinedSettingCollectionItemV1> items = new ArrayList<RESTServerUndefinedSettingCollectionItemV1>();

    @Override
    public List<RESTServerUndefinedSettingCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTServerUndefinedSettingCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(RESTServerUndefinedSettingV1 item, Integer state) {
        if (items == null) {
            items = new ArrayList<RESTServerUndefinedSettingCollectionItemV1>();
        }

        items.add(new RESTServerUndefinedSettingCollectionItemV1(item, state));
    }
}
