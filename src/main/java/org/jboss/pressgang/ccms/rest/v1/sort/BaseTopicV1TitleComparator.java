package org.jboss.pressgang.ccms.rest.v1.sort;

import java.io.Serializable;
import java.util.Comparator;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;

/**
 * A comparator that compares the titles between two topics. It can be used to sort a Collection into alphabetical
 * order.
 *
 * @param <T> The Topic Entity Class
 * @author mcasperson
 */
public class BaseTopicV1TitleComparator<T extends RESTBaseTopicV1<T, ?, ?>> implements Comparator<T>, Serializable {
    private static final long serialVersionUID = -1264915038297724875L;

    public int compare(final T o1, final T o2) {
        if (o1 == null && o2 == null) return 0;
        if (o1 == null) return -1;
        if (o2 == null) return 1;

        if (o1.getTitle() == null && o2.getTitle() == null) return 0;
        if (o1.getTitle() == null) return -1;
        if (o2.getTitle() == null) return 1;

        return o1.getTitle().compareTo(o2.getTitle());
    }
}