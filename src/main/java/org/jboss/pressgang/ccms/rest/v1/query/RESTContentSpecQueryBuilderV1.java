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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTContentSpecTypeV1;
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
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_SUBTITLE_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_SUBTITLE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_EDITION_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_EDITION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_PUBSNUMBER_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_PUBSNUMBER_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_BOOK_VERSION_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_BOOK_VERSION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_ABSTRACT_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_ABSTRACT_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_BRAND_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_BRAND_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_HOLDER_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_HOLDER_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_YEAR_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_YEAR_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_PUBLICAN_CFG_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_PUBLICAN_CFG_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CONTENT_SPEC_TYPE_FILTER_VAR,
                    CommonFilterConstants.CONTENT_SPEC_TYPE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.EDITED_IN_LAST_DAYS, CommonFilterConstants.EDITED_IN_LAST_DAYS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.NOT_EDITED_IN_LAST_DAYS,
                    CommonFilterConstants.NOT_EDITED_IN_LAST_DAYS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.EDITED_IN_LAST_MINUTES, CommonFilterConstants.EDITED_IN_LAST_MINUTES_DESC));
            add(new Pair<String, String>(CommonFilterConstants.NOT_EDITED_IN_LAST_MINUTES,
                    CommonFilterConstants.NOT_EDITED_IN_LAST_MINUTES_DESC));
        }
    };

    protected Map<Integer, Integer> tags = new HashMap<Integer, Integer>();

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

    public RESTContentSpecTypeV1 getContentSpecType() {
        final String type = get(CommonFilterConstants.CONTENT_SPEC_TYPE_FILTER_VAR);
        return type == null ? null : RESTContentSpecTypeV1.getContentSpecType(Integer.parseInt(type));
    }

    public void setContentSpecType(final RESTContentSpecTypeV1 contentSpecType) {
        put(CommonFilterConstants.CONTENT_SPEC_TYPE_FILTER_VAR, RESTContentSpecTypeV1.getContentSpecTypeId(contentSpecType));
    }

    public String getContentSpecTitle() {
        return get(CommonFilterConstants.CONTENT_SPEC_TITLE_FILTER_VAR);
    }

    public void setContentSpecTitle(final String contentSpecTitle) {
        put(CommonFilterConstants.CONTENT_SPEC_TITLE_FILTER_VAR, contentSpecTitle);
    }

    public String getContentSpecSubtitle() {
        return get(CommonFilterConstants.CONTENT_SPEC_SUBTITLE_FILTER_VAR);
    }

    public void setContentSpecSubtitle(final String contentSpecSubtitle) {
        put(CommonFilterConstants.CONTENT_SPEC_SUBTITLE_FILTER_VAR, contentSpecSubtitle);
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

    public String getContentSpecEdition() {
        return get(CommonFilterConstants.CONTENT_SPEC_EDITION_FILTER_VAR);
    }

    public void setContentSpecEdition(final String contentSpecEdition) {
        put(CommonFilterConstants.CONTENT_SPEC_EDITION_FILTER_VAR, contentSpecEdition);
    }

    public Integer getContentSpecPubsnumber() {
        final String pubsnumber = get(CommonFilterConstants.CONTENT_SPEC_PUBSNUMBER_FILTER_VAR);
        return pubsnumber == null ? null : Integer.parseInt(pubsnumber);
    }

    public void setContentSpecPubsnumber(final Integer contentSpecPubsnumber) {
        put(CommonFilterConstants.CONTENT_SPEC_PUBSNUMBER_FILTER_VAR, contentSpecPubsnumber);
    }

    public String getContentSpecBookVersion() {
        return get(CommonFilterConstants.CONTENT_SPEC_BOOK_VERSION_FILTER_VAR);
    }

    public void setContentSpecBookVersion(final String contentSpecBookVersion) {
        put(CommonFilterConstants.CONTENT_SPEC_BOOK_VERSION_FILTER_VAR, contentSpecBookVersion);
    }

    public String getContentSpecCopyrightHolder() {
        return get(CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_HOLDER_FILTER_VAR);
    }

    public void setContentSpecCopyrightHolder(final String contentSpecCopyrightHolder) {
        put(CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_HOLDER_FILTER_VAR, contentSpecCopyrightHolder);
    }

    public String getContentSpecCopyrightYear() {
        return get(CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_YEAR_FILTER_VAR);
    }

    public void setContentSpecCopyrightYear(final String contentSpecCopyrightYear) {
        put(CommonFilterConstants.CONTENT_SPEC_COPYRIGHT_YEAR_FILTER_VAR, contentSpecCopyrightYear);
    }

    public String getContentSpecPublicanCfg() {
        return get(CommonFilterConstants.CONTENT_SPEC_PUBLICAN_CFG_FILTER_VAR);
    }

    public void setContentSpecPublicanCfg(final String contentSpecPublicanCfg) {
        put(CommonFilterConstants.CONTENT_SPEC_PUBLICAN_CFG_FILTER_VAR, contentSpecPublicanCfg);
    }

    public Integer getEditedInLastDays() {
        final String editedInLastDays = get(CommonFilterConstants.EDITED_IN_LAST_DAYS);
        return editedInLastDays == null ? null : Integer.parseInt(editedInLastDays);
    }

    public void setEditedInLastDays(final Integer editedInLastDays) {
        put(CommonFilterConstants.EDITED_IN_LAST_DAYS, editedInLastDays);
    }

    public Integer getNotEditedInLastDays() {
        final String notEditedInLastDays = get(CommonFilterConstants.NOT_EDITED_IN_LAST_DAYS);
        return notEditedInLastDays == null ? null : Integer.parseInt(notEditedInLastDays);
    }

    public void setNotEditedInLastDays(final Integer notEditedInLastDays) {
        put(CommonFilterConstants.NOT_EDITED_IN_LAST_DAYS, notEditedInLastDays);
    }

    public Integer getEditedInLastMinutes() {
        final String editedInLastMinutes = get(CommonFilterConstants.EDITED_IN_LAST_MINUTES);
        return editedInLastMinutes == null ? null : Integer.parseInt(editedInLastMinutes);
    }

    public void setEditedInLastMinutes(final Integer editedInLastMinutes) {
        put(CommonFilterConstants.EDITED_IN_LAST_MINUTES, editedInLastMinutes);
    }

    public Integer getNotEditedInLastMinutes() {
        final String notEditedInLastMinutes = get(CommonFilterConstants.NOT_EDITED_IN_LAST_MINUTES);
        return notEditedInLastMinutes == null ? null : Integer.parseInt(notEditedInLastMinutes);
    }

    public void setNotEditedInLastMinutes(final Integer notEditedInLastMinutes) {
        put(CommonFilterConstants.NOT_EDITED_IN_LAST_MINUTES, notEditedInLastMinutes);
    }

    public void setTag(final Integer tagId, final Integer state) {
        if (tagId == null) return;

        if (tags == null) {
            tags = new HashMap<Integer, Integer>();
        }
        tags.put(tagId, state);
    }

    public void setTag(final RESTTagV1 tag, final Integer state) {
        if (tag == null) return;

        setTag(tag.getId(), state);
    }

    public void setTags(final Map<Integer, Integer> tags) {
        this.tags = tags;
    }

    protected Map<Integer, Integer> getTags() {
        return tags;
    }

    @Override
    public String getQuery() {
        final StringBuilder query = new StringBuilder(super.getQuery());

        final Map<Integer, Integer> tags = getTags();
        for (final Integer key : tags.keySet()) {
            final Integer value = tags.get(key);

            if (value != null) {
                query.append(CommonFilterConstants.MATCH_TAG + key + "=" + value + ";");
            }
        }

        return query.toString();
    }
}
