package org.jboss.pressgangccms.rest.v1.collections.base;

import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;

import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityV1;

/**
 * @author Matthew Casperson
 * 
 * @param <T>
 *            The REST entity type
 * @param <U>
 *            The REST Collection type
 */
abstract public class RESTBaseUpdateCollectionV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseUpdateCollectionV1<T, U, V>, V extends RESTBaseCollectionItemV1<T, U, V>>
        extends RESTBaseCollectionV1<T, U, V>
{
    public void addUpdateItem(final T item)
    {
        addItem(item, UPDATE_STATE);
    }
}
