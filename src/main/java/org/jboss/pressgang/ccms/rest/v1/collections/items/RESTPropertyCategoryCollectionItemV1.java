package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyCategoryV1;

public class RESTPropertyCategoryCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTPropertyCategoryV1,
        RESTPropertyCategoryCollectionV1, RESTPropertyCategoryCollectionItemV1> {
    private RESTPropertyCategoryV1 item;

    public RESTPropertyCategoryCollectionItemV1() {

    }

    public RESTPropertyCategoryCollectionItemV1(final RESTPropertyCategoryV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTPropertyCategoryCollectionItemV1(final RESTPropertyCategoryV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyCategoryCollectionItemV1 clone(boolean deepCopy) {
        final RESTPropertyCategoryCollectionItemV1 retValue = new RESTPropertyCategoryCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTPropertyCategoryV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyCategoryV1 item) {
        this.item = item;
    }
}