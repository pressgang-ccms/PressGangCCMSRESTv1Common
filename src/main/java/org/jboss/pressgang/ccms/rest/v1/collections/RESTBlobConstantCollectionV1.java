package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBlobConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTBlobConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTBlobConstantCollectionV1 extends RESTBaseCollectionV1<RESTBlobConstantV1, RESTBlobConstantCollectionV1,
        RESTBlobConstantCollectionItemV1> {
    private List<RESTBlobConstantCollectionItemV1> items = new ArrayList<RESTBlobConstantCollectionItemV1>();

    @Override
    public List<RESTBlobConstantCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTBlobConstantCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTBlobConstantV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTBlobConstantCollectionItemV1>();
        }

        items.add(new RESTBlobConstantCollectionItemV1(item, state));
    }
}
