package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RESTApplicationEntitiesV1 {
    public static String UNDEFINED_ENTITIES_NAME = "undefinedEntities";

    /**
     * Maintains a list of the database fields that have been specifically set
     * on this object. This allows us to distinguish them from those that are
     * just null by default
     */
    private List<String> configuredParameters = null;

    private Integer contentSpecTagId;
    private Integer reviewTagId;
    private Integer typeCategoryId;
    private Integer writerCategoryId;
    private Integer rocBookDTDBlobConstantId;
    private Integer xmlFormattingStringConstantId;
    private Integer docbookElementsStringConstantId;
    private Integer topicTemplateStringConstantId;
    private Integer contentSpecTemplateStringConstantId;
    private Integer unknownUserId;
    private Map<String, Integer> undefinedEntities = new HashMap<String, Integer>();

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

    public Integer getContentSpecTagId() {
        return contentSpecTagId;
    }

    public void setContentSpecTagId(Integer contentSpecTagId) {
        this.contentSpecTagId = contentSpecTagId;
    }

    public Integer getReviewTagId() {
        return reviewTagId;
    }

    public void setReviewTagId(Integer reviewTagId) {
        this.reviewTagId = reviewTagId;
    }

    public Integer getTypeCategoryId() {
        return typeCategoryId;
    }

    public void setTypeCategoryId(Integer typeCategoryId) {
        this.typeCategoryId = typeCategoryId;
    }

    public Integer getWriterCategoryId() {
        return writerCategoryId;
    }

    public void setWriterCategoryId(Integer writerCategoryId) {
        this.writerCategoryId = writerCategoryId;
    }

    public Integer getRocBookDTDBlobConstantId() {
        return rocBookDTDBlobConstantId;
    }

    public void setRocBookDTDBlobConstantId(Integer rocBookDTDBlobConstantId) {
        this.rocBookDTDBlobConstantId = rocBookDTDBlobConstantId;
    }

    public Integer getXmlFormattingStringConstantId() {
        return xmlFormattingStringConstantId;
    }

    public void setXmlFormattingStringConstantId(Integer xmlFormattingStringConstantId) {
        this.xmlFormattingStringConstantId = xmlFormattingStringConstantId;
    }

    public Integer getDocbookElementsStringConstantId() {
        return docbookElementsStringConstantId;
    }

    public void setDocbookElementsStringConstantId(Integer docbookElementsStringConstantId) {
        this.docbookElementsStringConstantId = docbookElementsStringConstantId;
    }

    public Integer getTopicTemplateStringConstantId() {
        return topicTemplateStringConstantId;
    }

    public void setTopicTemplateStringConstantId(Integer topicTemplateStringConstantId) {
        this.topicTemplateStringConstantId = topicTemplateStringConstantId;
    }

    public Integer getContentSpecTemplateStringConstantId() {
        return contentSpecTemplateStringConstantId;
    }

    public void setContentSpecTemplateStringConstantId(Integer contentSpecTemplateStringConstantId) {
        this.contentSpecTemplateStringConstantId = contentSpecTemplateStringConstantId;
    }

    public Integer getUnknownUserId() {
        return unknownUserId;
    }

    public void setUnknownUserId(Integer unknownUserId) {
        this.unknownUserId = unknownUserId;
    }

    public Map<String, Integer> getUndefinedEntities() {
        return undefinedEntities;
    }

    public void setUndefinedEntities(Map<String, Integer> undefinedEntities) {
        this.undefinedEntities = undefinedEntities;
    }

    public void explicitSetUndefinedEntities(Map<String, Integer> undefinedEntities) {
        this.undefinedEntities = undefinedEntities;
        setParameterToConfigured(UNDEFINED_ENTITIES_NAME);
    }

    public void addUndefinedEntity(final String key, final Integer id) {
        undefinedEntities.put(key, id);
        setParameterToConfigured(UNDEFINED_ENTITIES_NAME);
    }
}
