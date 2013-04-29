package org.jboss.pressgang.ccms.rest.v1.jaxrsinterfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBlobConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTImageCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTIntegerConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTRoleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTStringConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTUserCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTBlobConstantV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTImageV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTIntegerConstantV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTRoleV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTStringConstantV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslatedTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTUserV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTContentSpecV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedContentSpecV1;

@Path("/1")
public interface RESTInterfaceV1 extends RESTBaseInterfaceV1 {

    /* USERS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/user/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPUser(@QueryParam("expand") final String expand, @QueryParam("data") final RESTUserV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/users/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPUsers(@QueryParam("expand") final String expand, @QueryParam("data") final RESTUserCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/user/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPUser(@QueryParam("expand") final String expand, @QueryParam("data") final RESTUserV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/users/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPUsers(@QueryParam("expand") final String expand, @QueryParam("data") final RESTUserCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/user/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPUser(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/users/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPUsers(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/user/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTUserV1 updateJSONUser(@QueryParam("expand") final String expand,
            final RESTUserV1 dataObject);

    @POST
    @Path("/users/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTUserCollectionV1 updateJSONUsers(@QueryParam("expand") final String expand,
            final RESTUserCollectionV1 dataObjects);

    @POST
    @Path("/user/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTUserV1 createJSONUser(@QueryParam("expand") final String expand,
            final RESTUserV1 dataObject);

    @POST
    @Path("/users/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTUserCollectionV1 createJSONUsers(@QueryParam("expand") final String expand,
            final RESTUserCollectionV1 dataObjects);

    @DELETE
    @Path("/user/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTUserV1 deleteJSONUser(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/users/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTUserCollectionV1 deleteJSONUsers(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* STRINGCONSTANT FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/stringconstant/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPStringConstant(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTStringConstantV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/stringconstants/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPStringConstants(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTStringConstantCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/stringconstant/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPStringConstant(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTStringConstantV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/stringconstants/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPStringConstants(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTStringConstantCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/stringconstant/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPStringConstant(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/stringconstants/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPStringConstants(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/stringconstant/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTStringConstantV1 updateJSONStringConstant(@QueryParam("expand") final String expand,
            final RESTStringConstantV1 dataObject);

    @POST
    @Path("/stringconstants/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTStringConstantCollectionV1 updateJSONStringConstants(@QueryParam("expand") final String expand,
            final RESTStringConstantCollectionV1 dataObjects);

    @POST
    @Path("/stringconstant/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTStringConstantV1 createJSONStringConstant(@QueryParam("expand") final String expand,
            final RESTStringConstantV1 dataObject);

    @POST
    @Path("/stringconstants/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTStringConstantCollectionV1 createJSONStringConstants(@QueryParam("expand") final String expand,
            final RESTStringConstantCollectionV1 dataObjects);

    @DELETE
    @Path("/stringconstant/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTStringConstantV1 deleteJSONStringConstant(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/stringconstants/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTStringConstantCollectionV1 deleteJSONStringConstants(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* TRANSLATEDTOPIC FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/translatedtopic/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTranslatedTopic(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedTopicV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedtopics/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTranslatedTopics(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedTopicCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedtopic/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTranslatedTopic(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedTopicV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedtopics/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTranslatedTopics(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedTopicCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedtopic/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTranslatedTopic(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedtopics/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTranslatedTopics(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/translatedtopic/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTranslatedTopicV1 updateJSONTranslatedTopic(@QueryParam("expand") final String expand,
            final RESTTranslatedTopicV1 dataObject);

    @POST
    @Path("/translatedtopics/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTranslatedTopicCollectionV1 updateJSONTranslatedTopics(@QueryParam("expand") final String expand,
            final RESTTranslatedTopicCollectionV1 dataObjects);

    @POST
    @Path("/translatedtopic/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTranslatedTopicV1 createJSONTranslatedTopic(@QueryParam("expand") final String expand,
            final RESTTranslatedTopicV1 dataObject);

    @POST
    @Path("/translatedtopics/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTranslatedTopicCollectionV1 createJSONTranslatedTopics(@QueryParam("expand") final String expand,
            final RESTTranslatedTopicCollectionV1 dataObjects);

    @DELETE
    @Path("/translatedtopic/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTranslatedTopicV1 deleteJSONTranslatedTopic(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/translatedtopics/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTranslatedTopicCollectionV1 deleteJSONTranslatedTopics(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* ROLE FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/role/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPRole(@QueryParam("expand") final String expand, @QueryParam("data") final RESTRoleV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/roles/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPRoles(@QueryParam("expand") final String expand, @QueryParam("data") final RESTRoleCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/role/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPRole(@QueryParam("expand") final String expand, @QueryParam("data") final RESTRoleV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/roles/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPRoles(@QueryParam("expand") final String expand, @QueryParam("data") final RESTRoleCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/role/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPRole(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/roles/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPRoles(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/role/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTRoleV1 updateJSONRole(@QueryParam("expand") final String expand,
            final RESTRoleV1 dataObject);

    @POST
    @Path("/roles/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTRoleCollectionV1 updateJSONRoles(@QueryParam("expand") final String expand,
            final RESTRoleCollectionV1 dataObjects);

    @POST
    @Path("/role/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTRoleV1 createJSONRole(@QueryParam("expand") final String expand,
            final RESTRoleV1 dataObject);

    @POST
    @Path("/roles/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTRoleCollectionV1 createJSONRoles(@QueryParam("expand") final String expand,
            final RESTRoleCollectionV1 dataObjects);

    @DELETE
    @Path("/role/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTRoleV1 deleteJSONRole(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/roles/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTRoleCollectionV1 deleteJSONRoles(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* PROPERYTAG FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/propertytag/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPPropertyTag(@QueryParam("expand") final String expand, @QueryParam("data") final RESTPropertyTagV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertytags/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPPropertyTags(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTPropertyTagCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertytag/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPPropertyTag(@QueryParam("expand") final String expand, @QueryParam("data") final RESTPropertyTagV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertytags/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPPropertyTags(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTPropertyTagCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertytag/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPPropertyTag(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertytags/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPPropertyTags(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/propertytag/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTPropertyTagV1 updateJSONPropertyTag(@QueryParam("expand") final String expand,
            final RESTPropertyTagV1 dataObject);

    @POST
    @Path("/propertytags/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTPropertyTagCollectionV1 updateJSONPropertyTags(@QueryParam("expand") final String expand,
            final RESTPropertyTagCollectionV1 dataObjects);

    @POST
    @Path("/propertytag/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTPropertyTagV1 createJSONPropertyTag(@QueryParam("expand") final String expand,
            final RESTPropertyTagV1 dataObject);

    @POST
    @Path("/propertytags/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTPropertyTagCollectionV1 createJSONPropertyTags(@QueryParam("expand") final String expand,
            final RESTPropertyTagCollectionV1 dataObjects);

    @DELETE
    @Path("/propertytag/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTPropertyTagV1 deleteJSONPropertyTag(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/propertytags/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTPropertyTagCollectionV1 deleteJSONPropertyTags(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* PROPERTYCATEGORY FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/propertycategory/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPPropertyCategory(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTPropertyCategoryV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertycategories/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPPropertyCategories(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTPropertyCategoryCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertycategory/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPPropertyCategory(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTPropertyCategoryV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertycategories/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPPropertyCategories(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTPropertyCategoryCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertycategory/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPPropertyCategory(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/propertycategories/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPPropertyCategories(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/propertycategory/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTPropertyCategoryV1 updateJSONPropertyCategory(@QueryParam("expand") final String expand,
            final RESTPropertyCategoryV1 dataObject);

    @POST
    @Path("/propertycategories/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTPropertyCategoryCollectionV1 updateJSONPropertyCategories(@QueryParam("expand") final String expand,
            final RESTPropertyCategoryCollectionV1 dataObjects);

    @POST
    @Path("/propertycategory/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTPropertyCategoryV1 createJSONPropertyCategory(@QueryParam("expand") final String expand,
            final RESTPropertyCategoryV1 dataObject);

    @POST
    @Path("/propertycategories/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTPropertyCategoryCollectionV1 createJSONPropertyCategories(@QueryParam("expand") final String expand,
            final RESTPropertyCategoryCollectionV1 dataObjects);

    @DELETE
    @Path("/propertycategory/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTPropertyCategoryV1 deleteJSONPropertyCategory(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/propertycategories/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTPropertyCategoryCollectionV1 deleteJSONPropertyCategories(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* BLOBCONSTANTS FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/blobconstant/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPBlobConstant(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTBlobConstantV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/blobconstants/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPBlobConstants(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTBlobConstantCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/blobconstant/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPBlobConstant(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTBlobConstantV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/blobconstants/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPBlobConstants(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTBlobConstantCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/blobconstant/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPBlobConstant(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/blobconstants/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPBlobConstants(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/blobconstant/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTBlobConstantV1 updateJSONBlobConstant(@QueryParam("expand") final String expand,
            final RESTBlobConstantV1 dataObject);

    @POST
    @Path("/blobconstants/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTBlobConstantCollectionV1 updateJSONBlobConstants(@QueryParam("expand") final String expand,
            final RESTBlobConstantCollectionV1 dataObjects);

    @POST
    @Path("/blobconstant/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTBlobConstantV1 createJSONBlobConstant(@QueryParam("expand") final String expand,
            final RESTBlobConstantV1 dataObject);

    @POST
    @Path("/blobconstants/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTBlobConstantCollectionV1 createJSONBlobConstants(@QueryParam("expand") final String expand,
            final RESTBlobConstantCollectionV1 dataObjects);

    @DELETE
    @Path("/blobconstant/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTBlobConstantV1 deleteJSONBlobConstant(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/blobconstants/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTBlobConstantCollectionV1 deleteJSONBlobConstants(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* PROJECT FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/project/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPProject(@QueryParam("expand") final String expand, @QueryParam("data") final RESTProjectV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/projects/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPProjects(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTProjectCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/project/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPProject(@QueryParam("expand") final String expand, @QueryParam("data") final RESTProjectV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/projects/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPProjects(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTProjectCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/project/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPProject(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/projects/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPProjects(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/project/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTProjectV1 updateJSONProject(@QueryParam("expand") final String expand,
            final RESTProjectV1 dataObject);

    @POST
    @Path("/projects/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTProjectCollectionV1 updateJSONProjects(@QueryParam("expand") final String expand,
            final RESTProjectCollectionV1 dataObjects);

    @POST
    @Path("/project/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTProjectV1 createJSONProject(@QueryParam("expand") final String expand,
            final RESTProjectV1 dataObject);

    @POST
    @Path("/projects/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTProjectCollectionV1 createJSONProjects(@QueryParam("expand") final String expand,
            final RESTProjectCollectionV1 dataObjects);

    @DELETE
    @Path("/project/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTProjectV1 deleteJSONProject(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/projects/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTProjectCollectionV1 deleteJSONProjects(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* TAG FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/tag/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTag(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTagV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/tags/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTags(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTagCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/tag/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTag(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTagV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/tags/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTags(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTagCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/tag/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTag(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/tags/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTags(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/tag/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTagV1 updateJSONTag(@QueryParam("expand") final String expand,
            final RESTTagV1 dataObject);

    @POST
    @Path("/tags/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTagCollectionV1 updateJSONTags(@QueryParam("expand") final String expand,
            final RESTTagCollectionV1 dataObjects);

    @POST
    @Path("/tag/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTagV1 createJSONTag(@QueryParam("expand") final String expand,
            final RESTTagV1 dataObject);

    @POST
    @Path("/tags/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTagCollectionV1 createJSONTags(@QueryParam("expand") final String expand,
            final RESTTagCollectionV1 dataObjects);

    @DELETE
    @Path("/tag/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTagV1 deleteJSONTag(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/tags/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTagCollectionV1 deleteJSONTags(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* CATEGORY FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/category/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPCategory(@QueryParam("expand") final String expand, @QueryParam("data") final RESTCategoryV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/categories/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPCategories(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTCategoryCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/category/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPCategory(@QueryParam("expand") final String expand, @QueryParam("data") final RESTCategoryV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/categories/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPCategories(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTCategoryCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/category/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPCategory(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/categories/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPCategories(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/category/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTCategoryV1 updateJSONCategory(@QueryParam("expand") final String expand,
            final RESTCategoryV1 dataObject);

    @POST
    @Path("/categories/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTCategoryCollectionV1 updateJSONCategories(@QueryParam("expand") final String expand,
            final RESTCategoryCollectionV1 dataObjects);

    @POST
    @Path("/category/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTCategoryV1 createJSONCategory(@QueryParam("expand") final String expand,
            final RESTCategoryV1 dataObject);

    @POST
    @Path("/categories/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTCategoryCollectionV1 createJSONCategories(@QueryParam("expand") final String expand,
            final RESTCategoryCollectionV1 dataObjects);

    @DELETE
    @Path("/category/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTCategoryV1 deleteJSONCategory(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/categories/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTCategoryCollectionV1 deleteJSONCategories(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* IMAGE FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/image/update/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String updateJSONPImage(@QueryParam("expand") final String expand, @QueryParam("data") final RESTImageV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/images/update/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String updateJSONPImages(@QueryParam("expand") final String expand, @QueryParam("data") final RESTImageCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/image/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPImage(@QueryParam("expand") final String expand, @QueryParam("data") final RESTImageV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/images/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPImages(@QueryParam("expand") final String expand, @QueryParam("data") final RESTImageCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/image/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPImage(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/images/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPImages(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/image/update/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTImageV1 updateJSONImage(@QueryParam("expand") final String expand,
            final RESTImageV1 dataObject);

    @POST
    @Path("/images/update/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTImageCollectionV1 updateJSONImages(@QueryParam("expand") final String expand,
            final RESTImageCollectionV1 dataObjects);

    @POST
    @Path("/image/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTImageV1 createJSONImage(@QueryParam("expand") final String expand,
            final RESTImageV1 dataObject);

    @POST
    @Path("/images/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTImageCollectionV1 createJSONImages(@QueryParam("expand") final String expand,
            final RESTImageCollectionV1 dataObjects);

    @DELETE
    @Path("/image/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTImageV1 deleteJSONImage(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/images/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTImageCollectionV1 deleteJSONImages(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* TOPIC FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/topic/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTopic(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTopicV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/topics/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTopics(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTopicCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/topic/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTopic(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTopicV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/topics/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTopics(@QueryParam("expand") final String expand, @QueryParam("data") final RESTTopicCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/topic/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTopic(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/topics/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTopics(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/topic/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTopicV1 updateJSONTopic(@QueryParam("expand") final String expand,
            final RESTTopicV1 dataObject);

    @POST
    @Path("/topics/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTopicCollectionV1 updateJSONTopics(@QueryParam("expand") final String expand,
            final RESTTopicCollectionV1 dataObjects);

    @POST
    @Path("/topic/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTopicV1 createJSONTopic(@QueryParam("expand") final String expand,
            final RESTTopicV1 dataObject);

    @POST
    @Path("/topics/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTopicCollectionV1 createJSONTopics(@QueryParam("expand") final String expand,
            final RESTTopicCollectionV1 dataObjects);

    @DELETE
    @Path("/topic/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTopicV1 deleteJSONTopic(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/topics/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTopicCollectionV1 deleteJSONTopics(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* FILTERS FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/filter/update/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String updateJSONPFilter(@QueryParam("expand") final String expand, @QueryParam("data") final RESTFilterV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/filters/update/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String updateJSONPFilters(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTFilterCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/filter/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPFilter(@QueryParam("expand") final String expand, @QueryParam("data") final RESTFilterV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/filters/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPFilters(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTFilterCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/filter/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPFilter(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/filters/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPFilters(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/filter/update/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFilterV1 updateJSONFilter(@QueryParam("expand") final String expand,
            final RESTFilterV1 dataObject);

    @POST
    @Path("/filters/update/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFilterCollectionV1 updateJSONFilters(@QueryParam("expand") final String expand,
            final RESTFilterCollectionV1 dataObjects);

    @POST
    @Path("/filter/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFilterV1 createJSONFilter(@QueryParam("expand") final String expand,
            final RESTFilterV1 dataObject);

    @POST
    @Path("/filters/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFilterCollectionV1 createJSONFilters(@QueryParam("expand") final String expand,
            final RESTFilterCollectionV1 dataObjects);

    @DELETE
    @Path("/filter/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTFilterV1 deleteJSONFilter(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/filters/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTFilterCollectionV1 deleteJSONFilters(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* INTEGERCONSTANT FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/integerconstant/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPIntegerConstant(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTIntegerConstantV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/integerconstants/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPIntegerConstants(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTIntegerConstantCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/integerconstant/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPIntegerConstant(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTIntegerConstantV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/integerconstants/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPIntegerConstants(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTIntegerConstantCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/integerconstant/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPIntegerConstant(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/integerconstants/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPIntegerConstants(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/integerconstant/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTIntegerConstantV1 updateJSONIntegerConstant(@QueryParam("expand") final String expand,
            final RESTIntegerConstantV1 dataObject);

    @POST
    @Path("/integerconstants/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTIntegerConstantCollectionV1 updateJSONIntegerConstants(@QueryParam("expand") final String expand,
            final RESTIntegerConstantCollectionV1 dataObjects);

    @POST
    @Path("/integerconstant/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTIntegerConstantV1 createJSONIntegerConstant(@QueryParam("expand") final String expand,
            final RESTIntegerConstantV1 dataObject);

    @POST
    @Path("/integerconstants/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTIntegerConstantCollectionV1 createJSONIntegerConstants(@QueryParam("expand") final String expand,
            final RESTIntegerConstantCollectionV1 dataObjects);

    @DELETE
    @Path("/integerconstant/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTIntegerConstantV1 deleteJSONIntegerConstant(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/integerconstants/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTIntegerConstantCollectionV1 deleteJSONIntegerConstants(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* CONTENT SPEC FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/contentspec/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPContentSpec(@QueryParam("expand") final String expand, @QueryParam("data") final RESTContentSpecV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/contentspecs/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPContentSpecs(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTContentSpecCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/contentspec/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPContentSpec(@QueryParam("expand") final String expand, @QueryParam("data") final RESTContentSpecV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/contentspecs/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPContentSpecs(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTContentSpecCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/contentspec/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPContentSpec(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/contentspecs/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPContentSpecs(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/contentspec/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTContentSpecV1 updateJSONContentSpec(@QueryParam("expand") final String expand,
            final RESTContentSpecV1 dataObject);

    @POST
    @Path("/contentspecs/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTContentSpecCollectionV1 updateJSONContentSpecs(@QueryParam("expand") final String expand,
            final RESTContentSpecCollectionV1 dataObjects);

    @POST
    @Path("/contentspec/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTContentSpecV1 createJSONContentSpec(@QueryParam("expand") final String expand,
            final RESTContentSpecV1 dataObject);

    @POST
    @Path("/contentspecs/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTContentSpecCollectionV1 createJSONContentSpecs(@QueryParam("expand") final String expand,
            final RESTContentSpecCollectionV1 dataObjects);

    @DELETE
    @Path("/contentspec/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTContentSpecV1 deleteJSONContentSpec(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/contentspecs/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTContentSpecCollectionV1 deleteJSONContentSpecs(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* CONTENT SPEC NODE FUNCTIONS */
    /* JSONP FUNCTIONS */
//    @GET
//    @Path("/contentspecnode/update/jsonp")
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces(MediaType.APPLICATION_JSON)
//    public String updateJSONPContentSpecNode(@QueryParam("expand") final String expand, @QueryParam("data") final RESTCSNodeV1 dataObject,
//            @QueryParam("callback") final String callback);
//
//    @GET
//    @Path("/contentspecnodes/update/jsonp")
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces(MediaType.APPLICATION_JSON)
//    public String updateJSONPContentSpecNodes(@QueryParam("expand") final String expand,
//            @QueryParam("data") final RESTCSNodeCollectionV1 dataObjects,
//            @QueryParam("callback") final String callback);
//
//    @GET
//    @Path("/contentspecnode/create/jsonp")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes({MediaType.APPLICATION_JSON})
//    public String createJSONPContentSpecNode(@QueryParam("expand") final String expand, @QueryParam("data") final RESTCSNodeV1 dataObject,
//            @QueryParam("callback") final String callback);
//
//    @GET
//    @Path("/contentspecnodes/create/jsonp")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes({MediaType.APPLICATION_JSON})
//    public String createJSONPContentSpecNodes(@QueryParam("expand") final String expand,
//            @QueryParam("data") final RESTCSNodeCollectionV1 dataObjects,
//            @QueryParam("callback") final String callback);
//
//    @GET
//    @Path("/contentspecnode/delete/jsonp/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
//    public String deleteJSONPContentSpecNode(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
//            @QueryParam("callback") final String callback);
//
//    @GET
//    @Path("/contentspecnodes/delete/jsonp/{ids}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
//    public String deleteJSONPContentSpecNodes(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
//            @QueryParam("callback") final String callback);
//
//    /* JSON FUNCTIONS */
//    @POST
//    @Path("/contentspecnode/update/json")
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces(MediaType.APPLICATION_JSON)
//    public RESTCSNodeV1 updateJSONContentSpecNode(@QueryParam("expand") final String expand,
//            final RESTCSNodeV1 dataObject);
//
//    @POST
//    @Path("/contentspecnodes/update/json")
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces(MediaType.APPLICATION_JSON)
//    public RESTCSNodeCollectionV1 updateJSONContentSpecNodes(@QueryParam("expand") final String expand,
//            final RESTCSNodeCollectionV1 dataObjects);
//
//    @POST
//    @Path("/contentspecnode/create/json")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes({MediaType.APPLICATION_JSON})
//    public RESTCSNodeV1 createJSONContentSpecNode(@QueryParam("expand") final String expand,
//            final RESTCSNodeV1 dataObject);
//
//    @POST
//    @Path("/contentspecnodes/create/json")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes({MediaType.APPLICATION_JSON})
//    public RESTCSNodeCollectionV1 createJSONContentSpecNodes(@QueryParam("expand") final String expand,
//            final RESTCSNodeCollectionV1 dataObjects);
//
//    @DELETE
//    @Path("/contentspecnode/delete/json/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
//    public RESTCSNodeV1 deleteJSONContentSpecNode(@PathParam("id") final Integer id,
//            @QueryParam("expand") final String expand);
//
//    @DELETE
//    @Path("/contentspecnodes/delete/json/{ids}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
//    public RESTCSNodeCollectionV1 deleteJSONContentSpecNodes(@PathParam("ids") final PathSegment ids,
//            @QueryParam("expand") final String expand);

