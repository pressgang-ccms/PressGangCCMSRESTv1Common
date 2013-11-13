package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTextContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTextContentSpecV1;

public class RESTTextContentSpecCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTTextContentSpecV1, RESTTextContentSpecCollectionV1,
        RESTTextContentSpecCollectionItemV1> {
    private RESTTextContentSpecV1 item;

    public RESTTextContentSpecCollectionItemV1() {

    }

    public RESTTextContentSpecCollectionItemV1(final RESTTextContentSpecV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTextContentSpecCollectionItemV1(final RESTTextContentSpecV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTextContentSpecCollectionItemV1 clone(boolean deepCopy) {
        final RESTTextContentSpecCollectionItemV1 retValue = new RESTTextContentSpecCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTextContentSpecV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTextContentSpecV1 item) {
        this.item = item;
    }
}
