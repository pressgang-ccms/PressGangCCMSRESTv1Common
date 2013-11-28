package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTServerUndefinedSettingCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectWithConfiguredParametersV1;

public class RESTServerSettingsV1 extends RESTBaseObjectWithConfiguredParametersV1<RESTServerSettingsV1> {
    public static String UI_URL_NAME = "uiUrl";
    public static String DOCBUILDER_URL_NAME = "docBuilderUrl";
    public static String DOCBOOK_TEMPLATES_NAME = "docBookTemplateIds";
    public static String SEO_CATEGORIES_NAME = "seoCategoryIds";
    public static String LOCALES_NAME = "locales";
    public static String DEFAULT_LOCALE_NAME = "defaultLocale";
    public static String UNDEFINED_SETTINGS_NAME = "undefinedSettings";

    private String uiUrl;
    private List<Integer> docBookTemplateIds;
    private List<Integer> seoCategoryIds;
    private List<String> locales;
    private String defaultLocale;
    private String docBuilderUrl;
    private RESTServerEntitiesV1 entities = new RESTServerEntitiesV1();
    private RESTServerUndefinedSettingCollectionV1 undefinedSettings;

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

    @Override
    public RESTServerSettingsV1 clone(boolean deepCopy) {
        final RESTServerSettingsV1 clone = new RESTServerSettingsV1();
        cloneInto(clone);
        return clone;
    }
}
