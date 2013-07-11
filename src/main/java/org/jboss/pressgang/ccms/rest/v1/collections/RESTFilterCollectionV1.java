package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterV1;
import org.jboss.pressgang.ccms.rest.v1.entities.enums.RESTFilterTypeV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTFilterCollectionV1 extends RESTBaseCollectionV1<RESTFilterV1, RESTFilterCollectionV1, RESTFilterCollectionItemV1> {
    private List<RESTFilterCollectionItemV1> items = new ArrayList<RESTFilterCollectionItemV1>();

    @Override
    public List<RESTFilterCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTFilterCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTFilterV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTFilterCollectionItemV1>();
        }

        items.add(new RESTFilterCollectionItemV1(item, state));
    }

    public List<RESTFilterCollectionItemV1> returnItemsOfType(final RESTFilterTypeV1 type) {
        final List<RESTFilterCollectionItemV1> items = new ArrayList<RESTFilterCollectionItemV1>();
        for (final RESTFilterCollectionItemV1 item : this.items) {
            if (item.getItem().getType() == type) {
                items.add(item);
            }
        }
        return items;
    }
}
