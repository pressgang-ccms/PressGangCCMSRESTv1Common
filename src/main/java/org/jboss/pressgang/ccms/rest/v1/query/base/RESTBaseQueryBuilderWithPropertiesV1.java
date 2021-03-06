/*
  Copyright 2011-2014 Red Hat, Inc

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.query.base;

import java.util.HashMap;
import java.util.Map;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;

public abstract class RESTBaseQueryBuilderWithPropertiesV1 extends RESTBaseQueryBuilderV1 {
    protected Map<Integer, String> propertyTags = new HashMap<Integer, String>();

    protected Map<Integer, String> getPropertyTagIds() {
        return propertyTags;
    }

    public String getPropertyTag(final Integer propertyTagId) {
        return propertyTags.get(propertyTagId);
    }

    public void setPropertyTagIds(final Map<Integer, String> propertyTagIds) {
        propertyTags = propertyTagIds;
    }

    public void setPropertyTag(final Integer propertyTagId, final String value) {
        if (propertyTags == null) {
            propertyTags = new HashMap<Integer, String>();
        }
        propertyTags.put(propertyTagId, value);
    }

    public void setPropertyTag(final RESTPropertyTagV1 propertyTag, final String value) {
        if (propertyTag == null) return;

        setPropertyTag(propertyTag.getId(), value);
    }

    @Override
    protected void put(final String constant, final Object value) {
        if (constant.startsWith(CommonFilterConstants.PROPERTY_TAG)) {
            if (value instanceof String) {
                final String fieldValue = (String) value;
                try {
                    final String propTagId = fieldValue.replace(CommonFilterConstants.PROPERTY_TAG, "");
                    final Integer propTagIdInt = Integer.parseInt(propTagId);
                    setPropertyTag(propTagIdInt, fieldValue);
                } catch (final Exception ex) {
                    // Do Nothing
                }
            }
        } else {
            super.put(constant, value);
        }
    }

    @Override
    public String getQuery() {
        final StringBuilder query = new StringBuilder(super.getQuery());

        final Map<Integer, String> propTags = getPropertyTagIds();
        for (final Integer key : propTags.keySet()) {
            final String value = propTags.get(key);

            if (value != null) {
                query.append(CommonFilterConstants.PROPERTY_TAG + key + "=" + value + ";");
            }
        }

        return query.toString();
    }
}
