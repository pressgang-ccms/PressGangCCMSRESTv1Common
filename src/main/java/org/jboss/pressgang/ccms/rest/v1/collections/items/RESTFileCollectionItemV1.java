package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFileCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFileV1;

public class RESTFileCollectionItemV1 extends RESTBaseCollectionItemV1<RESTFileV1, RESTFileCollectionV1, RESTFileCollectionItemV1> {
    private RESTFileV1 item;

    public RESTFileCollectionItemV1() {

    }

    public RESTFileCollectionItemV1(final RESTFileV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTFileCollectionItemV1(final RESTFileV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFileCollectionItemV1 clone(boolean deepCopy) {
        final RESTFileCollectionItemV1 retValue = new RESTFileCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTFileV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTFileV1 item) {
        this.item = item;
    }
}