package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTFileQueryBuilderV1 extends RESTBaseQueryBuilderV1 {
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>() {
        private static final long serialVersionUID = -8638470044710698912L;

        {
            add(new Pair<String, String>(CommonFilterConstants.FILE_IDS_FILTER_VAR, CommonFilterConstants.FILE_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.FILE_DESCRIPTION_FILTER_VAR,
                    CommonFilterConstants.FILE_DESCRIPTION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.FILE_NAME_FILTER_VAR,
                    CommonFilterConstants.FILE_NAME_FILTER_VAR_DESC));
        }
    };

    protected Map<String, Integer> locales = new HashMap<String, Integer>();

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

    public List<Integer> getFileIds() {
        final String imageIdsString = get(CommonFilterConstants.FILE_IDS_FILTER_VAR);

        return getIntegerList(imageIdsString);
    }

    public void setFileIds(final List<Integer> imageIds) {
        put(CommonFilterConstants.FILE_IDS_FILTER_VAR, imageIds);
    }

    public String getFileOriginalFilename() {
        return get(CommonFilterConstants.FILE_NAME_FILTER_VAR);
    }

    public void setFileOriginalFilename(final String originalFilename) {
        put(CommonFilterConstants.FILE_NAME_FILTER_VAR, originalFilename);
    }

    public String getFileDescription() {
        return get(CommonFilterConstants.FILE_DESCRIPTION_FILTER_VAR);
    }

    public void setFileDescription(final String imageDescription) {
        put(CommonFilterConstants.FILE_DESCRIPTION_FILTER_VAR, imageDescription);
    }

    public void setLocale(final String locale, final Integer state) {
        if (locales == null) {
            locales = new HashMap<String, Integer>();
        }
        locales.put(locale, state);
    }

    public void setLocales(final Map<String, Integer> locales) {
        this.locales = locales;
    }

    protected Map<String, Integer> getLocales() {
        return locales;
    }

    @Override
    public String getQuery() {
        final StringBuilder query = new StringBuilder(super.getQuery());

        final Map<String, Integer> locales = getLocales();
        int count = 1;
        for (final String key : locales.keySet()) {
            final Integer value = locales.get(key);

            if (value != null) {
                query.append(CommonFilterConstants.MATCH_LOCALE + count + "=" + key + value + ";");
                count++;
            }
        }

        return query.toString();
    }
}
