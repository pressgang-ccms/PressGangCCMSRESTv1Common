package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;

public abstract class RESTBaseEntityWithPropertiesV1<T extends RESTBaseEntityWithPropertiesV1<T, U, V>, U extends RESTBaseCollectionV1<T,
        U, V>, V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBasePrimaryEntityV1<T, U, V> {
    public static String PROPERTIES_NAME = "properties";

    protected RESTAssignedPropertyTagCollectionV1 properties = null;

    public void cloneInto(final RESTBaseEntityWithPropertiesV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (this.properties != null) {
                clone.properties = new RESTAssignedPropertyTagCollectionV1();
                this.properties.cloneInto(clone.properties, deepCopy);
            } else {
                clone.properties = null;
            }
        } else {
            clone.properties = this.properties;
        }
    }

    public RESTAssignedPropertyTagCollectionV1 getProperties() {
        return properties;
    }

    public void setProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseEntityWithPropertiesV1)) return false;

        return super.equals(other);
    }
}
