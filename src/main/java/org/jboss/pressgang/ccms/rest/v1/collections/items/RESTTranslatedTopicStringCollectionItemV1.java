package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslatedTopicStringV1;

public class RESTTranslatedTopicStringCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTTranslatedTopicStringV1,
        RESTTranslatedTopicStringCollectionV1, RESTTranslatedTopicStringCollectionItemV1> {
    private RESTTranslatedTopicStringV1 item;

    public RESTTranslatedTopicStringCollectionItemV1() {

    }

    public RESTTranslatedTopicStringCollectionItemV1(final RESTTranslatedTopicStringV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTranslatedTopicStringCollectionItemV1(final RESTTranslatedTopicStringV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTranslatedTopicStringCollectionItemV1 clone(boolean deepCopy) {
        final RESTTranslatedTopicStringCollectionItemV1 retValue = new RESTTranslatedTopicStringCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTranslatedTopicStringV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTranslatedTopicStringV1 item) {
        this.item = item;
    }
}