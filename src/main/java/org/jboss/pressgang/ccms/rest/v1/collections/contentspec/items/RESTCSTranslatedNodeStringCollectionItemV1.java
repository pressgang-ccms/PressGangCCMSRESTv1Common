package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedNodeStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSTranslatedNodeStringV1;

public class RESTCSTranslatedNodeStringCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTCSTranslatedNodeStringV1,
        RESTCSTranslatedNodeStringCollectionV1, RESTCSTranslatedNodeStringCollectionItemV1> {
    private RESTCSTranslatedNodeStringV1 item;

    public RESTCSTranslatedNodeStringCollectionItemV1() {

    }

    public RESTCSTranslatedNodeStringCollectionItemV1(final RESTCSTranslatedNodeStringV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTCSTranslatedNodeStringCollectionItemV1(final RESTCSTranslatedNodeStringV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSTranslatedNodeStringCollectionItemV1 clone(boolean deepCopy) {
        final RESTCSTranslatedNodeStringCollectionItemV1 retValue = new RESTCSTranslatedNodeStringCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTCSTranslatedNodeStringV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTCSTranslatedNodeStringV1 item) {
        this.item = item;
    }
}