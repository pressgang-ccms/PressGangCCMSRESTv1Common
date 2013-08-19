package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTPropertyCategoryCollectionV1 extends RESTBaseCollectionV1<RESTPropertyCategoryV1, RESTPropertyCategoryCollectionV1,
        RESTPropertyCategoryCollectionItemV1> {
    private List<RESTPropertyCategoryCollectionItemV1> items = new ArrayList<RESTPropertyCategoryCollectionItemV1>();

    @Override
    public List<RESTPropertyCategoryCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTPropertyCategoryCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTPropertyCategoryV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTPropertyCategoryCollectionItemV1>();
        }

        items.add(new RESTPropertyCategoryCollectionItemV1(item, state));
    }
}
