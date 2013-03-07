package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSTranslatedNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSTranslatedNodeV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTCSTranslatedNodeCollectionV1 extends RESTBaseUpdateCollectionV1<RESTCSTranslatedNodeV1,
        RESTCSTranslatedNodeCollectionV1, RESTCSTranslatedNodeCollectionItemV1> {
    private List<RESTCSTranslatedNodeCollectionItemV1> items = new ArrayList<RESTCSTranslatedNodeCollectionItemV1>();

    @Override
    public List<RESTCSTranslatedNodeCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTCSTranslatedNodeCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCSTranslatedNodeV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTCSTranslatedNodeCollectionItemV1>();
        }

        items.add(new RESTCSTranslatedNodeCollectionItemV1(item, state));
    }
}
