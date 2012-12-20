package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTUserQueryBuilderV1 extends RESTBaseQueryBuilderV1 {
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>() {
        private static final long serialVersionUID = -8638470055710698912L;

        {
            add(new Pair<String, String>(CommonFilterConstants.USER_IDS_FILTER_VAR, CommonFilterConstants.USER_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.USER_NAME_FILTER_VAR, CommonFilterConstants.USER_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.USER_DESCRIPTION_FILTER_VAR,
                    CommonFilterConstants.USER_DESCRIPTION_FILTER_VAR_DESC));
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

    public List<Integer> getUserIds() {
        final String userIdsString = get(CommonFilterConstants.USER_IDS_FILTER_VAR);

        return getIntegerList(userIdsString);
    }

    public void setUserIds(final List<Integer> userIds) {
        put(CommonFilterConstants.USER_IDS_FILTER_VAR, userIds);
    }

    public String getUserName() {
        return get(CommonFilterConstants.USER_NAME_FILTER_VAR);
    }

    public void setUserName(final String userName) {
        put(CommonFilterConstants.USER_NAME_FILTER_VAR, userName);
    }

    public String getUserDescription() {
        return get(CommonFilterConstants.USER_DESCRIPTION_FILTER_VAR);
    }

    public void setUserDescription(final String userDescription) {
        put(CommonFilterConstants.USER_DESCRIPTION_FILTER_VAR, userDescription);
    }
}
