package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTLanguageFileCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageFileV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTLanguageFileCollectionV1 extends RESTBaseUpdateCollectionV1<RESTLanguageFileV1, RESTLanguageFileCollectionV1,
        RESTLanguageFileCollectionItemV1> {
    private List<RESTLanguageFileCollectionItemV1> items = new ArrayList<RESTLanguageFileCollectionItemV1>();

    @Override
    public List<RESTLanguageFileCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTLanguageFileCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTLanguageFileV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTLanguageFileCollectionItemV1>();
        }

        items.add(new RESTLanguageFileCollectionItemV1(item, state));
    }
}
