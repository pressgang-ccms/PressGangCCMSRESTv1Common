package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSTranslatedNodeV1;

public class RESTCSTranslatedNodeCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTCSTranslatedNodeV1,
        RESTCSTranslatedNodeCollectionV1, RESTCSTranslatedNodeCollectionItemV1> {
    private RESTCSTranslatedNodeV1 item;

    public RESTCSTranslatedNodeCollectionItemV1() {

    }

    public RESTCSTranslatedNodeCollectionItemV1(final RESTCSTranslatedNodeV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTCSTranslatedNodeCollectionItemV1(final RESTCSTranslatedNodeV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSTranslatedNodeCollectionItemV1 clone(boolean deepCopy) {
        final RESTCSTranslatedNodeCollectionItemV1 retValue = new RESTCSTranslatedNodeCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTCSTranslatedNodeV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTCSTranslatedNodeV1 item) {
        this.item = item;
    }
}