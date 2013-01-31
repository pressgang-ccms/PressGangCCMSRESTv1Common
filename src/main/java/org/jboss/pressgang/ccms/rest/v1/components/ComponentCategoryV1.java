package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTTagInCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTTagInCategoryV1;

public class ComponentCategoryV1 {
    final RESTCategoryV1 source;

    public ComponentCategoryV1(final RESTCategoryV1 source) {
        this.source = source;
    }

    public boolean containsTag(final Integer tagId) {
        return containsTag(source, tagId);
    }

    public static boolean containsTag(final RESTCategoryV1 source, final Integer tagId) {
        return returnTag(source, tagId) != null;
    }

    public RESTTagInCategoryV1 returnTag(final Integer tagId) {
        return returnTag(source, tagId);
    }

    public static RESTTagInCategoryV1 returnTag(final RESTCategoryV1 source, final Integer tagId) {
        if (source == null) throw new IllegalArgumentException("source cannot be null");
        
        /* Strictly speaking a category can not be a parent to a tag with no id */
        if (tagId == null) return null;

        if (source.getTags() != null && source.getTags().getItems() != null) {
            for (final RESTTagInCategoryCollectionItemV1 tagItem : source.getTags().getItems()) {
                final RESTTagInCategoryV1 tag = tagItem.getItem();
                if (tag != null && tagId.equals(tag.getId()) && !tagItem.returnIsRemoveItem()) return tag;
            }
        }

        return null;
    }
}
