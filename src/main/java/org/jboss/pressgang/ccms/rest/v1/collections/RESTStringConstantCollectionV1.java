package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTStringConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTStringConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTStringConstantCollectionV1 extends RESTBaseEntityCollectionV1<RESTStringConstantV1, RESTStringConstantCollectionV1,
        RESTStringConstantCollectionItemV1> {
    private List<RESTStringConstantCollectionItemV1> items = new ArrayList<RESTStringConstantCollectionItemV1>();

    @Override
    public List<RESTStringConstantCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTStringConstantCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTStringConstantV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTStringConstantCollectionItemV1>();
        }

        items.add(new RESTStringConstantCollectionItemV1(item, state));
    }
}
