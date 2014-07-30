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

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementWithConfiguredParametersV1;

public class RESTZanataServerSettingsV1 extends RESTBaseElementWithConfiguredParametersV1<RESTZanataServerSettingsV1> {
    public static final String NAME_NAME = "name";
    public static final String URL_NAME = "url";
    public static final String PROJECT_NAME = "project";
    public static final String PROJECT_VERSION_NAME = "projectVersion";

    private String id;
    private String name;
    private String url;
    private String project;
    private String projectVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void explicitSetName(final String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void explicitSetUrl(final String url) {
        this.url = url;
        setParameterToConfigured(URL_NAME);
    }

    public String getProject() {
        return project;
    }

    public void setProject(final String project) {
        this.project = project;
    }

    public void explicitSetProject(final String project) {
        this.project = project;
        setParameterToConfigured(PROJECT_NAME);
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(final String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public void explicitSetProjectVersion(final String projectVersion) {
        this.projectVersion = projectVersion;
        setParameterToConfigured(PROJECT_VERSION_NAME);
    }

    @Override
    public RESTZanataServerSettingsV1 clone(boolean deepCopy) {
        final RESTZanataServerSettingsV1 retValue = new RESTZanataServerSettingsV1();
        cloneInto(retValue, deepCopy);
        return retValue;
    }

    public void cloneInto(final RESTZanataServerSettingsV1 clone, boolean deepClone) {
        clone.id = id;
        clone.name = name;
        clone.url = url;
        clone.project = project;
        clone.projectVersion = projectVersion;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTZanataServerSettingsV1)) return false;

        final RESTZanataServerSettingsV1 otherCasted = (RESTZanataServerSettingsV1) other;

        if (id == null && otherCasted.id == null) return true;
        if (id == null || otherCasted.id == null) return false;

        return id.equals(otherCasted.id);
    }

    @Override
    public int hashCode() {
        if (id == null) return 0;
        return id.hashCode();
    }
}
