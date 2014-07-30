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

package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTPropertyCategoryQueryBuilderV1 extends RESTBaseQueryBuilderV1 {
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>() {
        private static final long serialVersionUID = -8638470044710698912L;

        {
            add(new Pair<String, String>(CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR,
                    CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR,
                    CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR,
                    CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR_DESC));
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

    public List<Integer> getPropertyCategoryIds() {
        final String propertyCategoryIdsString = get(CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR);

        return getIntegerList(propertyCategoryIdsString);
    }

    public void setPropertyCategoryIds(final List<Integer> propertyCategoryIds) {
        put(CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR, propertyCategoryIds);
    }

    public String getPropertyCategoryName() {
        return get(CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR);
    }

    public void setPropertyCategoryName(final String propertyCategoryName) {
        put(CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR, propertyCategoryName);
    }

    public String getPropertyCategoryDescription() {
        return get(CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR);
    }

    public void setPropertyCategoryDescription(final String propertyCategoryDescription) {
        put(CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR, propertyCategoryDescription);
    }
}