package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryInTagV1;
import org.jboss.pressgang.ccms.rest.v1.sort.TagV1NameComparator;
import org.jboss.pressgang.ccms.utils.common.ExceptionUtilities;
import org.jboss.pressgang.ccms.utils.common.XMLUtilities;
import org.jboss.pressgang.ccms.utils.structures.NameIDSortMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * This component contains methods that can be applied against the topic entity. It excludes any
 * methods that are not GWT compatible (unlike the ComponentTopicV1 class, which includes a bunch
 * of XML processing).
 *
 * @author Matthew Casperson
 */
public abstract class GWTComponentTopicV1 extends ComponentBaseRESTEntityWithPropertiesV1 {
    final RESTBaseTopicV1<?, ?, ?> source;

    public GWTComponentTopicV1(final RESTBaseTopicV1<?, ?, ?> source) {
        super(source);
        this.source = source;
    }

    public boolean hasTag(final Integer tagID) {
        return hasTag(source, tagID);
    }

    public static boolean hasTag(final RESTBaseTopicV1<?, ?, ?> source, final Integer tagID) {
        if (source.getTags() != null && source.getTags().getItems() != null) {
            final List<RESTTagV1> tags = source.getTags().returnItems();
            for (final RESTTagV1 tag : tags) {
                if (tag.getId().equals(tagID)) return true;
            }
        }

        return false;
    }
}