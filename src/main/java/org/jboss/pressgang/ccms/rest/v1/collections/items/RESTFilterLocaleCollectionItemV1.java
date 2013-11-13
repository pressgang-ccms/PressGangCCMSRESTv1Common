package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterLocaleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterLocaleV1;

public class RESTFilterLocaleCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1,
        RESTFilterLocaleCollectionItemV1> {
    private RESTFilterLocaleV1 item;

    public RESTFilterLocaleCollectionItemV1() {

    }

    public RESTFilterLocaleCollectionItemV1(final RESTFilterLocaleV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTFilterLocaleCollectionItemV1(final RESTFilterLocaleV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFilterLocaleCollectionItemV1 clone(boolean deepCopy) {
        final RESTFilterLocaleCollectionItemV1 retValue = new RESTFilterLocaleCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTFilterLocaleV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTFilterLocaleV1 item) {
        this.item = item;
    }
}