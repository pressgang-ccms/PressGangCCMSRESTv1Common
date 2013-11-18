package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTServerUndefinedEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectWithConfiguredParametersV1;

public class RESTServerEntitiesV1 extends RESTBaseObjectWithConfiguredParametersV1<RESTServerEntitiesV1> {
    public static String UNDEFINED_ENTITIES_NAME = "undefinedEntities";

    private Integer abstractTagId;
    private Integer authorGroupTagId;
    private Integer contentSpecTagId;
    private Integer legalNoticeTagId;
    private Integer reviewTagId;
    private Integer revisionHistoryTagId;
    private Integer fixedUrlPropertyTagId;
    private Integer originalFileNamePropertyTagId;
    private Integer tagStylePropertyTagId;
    private Integer typeCategoryId;
    private Integer writerCategoryId;
    private Integer rocBookDTDBlobConstantId;
    private Integer xmlFormattingStringConstantId;
    private Integer docbookElementsStringConstantId;
    private Integer topicTemplateStringConstantId;
    private Integer contentSpecTemplateStringConstantId;
    private Integer unknownUserId;
    private RESTServerUndefinedEntityCollectionV1 undefinedEntities;

    public Integer getAbstractTagId() {
        return abstractTagId;
    }

    public void setAbstractTagId(Integer abstractTagId) {
        this.abstractTagId = abstractTagId;
    }

    public Integer getAuthorGroupTagId() {
        return authorGroupTagId;
    }

    public void setAuthorGroupTagId(Integer authorGroupTagId) {
        this.authorGroupTagId = authorGroupTagId;
    }

    public Integer getContentSpecTagId() {
        return contentSpecTagId;
    }

    public void setContentSpecTagId(Integer contentSpecTagId) {
        this.contentSpecTagId = contentSpecTagId;
    }

    public Integer getLegalNoticeTagId() {
        return legalNoticeTagId;
    }

    public void setLegalNoticeTagId(Integer legalNoticeTagId) {
        this.legalNoticeTagId = legalNoticeTagId;
    }

    public Integer getReviewTagId() {
        return reviewTagId;
    }

    public void setReviewTagId(Integer reviewTagId) {
        this.reviewTagId = reviewTagId;
    }

    public Integer getRevisionHistoryTagId() {
        return revisionHistoryTagId;
    }

    public void setRevisionHistoryTagId(Integer revisionHistoryTagId) {
        this.revisionHistoryTagId = revisionHistoryTagId;
    }

    public Integer getFixedUrlPropertyTagId() {
        return fixedUrlPropertyTagId;
    }

    public void setFixedUrlPropertyTagId(Integer fixedUrlPropertyTagId) {
        this.fixedUrlPropertyTagId = fixedUrlPropertyTagId;
    }

    public Integer getOriginalFileNamePropertyTagId() {
        return originalFileNamePropertyTagId;
    }

    public void setOriginalFileNamePropertyTagId(Integer originalFileNamePropertyTagId) {
        this.originalFileNamePropertyTagId = originalFileNamePropertyTagId;
    }

    public Integer getTagStylePropertyTagId() {
        return tagStylePropertyTagId;
    }

    public void setTagStylePropertyTagId(Integer tagStylePropertyTagId) {
        this.tagStylePropertyTagId = tagStylePropertyTagId;
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

    public RESTServerUndefinedEntityCollectionV1 getUndefinedEntities() {
        return undefinedEntities;
    }

    public void setUndefinedEntities(RESTServerUndefinedEntityCollectionV1 undefinedEntities) {
        this.undefinedEntities = undefinedEntities;
    }

    public void explicitSetUndefinedEntities(RESTServerUndefinedEntityCollectionV1 undefinedEntities) {
        this.undefinedEntities = undefinedEntities;
        setParameterToConfigured(UNDEFINED_ENTITIES_NAME);
    }

    @Override
    public RESTServerEntitiesV1 clone(boolean deepCopy) {
        final RESTServerEntitiesV1 clone = new RESTServerEntitiesV1();
        cloneInto(clone);
        return clone;
    }
}