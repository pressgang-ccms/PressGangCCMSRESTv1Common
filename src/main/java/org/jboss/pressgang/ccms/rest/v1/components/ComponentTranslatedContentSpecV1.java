package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedContentSpecV1;

public class ComponentTranslatedContentSpecV1 {
    final RESTTranslatedContentSpecV1 source;

    public ComponentTranslatedContentSpecV1(final RESTTranslatedContentSpecV1 source) {
        this.source = source;
    }

    public String returnZanataId() {
        return returnZanataId(source);
    }

    public static String returnZanataId(final RESTTranslatedContentSpecV1 source) {
        return "CS" + source.getContentSpecId() + "-" + source.getContentSpecRevision();
    }
}
