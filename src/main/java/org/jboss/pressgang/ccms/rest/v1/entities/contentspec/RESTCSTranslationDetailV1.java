/*
 * Copyright 2011-2014 Red Hat, Inc.
 *
 * This file is part of PressGang CCMS.
 *
 * PressGang CCMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PressGang CCMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PressGang CCMS. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLocaleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslationServerV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTCSTranslationDetailV1 extends RESTBaseEntityV1<RESTCSTranslationDetailV1> {
    public static final String ENABLED_NAME = "enabled";
    public static final String TRANSLATION_SERVER_NAME = "translationServer";
    public static final String PROJECT_NAME = "project";
    public static final String PROJECT_VERSION_NAME = "projectVersion";
    public static final String LOCALES_NAME = "locales";

    private boolean enabled;
    private RESTTranslationServerV1 translationServer;
    private String project;
    private String projectVersion;
    private RESTLocaleCollectionV1 locales;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void explicitSetEnabled(boolean enabled) {
        this.enabled = enabled;
        setParameterToConfigured(ENABLED_NAME);
    }

    public RESTTranslationServerV1 getTranslationServer() {
        return translationServer;
    }

    public void setTranslationServer(RESTTranslationServerV1 translationServer) {
        this.translationServer = translationServer;
    }

    public void explictSetTranslationServer(RESTTranslationServerV1 translationServer) {
        this.translationServer = translationServer;
        setParameterToConfigured(TRANSLATION_SERVER_NAME);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void explicitSetProject(String project) {
        this.project = project;
        setParameterToConfigured(PROJECT_NAME);
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public void explicitSetProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
        setParameterToConfigured(PROJECT_VERSION_NAME);
    }

    public RESTLocaleCollectionV1 getLocales() {
        return locales;
    }

    public void setLocales(RESTLocaleCollectionV1 locales) {
        this.locales = locales;
    }

    public void explicitSetLocales(RESTLocaleCollectionV1 locales) {
        this.locales = locales;
        setParameterToConfigured(LOCALES_NAME);
    }

    @Override
    public RESTCSTranslationDetailV1 clone(boolean deepCopy) {
        final RESTCSTranslationDetailV1 retValue = new RESTCSTranslationDetailV1();
        cloneInto(retValue, deepCopy);
        return retValue;
    }

    public void cloneInto(final RESTCSTranslationDetailV1 clone, boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.enabled = enabled;
        clone.project = project;
        clone.projectVersion = projectVersion;

        if (deepCopy) {
            if (translationServer != null) {
                clone.translationServer = translationServer.clone(deepCopy);
            } else {
                clone.translationServer = null;
            }

            if (locales != null) {
                clone.locales = new RESTLocaleCollectionV1();
                locales.cloneInto(clone.locales, deepCopy);
            } else {
                clone.locales = null;
            }
        } else {
            clone.translationServer = translationServer;
            clone.locales = locales;
        }
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTCSTranslationDetailV1)) return false;

        return super.equals(other);
    }
}
