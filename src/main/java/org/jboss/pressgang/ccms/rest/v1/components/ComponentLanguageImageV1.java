package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageImageV1;

public class ComponentLanguageImageV1 {
    private static final String SVG_MIME_TYPE = "image/svg+xml";
    private static final String JPG_MIME_TYPE = "image/jpeg";
    private static final String GIF_MIME_TYPE = "image/gif";
    private static final String PNG_MIME_TYPE = "image/png";

    private RESTLanguageImageV1 source;

    public ComponentLanguageImageV1(final RESTLanguageImageV1 source) {
        this.source = source;
    }

    public String getMimeType() {
        return getMimeType(source);
    }

    public static String getMimeType(final RESTLanguageImageV1 source) {
        final String extension = getExtension(source);
        if (extension != null) {
            if (extension.equalsIgnoreCase("JPG")) return JPG_MIME_TYPE;
            if (extension.equalsIgnoreCase("GIF")) return GIF_MIME_TYPE;
            if (extension.equalsIgnoreCase("PNG")) return PNG_MIME_TYPE;
            if (extension.equalsIgnoreCase("SVG")) return SVG_MIME_TYPE;
        }

        return "application/octet-stream";
    }

    public String getExtension() {
        return getExtension(source);
    }

    public static String getExtension(final RESTLanguageImageV1 source) {
        final int lastPeriodIndex = source.getFilename().lastIndexOf(".");
        if (lastPeriodIndex != -1 && lastPeriodIndex < source.getFilename().length() - 1) {
            return source.getFilename().substring(lastPeriodIndex + 1);
        }

        return null;
    }
}