    /* CONTENT SPEC TRANSLATED NODE FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/translatedcontentspec/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTranslatedContentSpec(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedContentSpecV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecs/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTranslatedContentSpecs(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedContentSpecCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspec/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTranslatedContentSpec(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedContentSpecV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecs/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTranslatedContentSpecs(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedContentSpecCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspec/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTranslatedContentSpec(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecs/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTranslatedContentSpecs(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/translatedcontentspec/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTranslatedContentSpecV1 updateJSONTranslatedContentSpec(@QueryParam("expand") final String expand,
            final RESTTranslatedContentSpecV1 dataObject);

    @POST
    @Path("/translatedcontentspecs/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTranslatedContentSpecCollectionV1 updateJSONTranslatedContentSpecs(@QueryParam("expand") final String expand,
            final RESTTranslatedContentSpecCollectionV1 dataObjects);

    @POST
    @Path("/translatedcontentspec/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTranslatedContentSpecV1 createJSONTranslatedContentSpec(@QueryParam("expand") final String expand,
            final RESTTranslatedContentSpecV1 dataObject);

    @POST
    @Path("/translatedcontentspecs/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTranslatedContentSpecCollectionV1 createJSONTranslatedContentSpecs(@QueryParam("expand") final String expand,
            final RESTTranslatedContentSpecCollectionV1 dataObjects);

    @DELETE
    @Path("/translatedcontentspec/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTranslatedContentSpecV1 deleteJSONTranslatedContentSpec(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/translatedcontentspecs/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTranslatedContentSpecCollectionV1 deleteJSONTranslatedContentSpecs(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);

    /* CONTENT SPEC TRANSLATED NODE FUNCTIONS */
    /* JSONP FUNCTIONS */
    @GET
    @Path("/translatedcontentspecnode/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTranslatedContentSpecNode(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedCSNodeV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecnodes/update/jsonp")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String updateJSONPTranslatedContentSpecNodes(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedCSNodeCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecnode/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTranslatedContentSpecNode(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedCSNodeV1 dataObject,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecnodes/create/jsonp")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public String createJSONPTranslatedContentSpecNodes(@QueryParam("expand") final String expand,
            @QueryParam("data") final RESTTranslatedCSNodeCollectionV1 dataObjects,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecnode/delete/jsonp/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTranslatedContentSpecNode(@PathParam("id") final Integer id, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    @GET
    @Path("/translatedcontentspecnodes/delete/jsonp/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public String deleteJSONPTranslatedContentSpecNodes(@PathParam("ids") final PathSegment ids, @QueryParam("expand") final String expand,
            @QueryParam("callback") final String callback);

    /* JSON FUNCTIONS */
    @POST
    @Path("/translatedcontentspecnode/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTranslatedCSNodeV1 updateJSONTranslatedContentSpecNode(@QueryParam("expand") final String expand,
            final RESTTranslatedCSNodeV1 dataObject);

    @POST
    @Path("/translatedcontentspecnodes/update/json")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public RESTTranslatedCSNodeCollectionV1 updateJSONTranslatedContentSpecNodes(@QueryParam("expand") final String expand,
            final RESTTranslatedCSNodeCollectionV1 dataObjects);

    @POST
    @Path("/translatedcontentspecnode/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTranslatedCSNodeV1 createJSONTranslatedContentSpecNode(@QueryParam("expand") final String expand,
            final RESTTranslatedCSNodeV1 dataObject);

    @POST
    @Path("/translatedcontentspecnodes/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTTranslatedCSNodeCollectionV1 createJSONTranslatedContentSpecNodes(@QueryParam("expand") final String expand,
            final RESTTranslatedCSNodeCollectionV1 dataObjects);

    @DELETE
    @Path("/translatedcontentspecnode/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTranslatedCSNodeV1 deleteJSONTranslatedContentSpecNode(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/translatedcontentspecnodes/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTTranslatedCSNodeCollectionV1 deleteJSONTranslatedContentSpecNodes(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);
}
