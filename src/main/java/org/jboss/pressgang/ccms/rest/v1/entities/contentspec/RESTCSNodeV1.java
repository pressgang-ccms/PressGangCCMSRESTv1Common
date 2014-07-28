/*
  Copyright 2011-2014 Red Hat

  This file is part of PresGang CCMS.

  PresGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PresGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PresGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTCSRelatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeTypeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.RESTCSRelatedNodeV1;

public class RESTCSNodeV1 extends RESTBaseCSNodeV1<RESTCSNodeV1, RESTCSNodeCollectionV1, RESTCSNodeCollectionItemV1> {
    public static final String TRANSLATED_NODES_NAME = "translatedNodes_OTM";
    public static final String NEXT_NODE_NAME = "nextNode";
    public static final String INFO_TOPIC_NODE_NAME = "infoTopicNode";

    protected RESTCSNodeV1 nextNode = null;
    protected RESTCSInfoNodeV1 infoTopicNode = null;
    protected RESTCSRelatedNodeCollectionV1 relatedToNodes = null;
    protected RESTCSRelatedNodeCollectionV1 relatedFromNodes = null;
    protected RESTCSNodeCollectionV1 children_OTM = null;
    private RESTTranslatedCSNodeCollectionV1 translatedNodes_OTM = null;
    private RESTCSNodeCollectionV1 revisions = null;

    public RESTCSNodeV1() {

    }

    public RESTCSNodeV1(final RESTCSRelatedNodeV1 relatedNode) {
        if (relatedNode != null) {
            relatedNode.cloneInto(this, true);
        }
    }

    @Override
    public RESTCSNodeCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTCSNodeCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCSNodeV1 clone(boolean deepCopy) {
        final RESTCSNodeV1 retValue = new RESTCSNodeV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCSNodeV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (relatedFromNodes != null) {
                clone.relatedFromNodes = new RESTCSRelatedNodeCollectionV1();
                relatedFromNodes.cloneInto(clone.relatedFromNodes, deepCopy);
            } else {
                clone.relatedFromNodes = null;
            }

            if (relatedToNodes != null) {
                clone.relatedToNodes = new RESTCSRelatedNodeCollectionV1();
                relatedToNodes.cloneInto(clone.relatedToNodes, deepCopy);
            } else {
                clone.relatedToNodes = null;
            }

            if (children_OTM != null) {
                clone.children_OTM = new RESTCSNodeCollectionV1();
                children_OTM.cloneInto(clone.children_OTM, deepCopy);
            } else {
                clone.children_OTM = null;
            }

            if (translatedNodes_OTM != null) {
                clone.translatedNodes_OTM = new RESTTranslatedCSNodeCollectionV1();
                translatedNodes_OTM.cloneInto(clone.translatedNodes_OTM, deepCopy);
            } else {
                clone.translatedNodes_OTM = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTCSNodeCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }

            if (nextNode != null) {
                clone.nextNode = nextNode.clone(deepCopy);
            } else {
                nextNode = null;
            }

            if (infoTopicNode != null) {
                clone.infoTopicNode = infoTopicNode.clone(deepCopy);
            } else {
                infoTopicNode = null;
            }
        } else {
            clone.relatedFromNodes = relatedFromNodes;
            clone.relatedToNodes = relatedToNodes;
            clone.children_OTM = children_OTM;
            clone.translatedNodes_OTM = translatedNodes_OTM;
            clone.revisions = revisions;
            clone.nextNode = nextNode;
            clone.infoTopicNode = infoTopicNode;
        }
    }

    public void explicitSetTitle(final String title) {
        this.title = title;
        setParameterToConfigured(TITLE_NAME);
    }

    public void explicitSetTargetId(final String targetId) {
        this.targetId = targetId;
        setParameterToConfigured(TARGET_ID_NAME);
    }

    public void explicitSetAdditionalText(final String additionalText) {
        this.additionalText = additionalText;
        setParameterToConfigured(ADDITIONAL_TEXT_NAME);
    }

    public void explicitSetNodeType(final RESTCSNodeTypeV1 nodeType) {
        this.nodeType = nodeType;
        setParameterToConfigured(NODE_TYPE_NAME);
    }

    public void explicitSetEntityId(final Integer entityId) {
        this.entityId = entityId;
        setParameterToConfigured(ENTITY_ID_NAME);
    }

    public void explicitSetEntityRevision(final Integer entityRevision) {
        this.entityRevision = entityRevision;
        setParameterToConfigured(ENTITY_REVISION_NAME);
    }

    public void explicitSetCondition(final String condition) {
        this.condition = condition;
        setParameterToConfigured(CONDITION_NAME);
    }

    public RESTCSNodeV1 getNextNode() {
        return nextNode;
    }

    public void setNextNode(final RESTCSNodeV1 nextNode) {
        this.nextNode = nextNode;
    }

    public void explicitSetNextNode(final RESTCSNodeV1 nextNode) {
        this.nextNode = nextNode;
        setParameterToConfigured(NEXT_NODE_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        setParameterToConfigured(PROPERTIES_NAME);
    }

    public RESTTranslatedCSNodeCollectionV1 getTranslatedNodes_OTM() {
        return translatedNodes_OTM;
    }

    public void setTranslatedNodes_OTM(final RESTTranslatedCSNodeCollectionV1 translatedNodes) {
        translatedNodes_OTM = translatedNodes;
    }

    public RESTCSRelatedNodeCollectionV1 getRelatedToNodes() {
        return relatedToNodes;
    }

    public void setRelatedToNodes(final RESTCSRelatedNodeCollectionV1 relatedToNodes) {
        this.relatedToNodes = relatedToNodes;
    }

    public void explicitSetRelatedToNodes(final RESTCSRelatedNodeCollectionV1 relatedToNodes) {
        this.relatedToNodes = relatedToNodes;
        setParameterToConfigured(RELATED_TO_NAME);
    }

    public RESTCSRelatedNodeCollectionV1 getRelatedFromNodes() {
        return relatedFromNodes;
    }

    public void setRelatedFromNodes(final RESTCSRelatedNodeCollectionV1 relatedFromNodes) {
        this.relatedFromNodes = relatedFromNodes;
    }

    public void explicitSetRelatedFromNodes(final RESTCSRelatedNodeCollectionV1 relatedFromNodes) {
        this.relatedFromNodes = relatedFromNodes;
        setParameterToConfigured(RELATED_FROM_NAME);
    }

    public RESTCSNodeCollectionV1 getChildren_OTM() {
        return children_OTM;
    }

    public void setChildren_OTM(final RESTCSNodeCollectionV1 children_OTM) {
        this.children_OTM = children_OTM;
    }

    public void explicitSetChildren_OTM(final RESTCSNodeCollectionV1 children_OTM) {
        this.children_OTM = children_OTM;
        setParameterToConfigured(CHILDREN_NAME);
    }

    public RESTCSInfoNodeV1 getInfoTopicNode() {
        return infoTopicNode;
    }

    public void setInfoTopicNode(final RESTCSInfoNodeV1 infoTopicNode) {
        this.infoTopicNode = infoTopicNode;
    }

    public void explicitSetInfoTopicNode(final RESTCSInfoNodeV1 infoTopicNode) {
        this.infoTopicNode = infoTopicNode;
        setParameterToConfigured(INFO_TOPIC_NODE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTCSNodeV1)) return false;

        return super.equals(other);
    }
}
