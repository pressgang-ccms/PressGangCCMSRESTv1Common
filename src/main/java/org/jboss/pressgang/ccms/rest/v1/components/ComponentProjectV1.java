package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;

import static com.google.common.base.Preconditions.checkArgument;

public class ComponentProjectV1 {
    final RESTProjectV1 source;

    public ComponentProjectV1(final RESTProjectV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public boolean containsTag(final Integer tagId) {
        return containsTag(source, tagId);
    }

    public static boolean containsTag(final RESTProjectV1 source, final Integer tagId) {
        checkArgument(source != null, "The source parameter can not be null");

        if (tagId == null) return false;

        if (source.getTags() != null && source.getTags().getItems() != null) {
            for (final RESTTagCollectionItemV1 tagItem : source.getTags().getItems()) {
                final RESTTagV1 tag = tagItem.getItem();
                if (tag != null && tagId.equals(tag.getId()) && !tagItem.returnIsRemoveItem()) return true;
            }
        }

        return false;
    }
}
