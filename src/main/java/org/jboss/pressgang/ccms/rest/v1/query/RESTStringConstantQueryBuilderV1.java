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
