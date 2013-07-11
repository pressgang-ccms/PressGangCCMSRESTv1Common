package org.jboss.pressgang.ccms.rest.v1.entities.enums;

import org.jboss.pressgang.ccms.utils.constants.CommonConstants;

public enum RESTFilterTypeV1 {
    TOPIC, CONTENT_SPEC;

    public static RESTFilterTypeV1 getFilterType(final Integer id) {
        switch (id) {
            case CommonConstants.FILTER_TOPIC:
                return TOPIC;
            case CommonConstants.FILTER_CONTENT_SPEC:
                return CONTENT_SPEC;
            default:
                return null;
        }
    }

    public static Integer getFilterTypeId(final RESTFilterTypeV1 type) {
        if (type == null) return null;

        switch (type) {
            case TOPIC:
                return CommonConstants.FILTER_TOPIC;
            case CONTENT_SPEC:
                return CommonConstants.FILTER_CONTENT_SPEC;
            default:
                return null;
        }
    }
}
