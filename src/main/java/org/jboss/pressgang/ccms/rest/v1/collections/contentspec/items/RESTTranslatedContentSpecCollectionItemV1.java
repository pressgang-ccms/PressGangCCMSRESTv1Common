package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedContentSpecV1;

public class RESTTranslatedContentSpecCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTTranslatedContentSpecV1, RESTTranslatedContentSpecCollectionV1, RESTTranslatedContentSpecCollectionItemV1> {
    private RESTTranslatedContentSpecV1 item;

    public RESTTranslatedContentSpecCollectionItemV1() {

    }

    public RESTTranslatedContentSpecCollectionItemV1(final RESTTranslatedContentSpecV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTranslatedContentSpecCollectionItemV1(final RESTTranslatedContentSpecV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTranslatedContentSpecCollectionItemV1 clone(boolean deepCopy) {
        final RESTTranslatedContentSpecCollectionItemV1 retValue = new RESTTranslatedContentSpecCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTranslatedContentSpecV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTranslatedContentSpecV1 item) {
        this.item = item;
    }
}