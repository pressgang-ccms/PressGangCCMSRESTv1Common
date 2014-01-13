package org.jboss.pressgang.ccms.rest.v1.elements.base;

public abstract class RESTBaseElementV1<T extends RESTBaseElementV1<T>> {
    /**
     * @param deepCopy true if referenced objects should be copied, false if the referenced themselves should be copied
     * @return A clone of this object
     */
    public abstract T clone(final boolean deepCopy);
}
