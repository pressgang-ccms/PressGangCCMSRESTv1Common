package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicSourceUrlV1;

public class RESTTopicSourceUrlCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTTopicSourceUrlV1,
        RESTTopicSourceUrlCollectionV1, RESTTopicSourceUrlCollectionItemV1> {
    private RESTTopicSourceUrlV1 item;

    public RESTTopicSourceUrlCollectionItemV1() {

    }

    public RESTTopicSourceUrlCollectionItemV1(final RESTTopicSourceUrlV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTopicSourceUrlCollectionItemV1(final RESTTopicSourceUrlV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTopicSourceUrlCollectionItemV1 clone(boolean deepCopy) {
        final RESTTopicSourceUrlCollectionItemV1 retValue = new RESTTopicSourceUrlCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTopicSourceUrlV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTopicSourceUrlV1 item) {
        this.item = item;
    }
}