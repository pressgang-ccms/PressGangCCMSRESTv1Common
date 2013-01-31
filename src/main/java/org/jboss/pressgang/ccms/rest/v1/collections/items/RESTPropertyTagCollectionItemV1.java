package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;

public class RESTPropertyTagCollectionItemV1 extends RESTBaseCollectionItemV1<RESTPropertyTagV1, RESTPropertyTagCollectionV1,
        RESTPropertyTagCollectionItemV1> {
    private RESTPropertyTagV1 item;

    public RESTPropertyTagCollectionItemV1() {

    }

    public RESTPropertyTagCollectionItemV1(final RESTPropertyTagV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTPropertyTagCollectionItemV1(final RESTPropertyTagV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyTagCollectionItemV1 clone(boolean deepCopy) {
        final RESTPropertyTagCollectionItemV1 retValue = new RESTPropertyTagCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTPropertyTagV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyTagV1 item) {
        this.item = item;
    }
}