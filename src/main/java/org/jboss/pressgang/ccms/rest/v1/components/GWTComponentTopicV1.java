package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * This component contains methods that can be applied against the topic entity. It excludes any
 * methods that are not GWT compatible (unlike the ComponentTopicV1 class, which includes a bunch
 * of XML processing).
 *
 * @author Matthew Casperson
 */
public abstract class GWTComponentTopicV1 extends ComponentBaseRESTEntityWithPropertiesV1 {
    final RESTBaseTopicV1<?, ?, ?> source;

    protected GWTComponentTopicV1(final RESTBaseTopicV1<?, ?, ?> source) {
        super(source);
        this.source = source;
    }

    public boolean hasTag(final Integer tagID) {
        return hasTag(source, tagID);
    }

    public static boolean hasTag(final RESTBaseTopicV1<?, ?, ?> source, final Integer tagID) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getTags() != null && source.getTags().getItems() != null) {
            final List<RESTTagV1> tags = source.getTags().returnItems();
            for (final RESTTagV1 tag : tags) {
                if (tag.getId().equals(tagID)) return true;
            }
        }

        return false;
    }
}