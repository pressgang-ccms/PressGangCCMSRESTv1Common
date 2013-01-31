package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterCategoryV1;

public class RESTFilterCategoryCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTFilterCategoryV1,
        RESTFilterCategoryCollectionV1, RESTFilterCategoryCollectionItemV1> {
    private RESTFilterCategoryV1 item;

    public RESTFilterCategoryCollectionItemV1() {

    }

    public RESTFilterCategoryCollectionItemV1(final RESTFilterCategoryV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTFilterCategoryCollectionItemV1(final RESTFilterCategoryV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFilterCategoryCollectionItemV1 clone(boolean deepCopy) {
        final RESTFilterCategoryCollectionItemV1 retValue = new RESTFilterCategoryCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTFilterCategoryV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTFilterCategoryV1 item) {
        this.item = item;
    }
}
