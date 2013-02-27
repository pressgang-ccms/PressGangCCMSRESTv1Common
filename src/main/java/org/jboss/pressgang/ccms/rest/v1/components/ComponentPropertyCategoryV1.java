package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyCategoryInPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyTagInPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryInPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyTagInPropertyCategoryV1;

/**
 * Contains useful functions that run against a RESTPropertyCategoryV1, but which are not included in the RESTPropertyCategoryV1
 * class to prevent possible contamination with non GWT compatible code.
 */
public final class ComponentPropertyCategoryV1 {
    final RESTPropertyCategoryV1 source;

    public ComponentPropertyCategoryV1(final RESTPropertyCategoryV1 source) {
        this.source = source;
    }

    public boolean containsTag(final Integer tagId) {
        return isInCategory(source, tagId);
    }

    public static boolean isInCategory(final RESTPropertyCategoryV1 source, final Integer childId) {
        if (source == null) throw new IllegalArgumentException("source cannot be null");

        if (childId == null) return false;

        if (source.getPropertyTags() != null && source.getPropertyTags().getItems() != null) {
            for (final RESTPropertyTagInPropertyCategoryCollectionItemV1 childItem : source.getPropertyTags().getItems()) {
                final RESTPropertyTagInPropertyCategoryV1 child = childItem.getItem();
                if (child != null && childId.equals(child.getId()) && !childItem.returnIsRemoveItem()) return true;
            }
        }

        return false;
    }
}
