package org.jboss.pressgangccms.rest.v1.collections.base;

import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityV1;

public abstract class RESTBaseUpdateCollectionItemV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>, V extends RESTBaseUpdateCollectionItemV1<T, U, V>>
    extends RESTBaseCollectionItemV1<T, U, V>
{
    public static final Integer UPDATE_STATE = 3;

    private static final Integer MAX_UPDATE_STATE = 3;
    
    @Override
    protected boolean validState(final Integer state)
    {
        return !(state == null || state < MIN_STATE || state > MAX_UPDATE_STATE);
    }
    
    public boolean returnIsUpdateItem()
    {
        return getState() == UPDATE_STATE;
    }
}
