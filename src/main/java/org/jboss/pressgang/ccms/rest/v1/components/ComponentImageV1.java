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

package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTImageV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageImageV1;

import static com.google.common.base.Preconditions.checkArgument;

public class ComponentImageV1 {
    private final RESTImageV1 source;

    public ComponentImageV1(final RESTImageV1 source) {
        checkArgument(source != null, "The source parameter can not be null");
        this.source = source;
    }

    public static String getXMLTemplate(final RESTImageV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        final String retValue = "<figure>\n" +
                "\t<title>Title</title>\n" +
                "\t<mediaobject>\n" +
                "\t\t<imageobject>\n" +
                "\t\t\t<imagedata fileref=\"images/" + getDocbookFileName(source) + "\"/>\n" +
                "\t\t</imageobject>\n" +
                "\t\t<textobject>\n" +
                "\t\t\t<phrase>Description</phrase>\n" +
                "\t\t</textobject>\n" +
                "\t</mediaobject>\n" +
                "</figure>";

        return retValue;
    }

    public static String getInlineXMLTemplate(final RESTImageV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        final String retValue = "<inlinemediaobject>\n" +
                "\t<imageobject>\n" +
                "\t\t<imagedata fileref=\"images/" + getDocbookFileName(source) + "\"/>\n" +
                "\t</imageobject>\n" +
                "</inlinemediaobject>";

        return retValue;
    }

    public static String getBareXMLTemplate(final RESTImageV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        final String retValue = "<mediaobject>\n" +
                "\t<imageobject>\n" +
                "\t\t<imagedata fileref=\"images/" + getDocbookFileName(source) + "\"/>\n" +
                "\t</imageobject>\n" +
                "</mediaobject>";

        return retValue;
    }

    public String getXMLTemplate() {
        return getXMLTemplate(source);
    }

    /**
     * The docbook file name for an image is the ID of the image and the
     * extension of the first language image. This does imply that you can not
     * mix and match image formats within a single image.
     *
     * @param source The RESTImageV1 object to get the docbook filename for
     * @return The docbook file name
     */
    public static String getDocbookFileName(final RESTImageV1 source) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getLanguageImages_OTM() != null && source.getLanguageImages_OTM().getItems() != null) {
            final List<RESTLanguageImageV1> langImages = source.getLanguageImages_OTM().returnItems();
            for (final RESTLanguageImageV1 langImage : langImages) {
                final String filename = langImage.getFilename();
                if (filename != null) {
                    final int indexOfExtension = filename.lastIndexOf('.');

                    if (indexOfExtension != -1 && indexOfExtension < filename.length() - 1) {
                        final String extension = filename.substring(indexOfExtension, filename.length());
                        return source.getId() + extension;
                    }
                }
            }
        }

        return "";
    }

    public String getDocbookFileName() {
        return getDocbookFileName(source);
    }
}
