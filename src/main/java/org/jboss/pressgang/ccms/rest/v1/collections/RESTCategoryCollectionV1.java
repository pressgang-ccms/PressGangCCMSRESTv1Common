package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTCategoryCollectionV1 extends RESTBaseCollectionV1<RESTCategoryV1, RESTCategoryCollectionV1, RESTCategoryCollectionItemV1> {
    private List<RESTCategoryCollectionItemV1> items = new ArrayList<RESTCategoryCollectionItemV1>();

    @Override
    public List<RESTCategoryCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTCategoryCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCategoryV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTCategoryCollectionItemV1>();
        }

        items.add(new RESTCategoryCollectionItemV1(item, state));
    }
}
