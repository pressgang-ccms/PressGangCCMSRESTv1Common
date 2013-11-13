package org.jboss.pressgang.ccms.rest.v1.entities.base;

import java.util.ArrayList;
import java.util.List;

public abstract class RESTBaseObjectWithConfiguredParametersV1<T extends RESTBaseObjectWithConfiguredParametersV1<T>> extends
        RESTBaseObjectV1<T> {
    /**
     * Maintains a list of the database fields that have been specifically set
     * on this object. This allows us to distinguish them from those that are
     * just null by default
     */
    private List<String> configuredParameters = null;

    /**
     * This is a convenience method that adds a value to the configuredParameters collection
     *
     * @param parameter The parameter to specify as configured
     */
    protected void setParameterToConfigured(final String parameter) {
        if (configuredParameters == null) configuredParameters = new ArrayList<String>();
        if (!configuredParameters.contains(parameter)) configuredParameters.add(parameter);
    }

    public boolean hasParameterSet(final String parameter) {
        return getConfiguredParameters() != null && getConfiguredParameters().contains(parameter);
    }

    public List<String> getConfiguredParameters() {
        return configuredParameters;
    }

    public void setConfiguredParameters(List<String> configuredParameters) {
        this.configuredParameters = configuredParameters;
    }

    /**
     * @return true if this entity's state would trigger a change in the database, and false otherwise
     */
    public boolean returnDirtyState() {
        return configuredParameters != null && !configuredParameters.isEmpty();
    }

    protected void cloneInto(final RESTBaseObjectWithConfiguredParametersV1 clone) {
        clone.setConfiguredParameters(getConfiguredParameters() == null ? null : new ArrayList<String>(getConfiguredParameters()));
    }
}
