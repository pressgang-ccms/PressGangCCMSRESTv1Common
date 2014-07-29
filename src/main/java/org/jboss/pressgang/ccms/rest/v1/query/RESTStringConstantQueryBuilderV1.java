/*
  Copyright 2011-2014 Red Hat

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

package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTStringConstantQueryBuilderV1 extends RESTBaseQueryBuilderV1 {
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>() {
        private static final long serialVersionUID = -8638470044710698912L;

        {
            add(new Pair<String, String>(CommonFilterConstants.STRING_CONSTANT_IDS_FILTER_VAR,
                    CommonFilterConstants.STRING_CONSTANT_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.STRING_CONSTANT_NAME_FILTER_VAR,
                    CommonFilterConstants.STRING_CONSTANT_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.STRING_CONSTANT_VALUE_FILTER_VAR,
                    CommonFilterConstants.STRING_CONSTANT_VALUE_FILTER_VAR_DESC));
        }
    };

    public static List<Pair<String, String>> getFilterInfo() {
        return filterPairs;
    }

    public static String getFilterDesc(final String varName) {
        if (varName == null) return null;

        final List<Pair<String, String>> filterInfo = getFilterInfo();
        for (final Pair<String, String> varInfo : filterInfo) {
            if (varInfo.getFirst().equals(varName)) {
                return varInfo.getSecond();
            }
        }

        return null;
    }

    public List<Integer> getStringConstantIds() {
        final String stringConstantIdsString = get(CommonFilterConstants.STRING_CONSTANT_IDS_FILTER_VAR);

        return getIntegerList(stringConstantIdsString);
    }

    public void setStringConstantIds(final List<Integer> stringConstantIds) {
        put(CommonFilterConstants.STRING_CONSTANT_IDS_FILTER_VAR, stringConstantIds);
    }

    public String getStringConstantName() {
        return get(CommonFilterConstants.STRING_CONSTANT_NAME_FILTER_VAR);
    }

    public void setStringConstantName(final String stringConstantName) {
        put(CommonFilterConstants.STRING_CONSTANT_NAME_FILTER_VAR, stringConstantName);
    }

    public String getStringConstantValue() {
        return get(CommonFilterConstants.STRING_CONSTANT_VALUE_FILTER_VAR);
    }

    public void setStringConstantValue(final String stringConstantValue) {
        put(CommonFilterConstants.STRING_CONSTANT_VALUE_FILTER_VAR, stringConstantValue);
    }
}
