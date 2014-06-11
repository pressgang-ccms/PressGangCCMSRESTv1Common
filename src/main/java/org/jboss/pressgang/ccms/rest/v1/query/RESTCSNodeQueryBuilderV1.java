package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderWithPropertiesV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTCSNodeQueryBuilderV1 extends RESTBaseQueryBuilderWithPropertiesV1 {
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>() {
        private static final long serialVersionUID = -8638470044710698912L;

        {
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_ID_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_ID_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_REVISION_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_REVISION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_ID_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_ID_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_REVISION_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_REVISION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_IDS_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_IDS_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_IDS_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_TITLE_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_TITLE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_NODE_TYPE_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_NODE_TYPE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR_DESC));
        }
    };

    protected Map<Integer, Integer> tags = new HashMap<Integer, Integer>();

    public static List<Pair<String, String>> getFilterInfo() {
        return filterPairs;
    }

    public static String getFilterDesc(final String varName) {
        if (varName == null) return null;

        final List<Pair<String, String>> filterInfo = getFilterInfo();
        for (final Pair<String, String> varInfo : filterInfo) {
            if (varInfo.getFirst().equals(varName)) {
                return varInfo.getSecond();
            }
        }

        return null;
    }

    public List<Integer> getCSNodeIds() {
        final String csNodeIdsString = get(CommonFilterConstants.CONTENT_SPEC_NODE_IDS_FILTER_VAR);

        return getIntegerList(csNodeIdsString);
    }

    public void setCSNodeIds(final List<Integer> csNodeIds) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_IDS_FILTER_VAR, csNodeIds);
    }

    public List<Integer> getCSNodeTypes() {
        final String csNodeTypesString = get(CommonFilterConstants.CONTENT_SPEC_NODE_TYPE_FILTER_VAR);

        return getIntegerList(csNodeTypesString);
    }

    public void setCSNodeTypes(final List<Integer> csNodeTypes) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_TYPE_FILTER_VAR, csNodeTypes);
    }

    public String getCSNodeTitle() {
        return get(CommonFilterConstants.CONTENT_SPEC_NODE_TITLE_FILTER_VAR);
    }

    public void setCSNodeTitle(final String csNodeTitle) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_TITLE_FILTER_VAR, csNodeTitle);
    }

    public Integer getCSNodeEntityId() {
        final String entityId = get(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_ID_FILTER_VAR);
        return entityId == null ? null : Integer.parseInt(entityId);
    }

    public void setCSNodeEntityId(final Integer csNodeEntityId) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_ID_FILTER_VAR, csNodeEntityId);
    }

    public Integer getCSNodeEntityRevision() {
        final String entityRevision = get(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_REVISION_FILTER_VAR);
        return entityRevision == null ? null : Integer.parseInt(entityRevision);
    }

    public void setCSNodeEntityRevision(final Integer csNodeEntityRevision) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_REVISION_FILTER_VAR, csNodeEntityRevision);
    }

    public Integer getCSNodeInfoTopicId() {
        final String entityId = get(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_ID_FILTER_VAR);
        return entityId == null ? null : Integer.parseInt(entityId);
    }

    public void setCSNodeInfoTopicId(final Integer csNodeInfoTopicId) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_ID_FILTER_VAR, csNodeInfoTopicId);
    }

    public Integer getCSNodeInfoTopicRevision() {
        final String entityRevision = get(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_REVISION_FILTER_VAR);
        return entityRevision == null ? null : Integer.parseInt(entityRevision);
    }

    public void setCSNodeInfoTopicRevision(final Integer csNodeInfoTopicRevision) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_REVISION_FILTER_VAR, csNodeInfoTopicRevision);
    }

    public List<Integer> getCSNodeEntityIds() {
        final String csNodeEntityIdsString = get(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_IDS_FILTER_VAR);

        return getIntegerList(csNodeEntityIdsString);
    }

    public void setCSNodeEntityIds(final List<Integer> csNodeEntityIds) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_ENTITY_IDS_FILTER_VAR, csNodeEntityIds);
    }

    public List<Integer> getCSNodeInfoTopicIds() {
        final String csNodeInfoTopicIdsString = get(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_IDS_FILTER_VAR);

        return getIntegerList(csNodeInfoTopicIdsString);
    }

    public void setCSNodeInfoTopicIds(final List<Integer> csNodeEntityIds) {
        put(CommonFilterConstants.CONTENT_SPEC_NODE_INFO_TOPIC_IDS_FILTER_VAR, csNodeEntityIds);
    }

    public List<Integer> getContentSpecIds() {
        final String contentSpecIdsString = get(CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR);

        return getIntegerList(contentSpecIdsString);
    }

    public void setContentSpecIds(final List<Integer> contentSpecIds) {
        put(CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR, contentSpecIds);
    }
}

