package org.jboss.pressgang.ccms.rest.v1.jaxrsinterfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBlobConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTFileCollectionV1;
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
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFileV1;
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

    /* FILE FUNCTIONS */
    /* JSON FUNCTIONS */
    @POST
    @Path("/file/update/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFileV1 updateJSONFile(@QueryParam("expand") final String expand,
            final RESTFileV1 dataObject);

    @POST
    @Path("/files/update/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFileCollectionV1 updateJSONFiles(@QueryParam("expand") final String expand,
            final RESTFileCollectionV1 dataObjects);

    @POST
    @Path("/file/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFileV1 createJSONFile(@QueryParam("expand") final String expand,
            final RESTFileV1 dataObject);

    @POST
    @Path("/files/create/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public RESTFileCollectionV1 createJSONFiles(@QueryParam("expand") final String expand,
            final RESTFileCollectionV1 dataObjects);

    @DELETE
    @Path("/file/delete/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTFileV1 deleteJSONFile(@PathParam("id") final Integer id,
            @QueryParam("expand") final String expand);

    @DELETE
    @Path("/files/delete/json/{ids}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    public RESTFileCollectionV1 deleteJSONFiles(@PathParam("ids") final PathSegment ids,
            @QueryParam("expand") final String expand);
}