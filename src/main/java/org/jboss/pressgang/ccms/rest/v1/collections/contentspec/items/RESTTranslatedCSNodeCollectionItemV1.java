package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedCSNodeV1;

public class RESTTranslatedCSNodeCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTTranslatedCSNodeV1, RESTTranslatedCSNodeCollectionV1, RESTTranslatedCSNodeCollectionItemV1> {
    private RESTTranslatedCSNodeV1 item;

    public RESTTranslatedCSNodeCollectionItemV1() {

    }

    public RESTTranslatedCSNodeCollectionItemV1(final RESTTranslatedCSNodeV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTranslatedCSNodeCollectionItemV1(final RESTTranslatedCSNodeV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTranslatedCSNodeCollectionItemV1 clone(boolean deepCopy) {
        final RESTTranslatedCSNodeCollectionItemV1 retValue = new RESTTranslatedCSNodeCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTranslatedCSNodeV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTranslatedCSNodeV1 item) {
        this.item = item;
    }
}