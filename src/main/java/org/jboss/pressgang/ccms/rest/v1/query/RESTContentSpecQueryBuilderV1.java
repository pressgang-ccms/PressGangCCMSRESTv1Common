package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderWithPropertiesV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTContentSpecQueryBuilderV1 extends RESTBaseQueryBuilderWithPropertiesV1 {
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>() {
        private static final long serialVersionUID = -8638470044710698912L;

        {
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_PRODUCT_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_PRODUCT_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_VERSION_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_VERSION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_TITLE_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_TITLE_FILTER_VAR_DESC));
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

    public List<Integer> getContentSpecIds() {
        final String contentSpecIdsString = get(CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR);

        return getIntegerList(contentSpecIdsString);
    }

    public void setContentSpecIds(final List<Integer> contentSpecIds) {
        put(CommonFilterConstants.CONTENT_SPEC_IDS_FILTER_VAR, contentSpecIds);
    }

    public String getContentSpecTitle() {
        return get(CommonFilterConstants.CONTENT_SPEC_TITLE_FILTER_VAR);
    }

    public void setContentSpecTitle(final String contentSpecTitle) {
        put(CommonFilterConstants.CONTENT_SPEC_TITLE_FILTER_VAR, contentSpecTitle);
    }

    public String getContentSpecProduct() {
        return get(CommonFilterConstants.CONTENT_SPEC_PRODUCT_FILTER_VAR);
    }

    public void setContentSpecProduct(final String contentSpecProduct) {
        put(CommonFilterConstants.CONTENT_SPEC_PRODUCT_FILTER_VAR, contentSpecProduct);
    }

    public String getContentSpecVersion() {
        return get(CommonFilterConstants.CONTENT_SPEC_VERSION_FILTER_VAR);
    }

    public void setContentSpecVersion(final String contentSpecVersion) {
        put(CommonFilterConstants.CONTENT_SPEC_VERSION_FILTER_VAR, contentSpecVersion);
    }
}
