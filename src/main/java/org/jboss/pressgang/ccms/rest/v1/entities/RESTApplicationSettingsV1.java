package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTApplicationUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectWithConfiguredParametersV1;

public class RESTApplicationSettingsV1 extends RESTBaseObjectWithConfiguredParametersV1<RESTApplicationSettingsV1> {
    public static String UI_URL_NAME = "uiUrl";
    public static String DOCBUILDER_URL_NAME = "docBuilderUrl";
    public static String DOCBOOK_ELEMENTS_NAME = "docBookElements";
    public static String LOCALES_NAME = "locales";
    public static String DEFAULT_LOCALE_NAME = "defaultLocale";
    public static String UNDEFINED_SETTINGS_NAME = "undefinedSettings";

    private String uiUrl;
    private List<Integer> docBookTemplateIds;
    private List<String> locales;
    private String defaultLocale;
    private String docBuilderUrl;
    private RESTApplicationEntitiesV1 entities = new RESTApplicationEntitiesV1();
    private RESTApplicationUndefinedSettingCollectionV1 undefinedSettings;

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
        setParameterToConfigured(DOCBOOK_ELEMENTS_NAME);
    }

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }

    public void explicitSetLocales(List<String> locales) {
        this.locales = locales;
        setParameterToConfigured(LOCALES_NAME);
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public void explicitSetDefaultLocale(String defaultLocale) {
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

    public RESTApplicationUndefinedSettingCollectionV1 getUndefinedSettings() {
        return undefinedSettings;
    }

    public void setUndefinedSettings(RESTApplicationUndefinedSettingCollectionV1 undefinedSettings) {
        this.undefinedSettings = undefinedSettings;
    }

    public void explicitSetUndefinedSettings(RESTApplicationUndefinedSettingCollectionV1 undefinedSettings) {
        this.undefinedSettings = undefinedSettings;
        setParameterToConfigured(UNDEFINED_SETTINGS_NAME);
    }

    public RESTApplicationEntitiesV1 getEntities() {
        return entities;
    }

    public void setEntities(RESTApplicationEntitiesV1 entities) {
        this.entities = entities;
    }

    @Override
    public RESTApplicationSettingsV1 clone(boolean deepCopy) {
        final RESTApplicationSettingsV1 clone = new RESTApplicationSettingsV1();
        cloneInto(clone);
        return clone;
    }
}
