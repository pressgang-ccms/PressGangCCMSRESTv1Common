package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTServerUndefinedEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectWithConfiguredParametersV1;

public class RESTServerEntitiesV1 extends RESTBaseObjectWithConfiguredParametersV1<RESTServerEntitiesV1> {
    public static String UNDEFINED_ENTITIES_NAME = "undefinedEntities";

    private Integer abstractTagId;
    private Integer authorGroupTagId;
    private Integer contentSpecTagId;
    private Integer frozenTagId;
    private Integer internalOnlyTagId;
    private Integer legalNoticeTagId;
    private Integer obsoleteTagId;
    private Integer reviewTagId;
    private Integer revisionHistoryTagId;
    private Integer taskTagId;

    private Integer addedByPropertyTagId;
    private Integer bugLinksLastValidatedPropertyTagId;
    private Integer cspIdPropertyTagId;
    private Integer emailPropertyTagId;
    private Integer firstNamePropertyTagId;
    private Integer fixedUrlPropertyTagId;
    private Integer orgPropertyTagId;
    private Integer orgDivisionPropertyTagId;
    private Integer originalFileNamePropertyTagId;
    private Integer pressGangWebsitePropertyTagId;
    private Integer readOnlyPropertyTagId;
    private Integer surnamePropertyTagId;
    private Integer tagStylePropertyTagId;

    private Integer typeCategoryId;
    private Integer writerCategoryId;

    private Integer failPenguinBlobConstantId;
    private Integer rocBookDTDBlobConstantId;

    private Integer xmlFormattingStringConstantId;
    private Integer docBookElementsStringConstantId;
    private Integer topicTemplateStringConstantId;
    private Integer contentSpecTemplateStringConstantId;
    private Integer articleStringConstantId;
    private Integer articleInfoStringConstantId;
    private Integer authorGroupStringConstantId;
    private Integer bookStringConstantId;
    private Integer bookInfoStringConstantId;
    private Integer pomStringConstantId;
    private Integer prefaceStringConstantId;
    private Integer publicanCfgStringConstantId;
    private Integer revisionHistoryStringConstantId;
    private Integer emptyTopicStringConstantId;
    private Integer invalidInjectionStringConstantId;
    private Integer invalidTopicStringConstantId;

    private Integer unknownUserId;

    private RESTServerUndefinedEntityCollectionV1 undefinedEntities;

    /*
     * TAGS
     */

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

    public Integer getFrozenTagId() {
        return frozenTagId;
    }

    public void setFrozenTagId(Integer frozenTagId) {
        this.frozenTagId = frozenTagId;
    }

    public Integer getInternalOnlyTagId() {
        return internalOnlyTagId;
    }

    public void setInternalOnlyTagId(Integer internalOnlyTagId) {
        this.internalOnlyTagId = internalOnlyTagId;
    }

    public Integer getLegalNoticeTagId() {
        return legalNoticeTagId;
    }

    public void setLegalNoticeTagId(Integer legalNoticeTagId) {
        this.legalNoticeTagId = legalNoticeTagId;
    }

    public Integer getObsoleteTagId() {
        return obsoleteTagId;
    }

