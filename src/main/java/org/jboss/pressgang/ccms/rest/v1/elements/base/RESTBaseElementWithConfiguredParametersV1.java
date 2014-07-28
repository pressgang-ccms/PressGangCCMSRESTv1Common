/*
  Copyright 2011-2014 Red Hat

  This file is part of PresGang CCMS.

  PresGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PresGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PresGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.elements.base;

import java.util.ArrayList;
import java.util.List;

public abstract class RESTBaseElementWithConfiguredParametersV1<T extends RESTBaseElementWithConfiguredParametersV1<T>> extends RESTBaseElementV1<T> {
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

    protected void cloneInto(final RESTBaseElementWithConfiguredParametersV1 clone) {
        clone.setConfiguredParameters(getConfiguredParameters() == null ? null : new ArrayList<String>(getConfiguredParameters()));
    }
}
