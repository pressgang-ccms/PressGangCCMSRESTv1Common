package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterLocaleCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterLocaleV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTFilterLocaleCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1,
        RESTFilterLocaleCollectionItemV1> {
    private List<RESTFilterLocaleCollectionItemV1> items = new ArrayList<RESTFilterLocaleCollectionItemV1>();

    @Override
    public List<RESTFilterLocaleCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterLocaleCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTFilterLocaleV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTFilterLocaleCollectionItemV1>();
        }

        items.add(new RESTFilterLocaleCollectionItemV1(item, state));
    }
}
