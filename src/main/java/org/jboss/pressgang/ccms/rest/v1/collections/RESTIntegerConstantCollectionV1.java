package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTIntegerConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTIntegerConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTIntegerConstantCollectionV1 extends RESTBaseCollectionV1<RESTIntegerConstantV1, RESTIntegerConstantCollectionV1,
        RESTIntegerConstantCollectionItemV1> {
    private List<RESTIntegerConstantCollectionItemV1> items = new ArrayList<RESTIntegerConstantCollectionItemV1>();

    @Override
    public List<RESTIntegerConstantCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTIntegerConstantCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTIntegerConstantV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTIntegerConstantCollectionItemV1>();
        }

        items.add(new RESTIntegerConstantCollectionItemV1(item, state));
    }
}
