package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTRoleCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTRoleV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTRoleCollectionV1 extends RESTBaseCollectionV1<RESTRoleV1, RESTRoleCollectionV1, RESTRoleCollectionItemV1> {
    private List<RESTRoleCollectionItemV1> items = new ArrayList<RESTRoleCollectionItemV1>();

    @Override
    public List<RESTRoleCollectionItemV1> getItems() {
        return this.items;
    }

    @Override
    public void setItems(final List<RESTRoleCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTRoleV1 item, final Integer state) {
        if (items == null) {
            this.items = new ArrayList<RESTRoleCollectionItemV1>();
        }

        items.add(new RESTRoleCollectionItemV1(item, state));
    }
}