    public void setObsoleteTagId(Integer obsoleteTagId) {
        this.obsoleteTagId = obsoleteTagId;
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

    public Integer getTaskTagId() {
        return taskTagId;
    }

    public void setTaskTagId(Integer taskTagId) {
        this.taskTagId = taskTagId;
    }

    /*
     * PROPERTY TAGS
     */

    public Integer getAddedByPropertyTagId() {
        return addedByPropertyTagId;
    }

    public void setAddedByPropertyTagId(Integer addedByPropertyTagId) {
        this.addedByPropertyTagId = addedByPropertyTagId;
    }

    public Integer getBugLinksLastValidatedPropertyTagId() {
        return bugLinksLastValidatedPropertyTagId;
    }

    public void setBugLinksLastValidatedPropertyTagId(Integer bugLinksLastValidatedPropertyTagId) {
        this.bugLinksLastValidatedPropertyTagId = bugLinksLastValidatedPropertyTagId;
    }

    public Integer getCspIdPropertyTagId() {
        return cspIdPropertyTagId;
    }

    public void setCspIdPropertyTagId(Integer cspIdPropertyTagId) {
        this.cspIdPropertyTagId = cspIdPropertyTagId;
    }

    public Integer getEmailPropertyTagId() {
        return emailPropertyTagId;
    }

    public void setEmailPropertyTagId(Integer emailPropertyTagId) {
        this.emailPropertyTagId = emailPropertyTagId;
    }

    public Integer getFirstNamePropertyTagId() {
        return firstNamePropertyTagId;
    }

    public void setFirstNamePropertyTagId(Integer firstNamePropertyTagId) {
        this.firstNamePropertyTagId = firstNamePropertyTagId;
    }

    public Integer getFixedUrlPropertyTagId() {
        return fixedUrlPropertyTagId;
    }

    public void setFixedUrlPropertyTagId(Integer fixedUrlPropertyTagId) {
        this.fixedUrlPropertyTagId = fixedUrlPropertyTagId;
    }

    public Integer getOrgPropertyTagId() {
        return orgPropertyTagId;
    }

    public void setOrgPropertyTagId(Integer orgPropertyTagId) {
        this.orgPropertyTagId = orgPropertyTagId;
    }

    public Integer getOrgDivisionPropertyTagId() {
        return orgDivisionPropertyTagId;
    }

    public void setOrgDivisionPropertyTagId(Integer orgDivisionPropertyTagId) {
        this.orgDivisionPropertyTagId = orgDivisionPropertyTagId;
    }

    public Integer getOriginalFileNamePropertyTagId() {
        return originalFileNamePropertyTagId;
    }

    public void setOriginalFileNamePropertyTagId(Integer originalFileNamePropertyTagId) {
        this.originalFileNamePropertyTagId = originalFileNamePropertyTagId;
    }

    public Integer getPressGangWebsitePropertyTagId() {
        return pressGangWebsitePropertyTagId;
    }

    public void setPressGangWebsitePropertyTagId(Integer pressGangWebsitePropertyTagId) {
        this.pressGangWebsitePropertyTagId = pressGangWebsitePropertyTagId;
    }

    public Integer getReadOnlyPropertyTagId() {
        return readOnlyPropertyTagId;
    }

    public void setReadOnlyPropertyTagId(Integer readOnlyPropertyTagId) {
        this.readOnlyPropertyTagId = readOnlyPropertyTagId;
    }

    public Integer getSurnamePropertyTagId() {
        return surnamePropertyTagId;
    }

    public void setSurnamePropertyTagId(Integer surnamePropertyTagId) {
        this.surnamePropertyTagId = surnamePropertyTagId;
    }

    public Integer getTagStylePropertyTagId() {
        return tagStylePropertyTagId;
    }

    public void setTagStylePropertyTagId(Integer tagStylePropertyTagId) {
        this.tagStylePropertyTagId = tagStylePropertyTagId;
    }

    /*
     * CATEGORIES
     */

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

    /*
     * BLOB CONSTANTS
     */

    public Integer getFailPenguinBlobConstantId() {
        return failPenguinBlobConstantId;
    }

    public void setFailPenguinBlobConstantId(Integer failPenguinBlobConstantId) {
        this.failPenguinBlobConstantId = failPenguinBlobConstantId;
    }

    public Integer getRocBookDTDBlobConstantId() {
        return rocBookDTDBlobConstantId;
    }

    public void setRocBookDTDBlobConstantId(Integer rocBookDTDBlobConstantId) {
        this.rocBookDTDBlobConstantId = rocBookDTDBlobConstantId;
    }

    /*
     * STRING CONSTANTS
     */

    public Integer getXmlFormattingStringConstantId() {
        return xmlFormattingStringConstantId;
    }

    public void setXmlFormattingStringConstantId(Integer xmlFormattingStringConstantId) {
        this.xmlFormattingStringConstantId = xmlFormattingStringConstantId;
    }

    public Integer getDocBookElementsStringConstantId() {
        return docBookElementsStringConstantId;
    }

    public void setDocBookElementsStringConstantId(Integer docBookElementsStringConstantId) {
        this.docBookElementsStringConstantId = docBookElementsStringConstantId;
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

    public Integer getArticleStringConstantId() {
        return articleStringConstantId;
    }

    public void setArticleStringConstantId(Integer articleStringConstantId) {
        this.articleStringConstantId = articleStringConstantId;
    }

    public Integer getArticleInfoStringConstantId() {
        return articleInfoStringConstantId;
    }

    public void setArticleInfoStringConstantId(Integer articleInfoStringConstantId) {
        this.articleInfoStringConstantId = articleInfoStringConstantId;
    }

    public Integer getAuthorGroupStringConstantId() {
        return authorGroupStringConstantId;
    }

    public void setAuthorGroupStringConstantId(Integer authorGroupStringConstantId) {
        this.authorGroupStringConstantId = authorGroupStringConstantId;
    }

    public Integer getBookStringConstantId() {
        return bookStringConstantId;
    }

    public void setBookStringConstantId(Integer bookStringConstantId) {
        this.bookStringConstantId = bookStringConstantId;
    }

    public Integer getBookInfoStringConstantId() {
        return bookInfoStringConstantId;
    }

    public void setBookInfoStringConstantId(Integer bookInfoStringConstantId) {
        this.bookInfoStringConstantId = bookInfoStringConstantId;
    }

    public Integer getPomStringConstantId() {
        return pomStringConstantId;
    }

    public void setPomStringConstantId(Integer pomStringConstantId) {
        this.pomStringConstantId = pomStringConstantId;
    }

    public Integer getPrefaceStringConstantId() {
        return prefaceStringConstantId;
    }

    public void setPrefaceStringConstantId(Integer prefaceStringConstantId) {
        this.prefaceStringConstantId = prefaceStringConstantId;
    }

    public Integer getPublicanCfgStringConstantId() {
        return publicanCfgStringConstantId;
    }

    public void setPublicanCfgStringConstantId(Integer publicanCfgStringConstantId) {
        this.publicanCfgStringConstantId = publicanCfgStringConstantId;
    }

    public Integer getRevisionHistoryStringConstantId() {
        return revisionHistoryStringConstantId;
    }

    public void setRevisionHistoryStringConstantId(Integer revisionHistoryStringConstantId) {
        this.revisionHistoryStringConstantId = revisionHistoryStringConstantId;
    }

    public Integer getEmptyTopicStringConstantId() {
        return emptyTopicStringConstantId;
    }

    public void setEmptyTopicStringConstantId(Integer emptyTopicStringConstantId) {
        this.emptyTopicStringConstantId = emptyTopicStringConstantId;
    }

    public Integer getInvalidInjectionStringConstantId() {
        return invalidInjectionStringConstantId;
    }

    public void setInvalidInjectionStringConstantId(Integer invalidInjectionStringConstantId) {
        this.invalidInjectionStringConstantId = invalidInjectionStringConstantId;
    }

    public Integer getInvalidTopicStringConstantId() {
        return invalidTopicStringConstantId;
    }

    public void setInvalidTopicStringConstantId(Integer invalidTopicStringConstantId) {
        this.invalidTopicStringConstantId = invalidTopicStringConstantId;
    }

    /*
     * USERS
     */

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