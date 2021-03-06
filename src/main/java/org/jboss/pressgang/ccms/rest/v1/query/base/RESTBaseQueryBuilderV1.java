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

import javax.ws.rs.core.PathSegment;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.utils.common.CollectionUtilities;
import org.jboss.resteasy.specimpl.PathSegmentImpl;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

public abstract class RESTBaseQueryBuilderV1 {
    private Map<String, String> filterVars = new HashMap<String, String>();

    protected Map<String, String> getFilterVars() {
        return Collections.unmodifiableMap(filterVars);
    }

    protected void setFilterVars(final Map<String, String> filterVars) {
        this.filterVars = filterVars;
    }

    protected String get(final String constant) {
        return filterVars.get(constant);
    }

    protected void put(final String constant, final Object value) {
        /* If the constant and value is null do nothing */
        if (value == null && constant == null) {
            return;
        }
        /* If the constant is set and value is null then remove the constant */
        else if (value == null) {
            filterVars.remove(constant);
        }
        
        /* Convert the value to a string */
        if (value instanceof String) {
            if (!((String) value).isEmpty()) {
                filterVars.put(constant, value.toString());
            }
        } else if (value instanceof DateTime) {
            filterVars.put(constant, ISODateTimeFormat.dateTime().print((DateTime) value));
        } else if (value instanceof Date) {
            filterVars.put(constant, ISODateTimeFormat.dateTime().print(new DateTime(value)));
        } else if (value instanceof Boolean) {
            if (((Boolean) value) == false) {
                filterVars.remove(constant);
            } else {
                filterVars.put(constant, value.toString());
            }
        } else {
            filterVars.put(constant, value.toString());
        }
    }

    protected <T> void put(final String constant, final Collection<T> list) {
        if (list == null || list.isEmpty()) {
            put(constant, (Object) null);
        } else {
            put(constant, CollectionUtilities.toSeperatedString(list, ","));
        }
    }

    public PathSegment buildQueryPath() {
        return buildQueryPath(false);
    }

    public PathSegment buildQueryPath(boolean decode) {
        return new PathSegmentImpl(getQuery(), decode);
    }

    public String getQuery() {
        final StringBuilder query = new StringBuilder("query;");

        final Map<String, String> filterVars = getFilterVars();
        for (final Entry<String, String> entry : filterVars.entrySet()) {
            if (entry.getValue() != null) {
                query.append(entry.getKey() + "=" + encodeSpecialChars(entry.getValue()) + ";");
            }
        }

        return query.toString();
    }

    private String encodeSpecialChars(final String input) {
        return input.replace("/", "%2F").replace(";", "%3B").replace("=", "%3D").replace("?", "%3F").replace("#", "%23");
    }

    public String getQuery(final boolean encode) {
        if (encode) {
            final String unencodedQuery = getQuery();

            String query = "query;";

            if (unencodedQuery != null && !unencodedQuery.isEmpty()) {
                try {
                    query = URLEncoder.encode(unencodedQuery, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    // THis shouldn't ever happen
                }
            }

            return query;
        } else {
            return getQuery();
        }
    }

    protected List<Integer> getIntegerList(final String list) {
        if (list == null) return null;

        final List<Integer> idsList = new ArrayList<Integer>();
        final String[] ids = list.split("\\s*,\\s*");
        for (final String id : ids) {
            idsList.add(Integer.parseInt(id));
        }

        return idsList;
    }

    protected List<String> getStringList(final String list) {
        if (list == null) return null;

        final List<String> idsList = new ArrayList<String>();
        final String[] ids = list.split("\\s*,\\s*");
        for (final String id : ids) {
            idsList.add(id);
        }

        return idsList;
    }

    public String getQueryLogic() {
        return get(CommonFilterConstants.LOGIC_FILTER_VAR);
    }

    public void setQueryLogic(final String logic) {
        put(CommonFilterConstants.LOGIC_FILTER_VAR, logic);
    }
}
