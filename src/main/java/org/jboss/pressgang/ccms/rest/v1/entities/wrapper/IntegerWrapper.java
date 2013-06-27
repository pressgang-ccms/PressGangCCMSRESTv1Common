package org.jboss.pressgang.ccms.rest.v1.entities.wrapper;

/**
 * Because Jackson can not return simple values - https://github.com/FasterXML/jackson-databind/issues/34
 */
public class IntegerWrapper {
    public Integer value;
}
