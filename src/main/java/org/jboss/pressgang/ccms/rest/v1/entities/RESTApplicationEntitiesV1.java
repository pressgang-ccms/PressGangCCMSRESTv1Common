package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTApplicationUndefinedEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectWithConfiguredParametersV1;

public class RESTApplicationEntitiesV1 extends RESTBaseObjectWithConfiguredParametersV1 {
    public static String UNDEFINED_ENTITIES_NAME = "undefinedEntities";

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
    private RESTApplicationUndefinedEntityCollectionV1 undefinedEntities;

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

    public RESTApplicationUndefinedEntityCollectionV1 getUndefinedEntities() {
        return undefinedEntities;
    }

    public void setUndefinedEntities(RESTApplicationUndefinedEntityCollectionV1 undefinedEntities) {
        this.undefinedEntities = undefinedEntities;
    }

    public void explicitSetUndefinedEntities(RESTApplicationUndefinedEntityCollectionV1 undefinedEntities) {
        this.undefinedEntities = undefinedEntities;
        setParameterToConfigured(UNDEFINED_ENTITIES_NAME);
    }
}