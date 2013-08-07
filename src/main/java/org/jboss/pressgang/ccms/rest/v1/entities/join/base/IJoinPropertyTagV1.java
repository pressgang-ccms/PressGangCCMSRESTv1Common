package org.jboss.pressgang.ccms.rest.v1.entities.join.base;

public interface IJoinPropertyTagV1 extends IBaseJoinEntityV1 {
    String getValue();

    void setValue(final String value);

    boolean getValid();

    void setValid(final boolean valid);
}
