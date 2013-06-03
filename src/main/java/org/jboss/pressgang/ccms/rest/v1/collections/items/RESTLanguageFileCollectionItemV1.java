package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLanguageFileCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageFileV1;

public class RESTLanguageFileCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTLanguageFileV1, RESTLanguageFileCollectionV1, RESTLanguageFileCollectionItemV1> {
    private RESTLanguageFileV1 item;

    public RESTLanguageFileCollectionItemV1() {

    }

    public RESTLanguageFileCollectionItemV1(final RESTLanguageFileV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTLanguageFileCollectionItemV1(final RESTLanguageFileV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTLanguageFileCollectionItemV1 clone(boolean deepCopy) {
        final RESTLanguageFileCollectionItemV1 retValue = new RESTLanguageFileCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTLanguageFileV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTLanguageFileV1 item) {
        this.item = item;
    }
}