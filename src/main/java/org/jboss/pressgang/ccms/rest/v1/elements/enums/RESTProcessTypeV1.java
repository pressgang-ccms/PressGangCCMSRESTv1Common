package org.jboss.pressgang.ccms.rest.v1.elements.enums;

public enum RESTProcessTypeV1 {
    GENERIC("Generic"), TRANSLATION_SYNC("Translation Sync"), TRANSLATION_PUSH("Translation Push");

    private final String name;

    RESTProcessTypeV1(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
