package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTUserCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTUserV1;

public class RESTUserCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTUserV1, RESTUserCollectionV1, RESTUserCollectionItemV1> {
    private RESTUserV1 item;

    public RESTUserCollectionItemV1() {

    }

    public RESTUserCollectionItemV1(final RESTUserV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTUserCollectionItemV1(final RESTUserV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTUserCollectionItemV1 clone(boolean deepCopy) {
        final RESTUserCollectionItemV1 retValue = new RESTUserCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTUserV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTUserV1 item) {
        this.item = item;
    }
}