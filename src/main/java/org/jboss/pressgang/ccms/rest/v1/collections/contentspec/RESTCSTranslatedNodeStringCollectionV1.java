package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSTranslatedNodeStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSTranslatedNodeStringV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTCSTranslatedNodeStringCollectionV1 extends RESTBaseUpdateCollectionV1<RESTCSTranslatedNodeStringV1,
        RESTCSTranslatedNodeStringCollectionV1, RESTCSTranslatedNodeStringCollectionItemV1> {
    private List<RESTCSTranslatedNodeStringCollectionItemV1> items = new ArrayList<RESTCSTranslatedNodeStringCollectionItemV1>();

    @Override
    public List<RESTCSTranslatedNodeStringCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTCSTranslatedNodeStringCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCSTranslatedNodeStringV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTCSTranslatedNodeStringCollectionItemV1>();
        }

        items.add(new RESTCSTranslatedNodeStringCollectionItemV1(item, state));
    }
}
