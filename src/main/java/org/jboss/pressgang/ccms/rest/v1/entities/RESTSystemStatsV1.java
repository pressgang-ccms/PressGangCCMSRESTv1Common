package org.jboss.pressgang.ccms.rest.v1.entities;

/**
 * Used to send information about the system
 */
public class RESTSystemStatsV1 {
    private int lastRevision = 0;

    public RESTSystemStatsV1() {

    }

    public int getLastRevision() {
        return lastRevision;
    }

    public void setLastRevision(int lastRevision) {
        this.lastRevision = lastRevision;
    }
}
