package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterFieldCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterFieldV1;

public class RESTFilterFieldCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTFilterFieldV1, RESTFilterFieldCollectionV1,
        RESTFilterFieldCollectionItemV1> {
    private RESTFilterFieldV1 item;

    public RESTFilterFieldCollectionItemV1() {

    }

    public RESTFilterFieldCollectionItemV1(final RESTFilterFieldV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTFilterFieldCollectionItemV1(final RESTFilterFieldV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFilterFieldCollectionItemV1 clone(boolean deepCopy) {
        final RESTFilterFieldCollectionItemV1 retValue = new RESTFilterFieldCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTFilterFieldV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTFilterFieldV1 item) {
        this.item = item;
    }
}
