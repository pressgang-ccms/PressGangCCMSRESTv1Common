package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBugzillaBugCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTBugzillaBugV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTBugzillaBugCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTBugzillaBugV1, RESTBugzillaBugCollectionV1,
        RESTBugzillaBugCollectionItemV1> {
    private List<RESTBugzillaBugCollectionItemV1> items = new ArrayList<RESTBugzillaBugCollectionItemV1>();

    @Override
    public List<RESTBugzillaBugCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTBugzillaBugCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTBugzillaBugV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTBugzillaBugCollectionItemV1>();
        }

        items.add(new RESTBugzillaBugCollectionItemV1(item, state));
    }
}
