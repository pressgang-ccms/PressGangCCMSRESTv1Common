/*
  Copyright 2011-2014 Red Hat, Inc

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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementV1;
import org.jboss.pressgang.ccms.rest.v1.elements.enums.RESTProcessStatusV1;
import org.jboss.pressgang.ccms.rest.v1.elements.enums.RESTProcessTypeV1;

public class RESTProcessInformationV1 extends RESTBaseElementV1<RESTProcessInformationV1> {
    public static final String LOGS_NAME = "logs";

    private String id;
    private String name;
    private String logs;
    private String url;
    private String startedBy;
    private Date startTime;
    private Date endTime;
    private RESTProcessStatusV1 status;
    private RESTProcessTypeV1 type;

    /**
     * The names of collections that can be expanded
     */
    private List<String> expand = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    public RESTProcessStatusV1 getStatus() {
        return status;
    }

    public void setStatus(RESTProcessStatusV1 status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public RESTProcessTypeV1 getType() {
        return type;
    }

    public void setType(final RESTProcessTypeV1 type) {
        this.type = type;
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(List<String> expand) {
        this.expand = expand;
    }

    @Override
    public RESTProcessInformationV1 clone(boolean deepCopy) {
        final RESTProcessInformationV1 clone = new RESTProcessInformationV1();
        cloneInto(clone, deepCopy);
        return clone;
    }

    public void cloneInto(final RESTProcessInformationV1 clone, boolean deepCopy) {
        clone.id = id;
        clone.name = name;
        clone.url = url;
        clone.startedBy = startedBy;
        clone.startTime = startTime == null ? null : (Date) startTime.clone();
        clone.endTime = endTime == null ? null : (Date) endTime.clone();
        clone.status = status;
        clone.type = type;

        clone.expand = expand == null ? null : new ArrayList<String>(expand);
    }
}
