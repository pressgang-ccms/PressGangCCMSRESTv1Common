package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTProcessInformationV1;

public class RESTProcessInformationCollectionItemV1 extends RESTBaseCollectionItemV1<RESTProcessInformationV1,
        RESTProcessInformationCollectionItemV1> {
    private RESTProcessInformationV1 item;

    public RESTProcessInformationCollectionItemV1() {

    }

    public RESTProcessInformationCollectionItemV1(final RESTProcessInformationV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTProcessInformationCollectionItemV1(final RESTProcessInformationV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTProcessInformationCollectionItemV1 clone(boolean deepCopy) {
        final RESTProcessInformationCollectionItemV1 retValue = new RESTProcessInformationCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTProcessInformationV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTProcessInformationV1 item) {
        this.item = item;
    }
}