package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTranslatedContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedContentSpecV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTTranslatedContentSpecCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTTranslatedContentSpecV1,
        RESTTranslatedContentSpecCollectionV1, RESTTranslatedContentSpecCollectionItemV1> {
    private List<RESTTranslatedContentSpecCollectionItemV1> items = new ArrayList<RESTTranslatedContentSpecCollectionItemV1>();

    @Override
    public List<RESTTranslatedContentSpecCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTTranslatedContentSpecCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTTranslatedContentSpecV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTTranslatedContentSpecCollectionItemV1>();
        }

        items.add(new RESTTranslatedContentSpecCollectionItemV1(item, state));
    }
}
