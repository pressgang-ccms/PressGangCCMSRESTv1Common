package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicV1;

public class RESTTopicCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTTopicV1, RESTTopicCollectionV1, RESTTopicCollectionItemV1> {
    private RESTTopicV1 item;

    public RESTTopicCollectionItemV1() {

    }

    public RESTTopicCollectionItemV1(final RESTTopicV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTopicCollectionItemV1(final RESTTopicV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTopicCollectionItemV1 clone(boolean deepCopy) {
        final RESTTopicCollectionItemV1 retValue = new RESTTopicCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTopicV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTopicV1 item) {
        this.item = item;
    }
}