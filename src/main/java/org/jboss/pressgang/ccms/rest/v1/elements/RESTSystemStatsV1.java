package org.jboss.pressgang.ccms.rest.v1.elements;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementV1;

/**
 * Used to send information about the system
 */
public class RESTSystemStatsV1 extends RESTBaseElementV1<RESTSystemStatsV1> {
    private int lastRevision = 0;
    private Date lastRevisionDate;

    public RESTSystemStatsV1() {

    }

    public int getLastRevision() {
        return lastRevision;
    }

    public void setLastRevision(final int lastRevision) {
        this.lastRevision = lastRevision;
    }

    public Date getLastRevisionDate() {
        return lastRevisionDate;
    }

    public void setLastRevisionDate(final Date lastRevisionDate) {
        this.lastRevisionDate = lastRevisionDate;
    }

    @Override
    public RESTSystemStatsV1 clone(boolean deepCopy) {
        final RESTSystemStatsV1 retValue = new RESTSystemStatsV1();
        cloneInto(retValue, deepCopy);
        return retValue;
    }

    public void cloneInto(RESTSystemStatsV1 clone, boolean deepCopy) {
        clone.lastRevision = lastRevision;
        clone.lastRevisionDate = lastRevisionDate == null ? null : (Date) lastRevisionDate.clone();
    }
}
