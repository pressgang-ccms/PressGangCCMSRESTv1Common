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
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLocaleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTServerUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslationServerExtendedCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementWithConfiguredParametersV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLocaleV1;

public class RESTServerSettingsV1 extends RESTBaseElementWithConfiguredParametersV1<RESTServerSettingsV1> {
    public static String UI_URL_NAME = "uiUrl";
    public static String DOCBUILDER_URL_NAME = "docBuilderUrl";
    public static String DOCBOOK_TEMPLATES_NAME = "docBookTemplateIds";
    public static String SEO_CATEGORIES_NAME = "seoCategoryIds";
    public static String DEFAULT_LOCALE_NAME = "defaultLocale";
    public static String UNDEFINED_SETTINGS_NAME = "undefinedSettings";
    public static String LOCALES_NAME = "locales";
    public static String TRANSLATION_SERVERS_NAME = "translationServers";
    public static String READONLY_NAME = "readOnly";
    public static String JMS_UPDATE_FREQUENCY  = "jmsUpdateFrequency";

    /**
     * The names of collections that can be expanded
     */
    private List<String> expand = null;

    private String uiUrl;
    private List<Integer> docBookTemplateIds;
    private List<Integer> seoCategoryIds;
    private RESTLocaleV1 defaultLocale;
    private String docBuilderUrl;
    private boolean readOnly;
    private int jmsUpdateFrequency;
    private RESTLocaleCollectionV1 locales;
    private RESTTranslationServerExtendedCollectionV1 translationServers;
    private RESTServerEntitiesV1 entities = new RESTServerEntitiesV1();
    private RESTServerUndefinedSettingCollectionV1 undefinedSettings;

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(final List<String> expand) {
        this.expand = expand;
    }

    public String getUiUrl() {
        return uiUrl;
    }

    public void setUiUrl(String uiUrl) {
        this.uiUrl = uiUrl;
    }

    public void explicitSetUiUrl(String uiUrl) {
        this.uiUrl = uiUrl;
        setParameterToConfigured(UI_URL_NAME);
    }

    public List<Integer> getDocBookTemplateIds() {
        return docBookTemplateIds;
    }

    public void setDocBookTemplateIds(List<Integer> docBookTemplateIds) {
        this.docBookTemplateIds = docBookTemplateIds;
    }

    public void explicitSetDocBookTemplateIds(List<Integer> docBookTemplateIds) {
        this.docBookTemplateIds = docBookTemplateIds;
        setParameterToConfigured(DOCBOOK_TEMPLATES_NAME);
    }

    public List<Integer> getSeoCategoryIds() {
        return seoCategoryIds;
    }

    public void setSeoCategoryIds(List<Integer> seoCategoryIds) {
        this.seoCategoryIds = seoCategoryIds;
    }

    public void explicitSetSeoCategoryIds(List<Integer> seoCategoryIds) {
        this.seoCategoryIds = seoCategoryIds;
        setParameterToConfigured(SEO_CATEGORIES_NAME);
    }

    public RESTLocaleV1 getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(RESTLocaleV1 defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public void explicitSetDefaultLocale(RESTLocaleV1 defaultLocale) {
        this.defaultLocale = defaultLocale;
        setParameterToConfigured(DEFAULT_LOCALE_NAME);
    }

    public String getDocBuilderUrl() {
        return docBuilderUrl;
    }

    public void setDocBuilderUrl(String docBuilderUrl) {
        this.docBuilderUrl = docBuilderUrl;
    }

    public void explicitSetDocBuilderUrl(String docBuilderUrl) {
        this.docBuilderUrl = docBuilderUrl;
        setParameterToConfigured(DOCBUILDER_URL_NAME);
    }

    public RESTServerUndefinedSettingCollectionV1 getUndefinedSettings() {
        return undefinedSettings;
    }

    public void setUndefinedSettings(RESTServerUndefinedSettingCollectionV1 undefinedSettings) {
        this.undefinedSettings = undefinedSettings;
    }

    public void explicitSetUndefinedSettings(RESTServerUndefinedSettingCollectionV1 undefinedSettings) {
        this.undefinedSettings = undefinedSettings;
        setParameterToConfigured(UNDEFINED_SETTINGS_NAME);
    }

    public RESTServerEntitiesV1 getEntities() {
        return entities;
    }

    public void setEntities(RESTServerEntitiesV1 entities) {
        this.entities = entities;
    }

    public RESTTranslationServerExtendedCollectionV1 getTranslationServers() {
        return translationServers;
    }

    public void setTranslationServers(final RESTTranslationServerExtendedCollectionV1 translationServers) {
        this.translationServers = translationServers;
    }

    public void explicitSetTranslationServers(final RESTTranslationServerExtendedCollectionV1 translationServers) {
        this.translationServers = translationServers;
        setParameterToConfigured(TRANSLATION_SERVERS_NAME);
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
    public RESTServerSettingsV1 clone(boolean deepCopy) {
        final RESTServerSettingsV1 clone = new RESTServerSettingsV1();
        cloneInto(clone, deepCopy);
        return clone;
    }

    public void cloneInto(final RESTServerSettingsV1 clone, boolean deepCopy) {
        clone.uiUrl = uiUrl;
        clone.docBuilderUrl = docBuilderUrl;
        clone.docBookTemplateIds = docBookTemplateIds == null ? null : new ArrayList<Integer>(docBookTemplateIds);
        clone.seoCategoryIds = seoCategoryIds == null ? null : new ArrayList<Integer>(seoCategoryIds);
        clone.readOnly = readOnly;
        clone.jmsUpdateFrequency = jmsUpdateFrequency;
        clone.setExpand(expand);

        if (deepCopy) {
            if (entities != null) {
                clone.entities = entities.clone(deepCopy);
            } else {
                clone.entities = null;
            }

            if (defaultLocale != null) {
                clone.defaultLocale = defaultLocale.clone(deepCopy);
            } else {
                clone.defaultLocale = null;
            }

            if (locales != null) {
                clone.locales = new RESTLocaleCollectionV1();
                locales.cloneInto(clone.locales, deepCopy);
            } else {
                clone.locales = null;
            }

            if (undefinedSettings != null) {
                clone.undefinedSettings = new RESTServerUndefinedSettingCollectionV1();
                undefinedSettings.cloneInto(clone.undefinedSettings, deepCopy);
            } else {
                clone.undefinedSettings = null;
            }

            if (translationServers != null) {
                clone.translationServers = new RESTTranslationServerExtendedCollectionV1();
                translationServers.cloneInto(clone.translationServers, deepCopy);
            } else {
                clone.translationServers = null;
            }
        } else {
            clone.entities = entities;
            clone.defaultLocale = defaultLocale;
            clone.locales = locales;
            clone.undefinedSettings = undefinedSettings;
            clone.translationServers = translationServers;
        }
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final boolean readOnly) {
        this.readOnly = readOnly;
    }

    public void explicitSetReadOnly(final boolean readOnly) {
        this.readOnly = readOnly;
        setParameterToConfigured(READONLY_NAME);
    }

    public int getJmsUpdateFrequency() {
        return jmsUpdateFrequency;
    }

    public void setJmsUpdateFrequency(final int jmsUpdateFrequency) {
        this.jmsUpdateFrequency = jmsUpdateFrequency;
    }

    public void explicitSetJmsUpdateFrequency(final int jmsUpdateFrequency) {
        this.jmsUpdateFrequency = jmsUpdateFrequency;
        setParameterToConfigured(JMS_UPDATE_FREQUENCY);
    }
}
