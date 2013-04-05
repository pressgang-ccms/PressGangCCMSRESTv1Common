package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedContentSpecV1;
import org.jboss.pressgang.ccms.zanata.ZanataDetails;

public class ComponentTranslatedContentSpecV1 {
    final RESTTranslatedContentSpecV1 source;

    public ComponentTranslatedContentSpecV1(final RESTTranslatedContentSpecV1 source) {
        this.source = source;
    }

    public String returnZanataId() {
        return returnZanataId(source);
    }

    public static String returnZanataId(final RESTTranslatedContentSpecV1 source) {
        return "CS" + source.getContentSpecId() + "-" + source.getContentSpecRevision();
    }

    public String returnEditorURL(final ZanataDetails zanataDetails, final String locale) {
        return returnEditorURL(source, zanataDetails, locale);
    }

    public static String returnEditorURL(final RESTTranslatedContentSpecV1 source, final ZanataDetails zanataDetails,
            final String locale) {
        final String zanataServerUrl = zanataDetails == null ? null : zanataDetails.getServer();
        final String zanataProject = zanataDetails == null ? null : zanataDetails.getProject();
        final String zanataVersion = zanataDetails == null ? null : zanataDetails.getVersion();

        if (zanataServerUrl != null && !zanataServerUrl.isEmpty() && zanataProject != null && !zanataProject.isEmpty() && zanataVersion
                != null && !zanataVersion.isEmpty()) {
            final String zanataId = returnZanataId(source);
            return zanataServerUrl + "webtrans/Application.html?project=" + zanataProject + "&amp;iteration=" + zanataVersion +
                    "&amp;doc=" + zanataId + "&amp;localeId=" + locale + "#view:doc;doc:" + zanataId;
        } else {
            return null;
        }
    }
}
