package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTranslatedCSNodeStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedCSNodeStringV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTTranslatedCSNodeStringCollectionV1 extends RESTBaseUpdateCollectionV1<RESTTranslatedCSNodeStringV1, RESTTranslatedCSNodeStringCollectionV1, RESTTranslatedCSNodeStringCollectionItemV1> {
    private List<RESTTranslatedCSNodeStringCollectionItemV1> items = new ArrayList<RESTTranslatedCSNodeStringCollectionItemV1>();

    @Override
    public List<RESTTranslatedCSNodeStringCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTTranslatedCSNodeStringCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTTranslatedCSNodeStringV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTTranslatedCSNodeStringCollectionItemV1>();
        }

        items.add(new RESTTranslatedCSNodeStringCollectionItemV1(item, state));
    }
}
