package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

import static com.google.common.base.Preconditions.checkArgument;

@SuppressWarnings({"rawtypes", "unused"})
public class ComponentRESTBaseEntityV1 {
    private final RESTBaseEntityV1 source;

    public ComponentRESTBaseEntityV1(final RESTBaseEntityV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public static boolean returnDirtyState(final List<? extends RESTBaseEntityV1> list) {
        checkArgument(list != null, "The list parameter can not be null");

        for (final RESTBaseEntityV1 entity : list) {
            if (entity.returnDirtyState()) return true;
        }

        return false;
    }

    public static boolean returnDirtyStateForCollectionItems(final List<? extends RESTBaseCollectionItemV1> list) {
        checkArgument(list != null, "The list parameter can not be null");

        for (final RESTBaseCollectionItemV1 entity : list) {
            if (entity.getItem().returnDirtyState()) return true;
        }

        return false;
    }
}
