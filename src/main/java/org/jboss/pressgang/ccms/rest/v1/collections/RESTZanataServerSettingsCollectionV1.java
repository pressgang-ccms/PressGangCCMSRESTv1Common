package org.jboss.pressgang.ccms.rest.v1.collections;

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.UNCHANGED_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTZanataServerSettingsCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTZanataServerSettingsV1;

public class RESTZanataServerSettingsCollectionV1 extends RESTBaseCollectionV1<RESTZanataServerSettingsV1,
        RESTZanataServerSettingsCollectionItemV1> implements RESTUpdateCollectionV1<RESTZanataServerSettingsV1,
                RESTZanataServerSettingsCollectionItemV1> {
    private List<RESTZanataServerSettingsCollectionItemV1> items = new ArrayList<RESTZanataServerSettingsCollectionItemV1>();

    @Override
    public List<RESTZanataServerSettingsCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTZanataServerSettingsCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(RESTZanataServerSettingsV1 item, Integer state) {
        if (items == null) {
            items = new ArrayList<RESTZanataServerSettingsCollectionItemV1>();
        }

        items.add(new RESTZanataServerSettingsCollectionItemV1(item, state));
    }

    @Override
    public List<RESTZanataServerSettingsV1> returnUpdatedItems() {
        return returnItemsWithState(Arrays.asList(UPDATE_STATE));
    }

    @Override
    public List<RESTZanataServerSettingsCollectionItemV1> returnExistingAddedAndUpdatedCollectionItems() {
        return returnCollectionItemsWithState(Arrays.asList(UNCHANGED_STATE, ADD_STATE, UPDATE_STATE));
    }

    @Override
    public List<RESTZanataServerSettingsCollectionItemV1> returnDeletedAddedAndUpdatedCollectionItems() {
        return returnCollectionItemsWithState(Arrays.asList(REMOVE_STATE, ADD_STATE, UPDATE_STATE));
    }

    @Override
    public List<RESTZanataServerSettingsCollectionItemV1> returnUpdatedCollectionItems() {
        return returnCollectionItemsWithState(Arrays.asList(UPDATE_STATE));
    }

    @Override
    public void addUpdateItem(final RESTZanataServerSettingsV1 item) {
        addItem(item, UPDATE_STATE);
    }
}
