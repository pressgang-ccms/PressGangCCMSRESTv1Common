package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTranslatedCSNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedCSNodeV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTTranslatedCSNodeCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTTranslatedCSNodeV1, RESTTranslatedCSNodeCollectionV1, RESTTranslatedCSNodeCollectionItemV1> {
    private List<RESTTranslatedCSNodeCollectionItemV1> items = new ArrayList<RESTTranslatedCSNodeCollectionItemV1>();

    @Override
    public List<RESTTranslatedCSNodeCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTTranslatedCSNodeCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTTranslatedCSNodeV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTTranslatedCSNodeCollectionItemV1>();
        }

        items.add(new RESTTranslatedCSNodeCollectionItemV1(item, state));
    }
}
