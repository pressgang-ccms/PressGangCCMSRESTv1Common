/*
  Copyright 2011-2014 Red Hat

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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTServerUndefinedEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementWithConfiguredParametersV1;

public class RESTServerEntitiesV1 extends RESTBaseElementWithConfiguredParametersV1<RESTServerEntitiesV1> {
    public static String UNDEFINED_ENTITIES_NAME = "undefinedEntities";

    private Integer abstractTagId;
    private Integer authorGroupTagId;
    private Integer contentSpecTagId;
    private Integer frozenTagId;
    private Integer infoTagId;
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
    private Integer rocBook45DTDBlobConstantId;
    private Integer docBook50RNGBlobConstantId;

    private Integer xmlFormattingStringConstantId;
    private Integer docBookElementsStringConstantId;
    private Integer topicTemplateId;
    private Integer docBook45AbstractTopicTemplateId;
    private Integer docBook45AuthorGroupTopicTemplateId;
    private Integer docBook45InfoTopicTemplateId;
    private Integer docBook45LegalNoticeTopicTemplateId;
    private Integer docBook45RevisionHistoryTopicTemplateId;
    private Integer docBook50AbstractTopicTemplateId;
    private Integer docBook50AuthorGroupTopicTemplateId;
    private Integer docBook50InfoTopicTemplateId;
    private Integer docBook50LegalNoticeTopicTemplateId;
    private Integer docBook50RevisionHistoryTopicTemplateId;
    private Integer contentSpecTemplateId;
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

    public Integer getInfoTagId() {
        return infoTagId;
    }

    public void setInfoTagId(Integer infoTagId) {
        this.infoTagId = infoTagId;
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

    public Integer getRocBook45DTDBlobConstantId() {
        return rocBook45DTDBlobConstantId;
    }

    public void setRocBook45DTDBlobConstantId(Integer rocBook45DTDBlobConstantId) {
        this.rocBook45DTDBlobConstantId = rocBook45DTDBlobConstantId;
    }

    public Integer getDocBook50RNGBlobConstantId() {
        return docBook50RNGBlobConstantId;
    }

    public void setDocBook50RNGBlobConstantId(Integer docBook50RNGBlobConstantId) {
        this.docBook50RNGBlobConstantId = docBook50RNGBlobConstantId;
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

    public Integer getTopicTemplateId() {
        return topicTemplateId;
    }

    public void setTopicTemplateId(Integer topicTemplateId) {
        this.topicTemplateId = topicTemplateId;
    }

    public Integer getDocBook45AbstractTopicTemplateId() {
        return docBook45AbstractTopicTemplateId;
    }

    public void setDocBook45AbstractTopicTemplateId(Integer docBook45AbstractTopicTemplateId) {
        this.docBook45AbstractTopicTemplateId = docBook45AbstractTopicTemplateId;
    }

    public Integer getDocBook45AuthorGroupTopicTemplateId() {
        return docBook45AuthorGroupTopicTemplateId;
    }

    public void setDocBook45AuthorGroupTopicTemplateId(Integer docBook45AuthorGroupTopicTemplateId) {
        this.docBook45AuthorGroupTopicTemplateId = docBook45AuthorGroupTopicTemplateId;
    }

    public Integer getDocBook45InfoTopicTemplateId() {
        return docBook45InfoTopicTemplateId;
    }

    public void setDocBook45InfoTopicTemplateId(Integer docBook45InfoTopicTemplateId) {
        this.docBook45InfoTopicTemplateId = docBook45InfoTopicTemplateId;
    }

    public Integer getDocBook45LegalNoticeTopicTemplateId() {
        return docBook45LegalNoticeTopicTemplateId;
    }

    public void setDocBook45LegalNoticeTopicTemplateId(Integer docBook45LegalNoticeTopicTemplateId) {
        this.docBook45LegalNoticeTopicTemplateId = docBook45LegalNoticeTopicTemplateId;
    }

    public Integer getDocBook45RevisionHistoryTopicTemplateId() {
        return docBook45RevisionHistoryTopicTemplateId;
    }

    public void setDocBook45RevisionHistoryTopicTemplateId(Integer docBook45RevisionHistoryTopicTemplateId) {
        this.docBook45RevisionHistoryTopicTemplateId = docBook45RevisionHistoryTopicTemplateId;
    }

    public Integer getDocBook50AbstractTopicTemplateId() {
        return docBook50AbstractTopicTemplateId;
    }

    public void setDocBook50AbstractTopicTemplateId(Integer docBook50AbstractTopicTemplateId) {
        this.docBook50AbstractTopicTemplateId = docBook50AbstractTopicTemplateId;
    }

    public Integer getDocBook50AuthorGroupTopicTemplateId() {
        return docBook50AuthorGroupTopicTemplateId;
    }

    public void setDocBook50AuthorGroupTopicTemplateId(Integer docBook50AuthorGroupTopicTemplateId) {
        this.docBook50AuthorGroupTopicTemplateId = docBook50AuthorGroupTopicTemplateId;
    }

    public Integer getDocBook50InfoTopicTemplateId() {
        return docBook50InfoTopicTemplateId;
    }

    public void setDocBook50InfoTopicTemplateId(Integer docBook50InfoTopicTemplateId) {
        this.docBook50InfoTopicTemplateId = docBook50InfoTopicTemplateId;
    }

    public Integer getDocBook50LegalNoticeTopicTemplateId() {
        return docBook50LegalNoticeTopicTemplateId;
    }

    public void setDocBook50LegalNoticeTopicTemplateId(Integer docBook50LegalNoticeTopicTemplateId) {
        this.docBook50LegalNoticeTopicTemplateId = docBook50LegalNoticeTopicTemplateId;
    }

    public Integer getDocBook50RevisionHistoryTopicTemplateId() {
        return docBook50RevisionHistoryTopicTemplateId;
    }

    public void setDocBook50RevisionHistoryTopicTemplateId(Integer docBook50RevisionHistoryTopicTemplateId) {
        this.docBook50RevisionHistoryTopicTemplateId = docBook50RevisionHistoryTopicTemplateId;
    }

    public Integer getContentSpecTemplateId() {
        return contentSpecTemplateId;
    }

    public void setContentSpecTemplateId(Integer contentSpecTemplateId) {
        this.contentSpecTemplateId = contentSpecTemplateId;
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
        cloneInto(clone, deepCopy);
        return clone;
    }

    public void cloneInto(final RESTServerEntitiesV1 clone, final boolean deepCopy) {
        clone.abstractTagId = abstractTagId;
        clone.authorGroupTagId = authorGroupTagId;
        clone.contentSpecTagId = contentSpecTagId;
        clone.frozenTagId = frozenTagId;
        clone.infoTagId = infoTagId;
        clone.internalOnlyTagId = internalOnlyTagId;
        clone.legalNoticeTagId = legalNoticeTagId;
        clone.obsoleteTagId = obsoleteTagId;
        clone.reviewTagId = reviewTagId;
        clone.revisionHistoryTagId = revisionHistoryTagId;
        clone.taskTagId = taskTagId;

        clone.addedByPropertyTagId = addedByPropertyTagId;
        clone.bugLinksLastValidatedPropertyTagId = bugLinksLastValidatedPropertyTagId;
        clone.cspIdPropertyTagId = cspIdPropertyTagId;
        clone.emailPropertyTagId = emailPropertyTagId;
        clone.firstNamePropertyTagId = firstNamePropertyTagId;
        clone.fixedUrlPropertyTagId = fixedUrlPropertyTagId;
        clone.orgPropertyTagId = orgPropertyTagId;
        clone.orgDivisionPropertyTagId = orgDivisionPropertyTagId;
        clone.originalFileNamePropertyTagId = originalFileNamePropertyTagId;
        clone.pressGangWebsitePropertyTagId = pressGangWebsitePropertyTagId;
        clone.readOnlyPropertyTagId = readOnlyPropertyTagId;
        clone.surnamePropertyTagId = surnamePropertyTagId;
        clone.tagStylePropertyTagId = tagStylePropertyTagId;

        clone.typeCategoryId = typeCategoryId;
        clone.writerCategoryId = writerCategoryId;

        clone.failPenguinBlobConstantId = failPenguinBlobConstantId;
        clone.rocBook45DTDBlobConstantId = rocBook45DTDBlobConstantId;
        clone.docBook50RNGBlobConstantId = docBook50RNGBlobConstantId;

        clone.xmlFormattingStringConstantId = xmlFormattingStringConstantId;
        clone.docBookElementsStringConstantId = docBookElementsStringConstantId;
        clone.topicTemplateId = topicTemplateId;
        clone.docBook45AbstractTopicTemplateId = docBook45AbstractTopicTemplateId;
        clone.docBook45AuthorGroupTopicTemplateId = docBook45AuthorGroupTopicTemplateId;
        clone.docBook45InfoTopicTemplateId = docBook45InfoTopicTemplateId;
        clone.docBook45LegalNoticeTopicTemplateId = docBook45LegalNoticeTopicTemplateId;
        clone.docBook45RevisionHistoryTopicTemplateId = docBook45RevisionHistoryTopicTemplateId;
        clone.docBook50AbstractTopicTemplateId = docBook50AbstractTopicTemplateId;
        clone.docBook50AuthorGroupTopicTemplateId = docBook50AuthorGroupTopicTemplateId;
        clone.docBook50InfoTopicTemplateId = docBook50InfoTopicTemplateId;
        clone.docBook50LegalNoticeTopicTemplateId = docBook50LegalNoticeTopicTemplateId;
        clone.docBook50RevisionHistoryTopicTemplateId = docBook50RevisionHistoryTopicTemplateId;
        clone.contentSpecTemplateId = contentSpecTemplateId;
        clone.articleStringConstantId = articleStringConstantId;
        clone.articleInfoStringConstantId = articleInfoStringConstantId;
        clone.authorGroupStringConstantId = authorGroupStringConstantId;
        clone.bookStringConstantId = bookStringConstantId;
        clone.bookInfoStringConstantId = bookInfoStringConstantId;
        clone.pomStringConstantId = pomStringConstantId;
        clone.prefaceStringConstantId = prefaceStringConstantId;
        clone.publicanCfgStringConstantId = publicanCfgStringConstantId;
        clone.revisionHistoryStringConstantId = revisionHistoryStringConstantId;
        clone.emptyTopicStringConstantId = emptyTopicStringConstantId;
        clone.invalidInjectionStringConstantId = invalidInjectionStringConstantId;
        clone.invalidTopicStringConstantId = invalidTopicStringConstantId;
        
        if (deepCopy) {
            if (undefinedEntities != null) {
                clone.undefinedEntities = new RESTServerUndefinedEntityCollectionV1();
                undefinedEntities.cloneInto(clone.undefinedEntities, deepCopy);
            } else {
                clone.undefinedEntities = null;
            }
        } else {
            clone.undefinedEntities = undefinedEntities;
        }
    }
}