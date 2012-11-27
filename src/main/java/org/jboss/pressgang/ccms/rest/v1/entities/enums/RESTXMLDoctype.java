package org.jboss.pressgang.ccms.rest.v1.entities.enums;

public enum RESTXMLDoctype {
    DOCBOOK_45, DOCBOOK_50;

    public static RESTXMLDoctype getXMLDoctype(final int id) {
        switch (id) {
            case 0:
                return DOCBOOK_45;
            case 1:
                return DOCBOOK_50;
            default:
                return null;
        }
    }

    public static Integer getXMLDoctypeId(final RESTXMLDoctype doctype) {
        if (doctype == null)
            return null;

        switch (doctype) {
            case DOCBOOK_45:
                return 0;
            case DOCBOOK_50:
                return 1;
            default:
                return null;
        }
    }
}
