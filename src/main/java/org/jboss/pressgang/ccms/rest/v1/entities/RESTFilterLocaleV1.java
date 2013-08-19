package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterLocaleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterLocaleCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTFilterLocaleV1 extends RESTBaseEntityV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1,
        RESTFilterLocaleCollectionItemV1> {
    public static final String LOCALE_NAME = "locale";
    public static final String STATE_NAME = "state";
    public static final String FILTER_NAME = "filter";

    private String locale = null;
    private Integer state = null;
    private RESTFilterV1 filter = null;

    private RESTFilterLocaleCollectionV1 revisions = null;

    @Override
    public RESTFilterLocaleCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterLocaleCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterLocaleV1 clone(boolean deepCopy) {
        final RESTFilterLocaleV1 retValue = new RESTFilterLocaleV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTFilterLocaleV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = locale;
        clone.state = state;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTFilterLocaleCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }

            if (filter != null) {
                clone.filter = filter.clone(deepCopy);
            }
        } else {
            clone.revisions = revisions;
            clone.filter = filter;
        }
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void explicitSetLocale(final String locale) {
        this.locale = locale;
        setParameterToConfigured(LOCALE_NAME);
    }

    public Integer getState() {
        return state;
    }

    public void setState(final Integer state) {
        this.state = state;
    }

    public void explicitSetState(final Integer state) {
        this.state = state;
        setParameterToConfigured(STATE_NAME);
    }

    public RESTFilterV1 getFilter() {
        return filter;
    }

    public void setFilter(final RESTFilterV1 filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTFilterLocaleV1)) return false;

        return super.equals(other);
    }
}
