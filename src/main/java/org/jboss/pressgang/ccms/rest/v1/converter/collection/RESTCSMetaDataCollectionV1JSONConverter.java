package org.jboss.pressgang.ccms.rest.v1.converter.collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSMetaDataCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTCSMetaDataCollectionV1JSONConverter extends RESTBaseV1JSONConverter<RESTCSMetaDataCollectionV1> implements StringConverter<RESTCSMetaDataCollectionV1>
{
    public RESTCSMetaDataCollectionV1JSONConverter()
    {
        super(RESTCSMetaDataCollectionV1.class);
    }
}