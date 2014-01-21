package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.Date;

/**
 * Used to send information about the system
 */
public class RESTSystemStatsV1 {
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
}
