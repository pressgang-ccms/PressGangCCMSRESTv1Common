package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTContentSpecV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeTypeV1;

public class ComponentContentSpecV1 {
    private final RESTContentSpecV1 source;

    public ComponentContentSpecV1(final RESTContentSpecV1 source) {
        this.source = source;
    }

    public RESTCSNodeV1 returnMetaData(final String metaDataTitle) {
        return returnMetaData(source, metaDataTitle);
    }

    public static RESTCSNodeV1 returnMetaData(final RESTContentSpecV1 source, final String metaDataTitle) {
        if (source.getChildren_OTM() != null && source.getChildren_OTM().getItems() != null) {
            final List<RESTCSNodeV1> items = source.getChildren_OTM().returnItems();
            for (final RESTCSNodeV1 item : items) {
                if (item.getNodeType() == RESTCSNodeTypeV1.META_DATA && item.getTitle().equalsIgnoreCase(metaDataTitle)) {
                    return item;
                }
            }
        }

        return null;
    }
}
