package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RESTApplicationSettingsV1 {
    public static String UI_URL_NAME = "uiUrl";
    public static String DOCBUILDER_URL_NAME = "docBuilderUrl";
    public static String DOCBOOK_ELEMENTS_NAME = "docBookElements";
    public static String LOCALES_NAME = "locales";
    public static String DEFAULT_LOCALE_NAME = "defaultLocale";
    public static String UNDEFINED_SETTINGS_NAME = "undefinedSettings";

    /**
     * Maintains a list of the database fields that have been specifically set
     * on this object. This allows us to distinguish them from those that are
     * just null by default
     */
    private List<String> configuredParameters = null;

    private String uiUrl;
    private List<Integer> docBookTemplateIds;
    private List<String> locales;
    private String defaultLocale;
    private String docBuilderUrl;
    private RESTApplicationEntitiesV1 entities = new RESTApplicationEntitiesV1();
    private Map<String, String> undefinedSettings = new HashMap<String, String>();

    /**
     * This is a convenience method that adds a value to the configuredParameters collection
     *
     * @param parameter The parameter to specify as configured
     */
    protected void setParameterToConfigured(final String parameter) {
        if (configuredParameters == null) configuredParameters = new ArrayList<String>();
        if (!configuredParameters.contains(parameter)) configuredParameters.add(parameter);
    }

    public boolean hasParameterSet(final String parameter) {
        return getConfiguredParameters() != null && getConfiguredParameters().contains(parameter);
    }

    public List<String> getConfiguredParameters() {
        return configuredParameters;
    }

    public void setConfiguredParameters(List<String> configuredParameters) {
        this.configuredParameters = configuredParameters;
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

    public Map<String, String> getUndefinedSettings() {
        return undefinedSettings;
    }

    public void setUndefinedSettings(Map<String, String> undefinedSettings) {
        this.undefinedSettings = undefinedSettings;
    }

    public void explicitSetUndefinedSettings(Map<String, String> undefinedSettings) {
        this.undefinedSettings = undefinedSettings;
        setParameterToConfigured(UNDEFINED_SETTINGS_NAME);
    }

    public void addUndefinedSetting(final String key, final String value) {
        undefinedSettings.put(key, value);
        setParameterToConfigured(UNDEFINED_SETTINGS_NAME);
    }

    public RESTApplicationEntitiesV1 getEntities() {
        return entities;
    }

    public void setEntities(RESTApplicationEntitiesV1 entities) {
        this.entities = entities;
    }
}
