package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTContentSpecV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTextContentSpecV1;
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

    /**
     If the last save of the content spec was not valid, the text field will display the
     last valid state, the errors field will be populated, and the failedContentSpec will
     have the invalid spec text.

     In this situation, the UI will display the invalid spec text. So we copy the invalid text
     into the text field, and edit as usual. This provides a workflow much like topics where
     the user can save invalid data, and will receive a warning about it when the save is completed.

     @param source The spec to fix
     */
    public static void fixDisplayedText(final RESTTextContentSpecV1 source)
    {
        if (source.getFailedContentSpec() != null) {
            source.setText(source.getFailedContentSpec());
        }
    }
}
