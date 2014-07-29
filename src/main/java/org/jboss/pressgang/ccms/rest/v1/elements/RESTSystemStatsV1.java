/*
  Copyright 2011-2014 Red Hat

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

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
