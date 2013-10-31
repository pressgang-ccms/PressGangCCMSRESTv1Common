package org.jboss.pressgang.ccms.rest.v1.constants;

public class RESTv1Constants {
    private RESTv1Constants() {
    }

    public static final String X_VERSION_HEADER = "X-Version";
    public static final String X_CSP_VERSION_HEADER = "X-CSP-Version";
    /**
     * The generic name of the Docbook 4.5 Doctype
     */
    public static final String DOCBOOK_45_DOCTYPE_NAME = "Docbook 4.5";
    /**
     * The generic name of the Docbook 5.0 Doctype
     */
    public static final String DOCBOOK_50_DOCTYPE_NAME = "Docbook 5.0";

    public static final String TOPICS_EXPANSION_NAME = "topics";
    public static final String IMAGES_EXPANSION_NAME = "images";
    public static final String FILES_EXPANSION_NAME = "files";
    public static final String TAGS_EXPANSION_NAME = "tags";
    public static final String PROJECTS_EXPANSION_NAME = "projects";
    public static final String USERS_EXPANSION_NAME = "users";
    public static final String BLOBCONSTANTS_EXPANSION_NAME = "blobConstants";
    public static final String STRINGCONSTANTS_EXPANSION_NAME = "stringConstants";
    public static final String INTEGERCONSTANTS_EXPANSION_NAME = "integerConstants";
    public static final String PROPERTYTAGS_EXPANSION_NAME = "propertyTags";
    public static final String PROPERTY_CATEGORIES_EXPANSION_NAME = "propertyCategories";
    public static final String ROLES_EXPANSION_NAME = "roles";
    public static final String TRANSLATEDTOPICS_EXPANSION_NAME = "translatedTopics";
    public static final String TRANSLATEDTOPICSTRINGS_EXPANSION_NAME = "translatedTopicStrings";

    public static final String FILTERS_EXPANSION_NAME = "filters";
    public static final String FILTER_TAGS_EXPANSION_NAME = "filterTags";
    public static final String FILTER_CATEGORIES_EXPANSION_NAME = "filterCategories";
    public static final String FILTER_LOCALES_EXPANSION_NAME = "filterLocales";
    public static final String FILTER_FIELDS_EXPANSION_NAME = "filterFields";

    public static final String CATEGORIES_EXPANSION_NAME = "categories";

    public static final String CONTENT_SPEC_EXPANSION_NAME = "contentSpecs";
    public static final String CONTENT_SPEC_NODE_EXPANSION_NAME = "nodes";
    public static final String TRANSLATED_CONTENT_SPEC_EXPANSION_NAME = "translatedContentSpecs";
    public static final String CONTENT_SPEC_TRANSLATED_NODE_EXPANSION_NAME = "translatedNodes";

    public static final String TOPIC_URL_NAME = "topic";
    public static final String TOPICSOURCEURL_URL_NAME = "topicsourceurl";
    public static final String BUGZILLABUG_URL_NAME = "bugzillabug";
    public static final String TRANSLATEDTOPIC_URL_NAME = "translatedtopic";
    public static final String TRANSLATEDTOPICDATA_URL_NAME = "translatedtopicdata";
    public static final String TRANSLATEDTOPICSTRING_URL_NAME = "translatedtopicstring";
    public static final String PROJECT_URL_NAME = "project";
    public static final String TAG_URL_NAME = "tag";
    public static final String CATEGORY_URL_NAME = "category";
    public static final String USER_URL_NAME = "user";
    public static final String BLOBCONSTANT_URL_NAME = "blobconstant";
    public static final String STRINGCONSTANT_URL_NAME = "stringconstant";
    public static final String INTEGERCONSTANT_URL_NAME = "integerconstant";

    public static final String IMAGE_URL_NAME = "image";
    public static final String LANGUAGEIMAGE_URL_NAME = "languageimage";
    public static final String FILE_URL_NAME = "file";
    public static final String LANGUAGE_FILE_URL_NAME = "languagefile";
    public static final String PROPERTYTAG_URL_NAME = "propertytag";
    public static final String PROPERTY_CATEGORY_URL_NAME = "propertycategory";
    public static final String ROLE_URL_NAME = "role";

    public static final String FILTER_URL_NAME = "filter";
    public static final String FILTER_TAG_URL_NAME = "filtertag";
    public static final String FILTER_LOCALE_URL_NAME = "filterlocale";
    public static final String FILTER_CATEGORY_URL_NAME = "filtercategory";
    public static final String FILTER_FIELD_URL_NAME = "filterfield";

    public static final String CONTENT_SPEC_URL_NAME = "contentspec";
    public static final String CONTENT_SPEC_NODE_URL_NAME = "contentspecnode";
    public static final String TRANSLATED_CONTENT_SPEC_URL_NAME = "translatedcontentspec";
    public static final String CONTENT_SPEC_TRANSLATED_NODE_URL_NAME = "translatedcontentspecnode";

    public static final String JSON_URL = "json";
    public static final String XML_URL = "xml";
    public static final String TEXT_URL = "text";

    public static final String ACCESS_CONTROL_ALLOW_ORIGIN_HEADER = "Access-Control-Allow-Origin";
    public static final String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";
    public static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
    public static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
    public static final String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";
    public static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
    /**
     * A header sent back with every request.
     */
    public static final String X_PRESSGANG_VERSION_HEADER = "X-PressGang-Version";

    /**
     * The key used to indicate the type of chart
     */
    public static final String CHART_TYPE = "chartType";
    /**
     * The value assigned to the chartType option to indicate a pie chart
     */
    public static final String CHART_PIE_TYPE = "chartPieType";
    /**
     * The value assigned to the chartType option to indicate a 3d pie chart
     */
    public static final String CHART_PIE3D_TYPE = "chartPie3DType";
    /**
     * The value assigned to the chartType option to indicate a bar chart
     */
    public static final String CHART_BAR_TYPE = "chartBarType";
    /**
     * The key used to indicate a tag grouping option
     */
    public static final String CHART_TAG_GROUP = "chartTagGroup";
    /**
     * The key used to indicate a chart title
     */
    public static final String CHART_TITLE = "chartTitle";
    /**
     * The key used to indicate the presence of a chart legend
     */
    public static final String CHART_SHOW_LEGEND = "chartShowLegend";
}
