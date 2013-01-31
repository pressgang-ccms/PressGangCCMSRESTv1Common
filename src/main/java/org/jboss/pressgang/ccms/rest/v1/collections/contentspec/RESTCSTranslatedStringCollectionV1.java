package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSTranslatedStringCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSTranslatedStringV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTCSTranslatedStringCollectionV1 extends RESTBaseUpdateCollectionV1<RESTCSTranslatedStringV1,
        RESTCSTranslatedStringCollectionV1, RESTCSTranslatedStringCollectionItemV1> {
    private List<RESTCSTranslatedStringCollectionItemV1> items = new ArrayList<RESTCSTranslatedStringCollectionItemV1>();

    @Override
    public List<RESTCSTranslatedStringCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTCSTranslatedStringCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCSTranslatedStringV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTCSTranslatedStringCollectionItemV1>();
        }

        items.add(new RESTCSTranslatedStringCollectionItemV1(item, state));
    }
}
