package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTContentSpecV1;

public class RESTContentSpecCollectionItemV1 extends RESTBaseCollectionItemV1<RESTContentSpecV1, RESTContentSpecCollectionV1,
        RESTContentSpecCollectionItemV1> {
    private RESTContentSpecV1 item;

    public RESTContentSpecCollectionItemV1() {

    }

    public RESTContentSpecCollectionItemV1(final RESTContentSpecV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTContentSpecCollectionItemV1(final RESTContentSpecV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTContentSpecCollectionItemV1 clone(boolean deepCopy) {
        final RESTContentSpecCollectionItemV1 retValue = new RESTContentSpecCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTContentSpecV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTContentSpecV1 item) {
        this.item = item;
    }
}
