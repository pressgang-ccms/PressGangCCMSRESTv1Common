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

package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderWithPropertiesV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTTagQueryBuilderV1 extends RESTBaseQueryBuilderWithPropertiesV1 {
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>() {
        private static final long serialVersionUID = -8638470044710698912L;

        {
            add(new Pair<String, String>(CommonFilterConstants.TAG_IDS_FILTER_VAR, CommonFilterConstants.TAG_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TAG_NAME_FILTER_VAR, CommonFilterConstants.TAG_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR,
                    CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR_DESC));
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

    public List<Integer> getTagIds() {
        final String tagIdsString = get(CommonFilterConstants.TAG_IDS_FILTER_VAR);

        return getIntegerList(tagIdsString);
    }

    public void setTagIds(final List<Integer> tagIds) {
        put(CommonFilterConstants.TAG_IDS_FILTER_VAR, tagIds);
    }

    public String getTagName() {
        return get(CommonFilterConstants.TAG_NAME_FILTER_VAR);
    }

    public void setTagName(final String tagName) {
        put(CommonFilterConstants.TAG_NAME_FILTER_VAR, tagName);
    }

    public String getTagDescription() {
        return get(CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR);
    }

    public void setTagDescription(final String tagDescription) {
        put(CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR, tagDescription);
    }
}
