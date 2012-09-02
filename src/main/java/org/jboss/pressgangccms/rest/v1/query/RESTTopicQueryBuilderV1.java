package org.jboss.pressgangccms.rest.v1.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterCategoryV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterFieldV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterTagV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTProjectV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgangccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgangccms.utils.constants.CommonFilterConstants;
import org.jboss.pressgangccms.utils.structures.Pair;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

public class RESTTopicQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            /* Topic ID's */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_IDS_FILTER_VAR, CommonFilterConstants.TOPIC_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_IDS_NOT_FILTER_VAR, CommonFilterConstants.TOPIC_IDS_NOT_FILTER_VAR_DESC));

            /* Topic Related To */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_RELATED_TO, CommonFilterConstants.TOPIC_RELATED_TO_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_NOT_RELATED_TO, CommonFilterConstants.TOPIC_NOT_RELATED_TO_DESC));

            /* Topic Related From */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_RELATED_FROM, CommonFilterConstants.TOPIC_RELATED_FROM_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_NOT_RELATED_FROM, CommonFilterConstants.TOPIC_NOT_RELATED_FROM_DESC));

            /* Topic Title */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_TITLE_FILTER_VAR, CommonFilterConstants.TOPIC_TITLE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_TITLE_NOT_FILTER_VAR, CommonFilterConstants.TOPIC_TITLE_NOT_FILTER_VAR_DESC));

            /* Topic Description */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_DESCRIPTION_FILTER_VAR, CommonFilterConstants.TOPIC_DESCRIPTION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_DESCRIPTION_NOT_FILTER_VAR, CommonFilterConstants.TOPIC_DESCRIPTION_NOT_FILTER_VAR_DESC));

            /* Topic is included in content specification */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_IS_INCLUDED_IN_SPEC, CommonFilterConstants.TOPIC_IS_INCLUDED_IN_SPEC_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_IS_NOT_INCLUDED_IN_SPEC, CommonFilterConstants.TOPIC_IS_NOT_INCLUDED_IN_SPEC_DESC));

            /* Topic XML */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_XML_FILTER_VAR, CommonFilterConstants.TOPIC_XML_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_XML_FILTER_VAR, CommonFilterConstants.TOPIC_XML_FILTER_VAR_DESC));

            /* Topic Edited in last days */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_EDITED_IN_LAST_DAYS, CommonFilterConstants.TOPIC_EDITED_IN_LAST_DAYS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_NOT_EDITED_IN_LAST_DAYS, CommonFilterConstants.TOPIC_NOT_EDITED_IN_LAST_DAYS_DESC));

            /* Has XML Errors */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_XML_ERRORS, CommonFilterConstants.TOPIC_HAS_XML_ERRORS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_NOT_XML_ERRORS, CommonFilterConstants.TOPIC_HAS_NOT_XML_ERRORS_DESC));

            /* Has Relationships */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_RELATIONSHIPS, CommonFilterConstants.TOPIC_HAS_RELATIONSHIPS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_NOT_RELATIONSHIPS, CommonFilterConstants.TOPIC_HAS_NOT_RELATIONSHIPS_DESC));

            /* Has Incoming Relationships */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_INCOMING_RELATIONSHIPS, CommonFilterConstants.TOPIC_HAS_INCOMING_RELATIONSHIPS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_NOT_INCOMING_RELATIONSHIPS, CommonFilterConstants.TOPIC_HAS_NOT_INCOMING_RELATIONSHIPS_DESC));

            /* Has Open Bugzilla Bugs */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_OPEN_BUGZILLA_BUGS, CommonFilterConstants.TOPIC_HAS_OPEN_BUGZILLA_BUGS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_NOT_OPEN_BUGZILLA_BUGS, CommonFilterConstants.TOPIC_HAS_NOT_OPEN_BUGZILLA_BUGS_DESC));

            /* Has Bugzilla Bugs */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_BUGZILLA_BUGS, CommonFilterConstants.TOPIC_HAS_BUGZILLA_BUGS_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_HAS_NOT_BUGZILLA_BUGS, CommonFilterConstants.TOPIC_HAS_NOT_BUGZILLA_BUGS_DESC));

            add(new Pair<String, String>(CommonFilterConstants.TOPIC_TEXT_SEARCH_FILTER_VAR, CommonFilterConstants.TOPIC_TEXT_SEARCH_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_STARTDATE_FILTER_VAR, CommonFilterConstants.TOPIC_STARTDATE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_ENDDATE_FILTER_VAR, CommonFilterConstants.TOPIC_ENDDATE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.LOGIC_FILTER_VAR, CommonFilterConstants.LOGIC_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_STARTEDITDATE_FILTER_VAR, CommonFilterConstants.TOPIC_STARTEDITDATE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_ENDEDITDATE_FILTER_VAR, CommonFilterConstants.TOPIC_ENDEDITDATE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_PROPERTY_TAG, CommonFilterConstants.TOPIC_PROPERTY_TAG_DESC));
        }
        
    };
    
    protected Map<Integer, Integer> tags = new HashMap<Integer, Integer>();
    protected Map<Integer, String> propertyTags = new HashMap<Integer, String>();
    protected Map<Integer, Set<CategoryState>> categoryInternalStates = new HashMap<Integer, Set<CategoryState>>();
    protected Map<Integer, Set<CategoryState>> categoryExternalStates = new HashMap<Integer, Set<CategoryState>>();
    
    public static List<Pair<String, String>> getFilterInfo()
    {
        return filterPairs;
    }
    
    public static String getFilterDesc(final String varName)
    {
        if (varName == null) return null;
        
        final List<Pair<String, String>> filterInfo = getFilterInfo();
        for (final Pair<String, String> varInfo : filterInfo)
        {
            if (varInfo.getFirst().equals(varName))
            {
                return varInfo.getSecond();
            }
        }
        
        return null;
    }

    public List<Integer> getTopicIds()
    {
        final String topicIdsString = get(CommonFilterConstants.TOPIC_IDS_FILTER_VAR);
        
        return getIntegerList(topicIdsString);
    }

    public void setTopicIds(final List<Integer> topicIds)
    {
        put(CommonFilterConstants.TOPIC_IDS_FILTER_VAR, topicIds);
    }

    public List<Integer> getNotTopicIds()
    {
        final String topicIdsString = get(CommonFilterConstants.TOPIC_IDS_NOT_FILTER_VAR);
                
        return getIntegerList(topicIdsString);
    }

    public void setNotTopicIds(final List<Integer> notTopicIds)
    {
        put(CommonFilterConstants.TOPIC_IDS_NOT_FILTER_VAR, notTopicIds);
    }

    public Integer getTopicRelatedTo()
    {
        final String topicRelatedTo = get(CommonFilterConstants.TOPIC_RELATED_TO);
        return topicRelatedTo == null ? null : Integer.parseInt(topicRelatedTo);
    }

    public void setTopicRelatedTo(final Integer topicRelatedTo)
    {
        put(CommonFilterConstants.TOPIC_RELATED_TO, topicRelatedTo);
    }

    public Integer getNotTopicRelatedTo()
    {
        final String notTopicRelatedTo = get(CommonFilterConstants.TOPIC_NOT_RELATED_TO);
        return notTopicRelatedTo == null ? null : Integer.parseInt(notTopicRelatedTo);
    }

    public void setNotTopicRelatedTo(Integer notTopicRelatedTo)
    {
        put(CommonFilterConstants.TOPIC_NOT_RELATED_TO, notTopicRelatedTo);
    }

    public Integer getTopicRelatedFrom()
    {
        final String topicRelatedFrom = get(CommonFilterConstants.TOPIC_RELATED_FROM);
        return topicRelatedFrom == null ? null : Integer.parseInt(topicRelatedFrom);
    }

    public void setTopicRelatedFrom(final Integer topicRelatedFrom)
    {
        put(CommonFilterConstants.TOPIC_RELATED_FROM, topicRelatedFrom);
    }

    public Integer getNotTopicRelatedFrom()
    {
        final String notTopicRelatedFrom = get(CommonFilterConstants.TOPIC_NOT_RELATED_FROM);
        return notTopicRelatedFrom == null ? null : Integer.parseInt(notTopicRelatedFrom);
    }

    public void setNotTopicRelatedFrom(final Integer notTopicRelatedFrom)
    {
        put(CommonFilterConstants.TOPIC_NOT_RELATED_FROM, notTopicRelatedFrom);
    }

    public String getTopicTitle()
    {
        return get(CommonFilterConstants.TOPIC_TITLE_FILTER_VAR);
    }

    public void setTopicTitle(final String topicTitle)
    {
        put(CommonFilterConstants.TOPIC_TITLE_FILTER_VAR, topicTitle);
    }

    public String getNotTopicTitle()
    {
        return get(CommonFilterConstants.TOPIC_TITLE_NOT_FILTER_VAR);
    }

    public void setNotTopicTitle(String notTopicTitle)
    {
        put(CommonFilterConstants.TOPIC_TITLE_NOT_FILTER_VAR, notTopicTitle);
    }

    public String getTopicDescription()
    {
        return get(CommonFilterConstants.TOPIC_DESCRIPTION_FILTER_VAR);
    }

    public void setTopicDescription(final String topicDescription)
    {
        put(CommonFilterConstants.TOPIC_DESCRIPTION_FILTER_VAR, topicDescription);
    }

    public String getNotTopicDescription()
    {
        return get(CommonFilterConstants.TOPIC_DESCRIPTION_NOT_FILTER_VAR);
    }

    public void setNotTopicDescription(final String notTopicDescription)
    {
        put(CommonFilterConstants.TOPIC_DESCRIPTION_NOT_FILTER_VAR, notTopicDescription);
    }

    public DateTime getStartCreateDate()
    {
        final String startCreateDate = get(CommonFilterConstants.TOPIC_STARTDATE_FILTER_VAR);
        return startCreateDate == null ? null : new DateTime(ISODateTimeFormat.dateTime().parseDateTime(startCreateDate));
    }

    public void setStartCreateDate(final DateTime startCreateDate)
    {
        put(CommonFilterConstants.TOPIC_STARTDATE_FILTER_VAR, startCreateDate);
    }
    
    public void setStartCreateDate(final Date startCreateDate)
    {
        put(CommonFilterConstants.TOPIC_STARTDATE_FILTER_VAR, startCreateDate);
    }

    public DateTime getEndCreateDate()
    {
        final String startCreateDate = get(CommonFilterConstants.TOPIC_ENDDATE_FILTER_VAR);
        return startCreateDate == null ? null : new DateTime(ISODateTimeFormat.dateTime().parseDateTime(startCreateDate));
    }

    public void setEndCreateDate(final DateTime endCreateDate)
    {
        put(CommonFilterConstants.TOPIC_ENDDATE_FILTER_VAR, endCreateDate);
    }
    
    public void setEndCreateDate(final Date endCreateDate)
    {
        put(CommonFilterConstants.TOPIC_ENDDATE_FILTER_VAR, endCreateDate);
    }

    public String getTopicXML()
    {
        return get(CommonFilterConstants.TOPIC_XML_FILTER_VAR);
    }

    public void setTopicXML(final String topicXML)
    {
        put(CommonFilterConstants.TOPIC_XML_FILTER_VAR, topicXML);
    }

    public String getNotTopicXML()
    {
        return get(CommonFilterConstants.TOPIC_XML_NOT_FILTER_VAR);
    }

    public void setNotTopicXML(String notTopicXML)
    {
        put(CommonFilterConstants.TOPIC_XML_NOT_FILTER_VAR, notTopicXML);
    }

    public String getLogic()
    {
        return get(CommonFilterConstants.LOGIC_FILTER_VAR);
    }

    public void setLogic(final String logic)
    {
        put(CommonFilterConstants.LOGIC_FILTER_VAR, logic);
    }

    public Boolean getHasRelationships()
    {
        final String hasRelationships = get(CommonFilterConstants.TOPIC_HAS_RELATIONSHIPS);
        return hasRelationships == null ? null : Boolean.parseBoolean(hasRelationships);
    }

    public void setHasRelationships(final Boolean hasRelationships)
    {
        put(CommonFilterConstants.TOPIC_HAS_NOT_RELATIONSHIPS, hasRelationships);
    }

    public Boolean getHasIncomingRelationships()
    {
        final String hasIncomingRelationships = get(CommonFilterConstants.TOPIC_HAS_INCOMING_RELATIONSHIPS);
        return hasIncomingRelationships == null ? null : Boolean.parseBoolean(hasIncomingRelationships);
    }

    public void setHasIncomingRelationships(final Boolean hasIncomingRelationships)
    {
        put(CommonFilterConstants.TOPIC_HAS_INCOMING_RELATIONSHIPS, hasIncomingRelationships);
    }

    public String getTopicTextSearch()
    {
        return get(CommonFilterConstants.TOPIC_TEXT_SEARCH_FILTER_VAR);
    }

    public void setTopicTextSearch(final String topicTextSearch)
    {
        put(CommonFilterConstants.TOPIC_TEXT_SEARCH_FILTER_VAR, topicTextSearch);
    }

    public Boolean getHasXMLErrors()
    {
        final String hasXMLErrors = get(CommonFilterConstants.TOPIC_HAS_XML_ERRORS);
        return hasXMLErrors == null ? null : Boolean.parseBoolean(hasXMLErrors);
    }

    public void setHasXMLErrors(final Boolean hasXMLErrors)
    {
        put(CommonFilterConstants.TOPIC_HAS_XML_ERRORS, hasXMLErrors);
    }

    public DateTime getStartEditDate()
    {
        final String startEditDate = get(CommonFilterConstants.TOPIC_STARTEDITDATE_FILTER_VAR);
        return startEditDate == null ? null : new DateTime(ISODateTimeFormat.dateTime().parseDateTime(startEditDate));
    }

    public void setStartEditDate(final Date startEditDate)
    {
        put(CommonFilterConstants.TOPIC_STARTEDITDATE_FILTER_VAR, startEditDate);
    }
    
    public void setStartEditDate(final DateTime startEditDate)
    {
        put(CommonFilterConstants.TOPIC_STARTEDITDATE_FILTER_VAR, startEditDate);
    }

    public DateTime getEndEditDate()
    {
        final String endEditDate = get(CommonFilterConstants.TOPIC_ENDEDITDATE_FILTER_VAR);
        return endEditDate == null ? null : new DateTime(ISODateTimeFormat.dateTime().parseDateTime(endEditDate));
    }

    public void setEndEditDate(final Date endEditDate)
    {
        put(CommonFilterConstants.TOPIC_ENDEDITDATE_FILTER_VAR, endEditDate);
    }
    
    public void setEndEditDate(final DateTime endEditDate)
    {
        put(CommonFilterConstants.TOPIC_ENDEDITDATE_FILTER_VAR, endEditDate);
    }

    public Integer getEditedInLastDays()
    {
        final String editedInLastDays = get(CommonFilterConstants.TOPIC_EDITED_IN_LAST_DAYS);
        return editedInLastDays == null ? null : Integer.parseInt(editedInLastDays);
    }

    public void setEditedInLastDays(final Integer editedInLastDays)
    {
        put(CommonFilterConstants.TOPIC_EDITED_IN_LAST_DAYS, editedInLastDays);
    }

    public Integer getNotEditedInLastDays()
    {
        final String notEditedInLastDays = get(CommonFilterConstants.TOPIC_NOT_EDITED_IN_LAST_DAYS);
        return notEditedInLastDays == null ? null : Integer.parseInt(notEditedInLastDays);
    }

    public void setNotEditedInLastDays(final Integer notEditedInLastDays)
    {
        put(CommonFilterConstants.TOPIC_NOT_EDITED_IN_LAST_DAYS, notEditedInLastDays);
    }

    public Boolean getHasOpenBugzillaBugs()
    {
        final String hasOpenBugzillaBugs = get(CommonFilterConstants.TOPIC_HAS_OPEN_BUGZILLA_BUGS);
        return hasOpenBugzillaBugs == null ? null : Boolean.parseBoolean(hasOpenBugzillaBugs);
    }

    public void setHasOpenBugzillaBugs(final Boolean hasOpenBugzillaBugs)
    {
        put(CommonFilterConstants.TOPIC_HAS_OPEN_BUGZILLA_BUGS, hasOpenBugzillaBugs);
    }

    public Boolean getHasBugzillaBugs()
    {
        final String hasBugzillaBugs = get(CommonFilterConstants.TOPIC_HAS_BUGZILLA_BUGS);
        return hasBugzillaBugs == null ? null : Boolean.parseBoolean(hasBugzillaBugs);
    }

    public void setHasBugzillaBugs(final Boolean hasBugzillaBugs)
    {
        put(CommonFilterConstants.TOPIC_HAS_BUGZILLA_BUGS, hasBugzillaBugs);
    }

    protected Map<Integer, String> getPropertyTagIds()
    {
        return propertyTags;
    }

    public void setPropertyTagIds(final Map<Integer, String> propertyTagIds)
    {
        this.propertyTags = propertyTagIds;
    }
    
    public void setPropertyTag(final Integer propertyTagId, final String value)
    {
        if (propertyTags == null)
        {
            propertyTags = new HashMap<Integer, String>();
        }
        propertyTags.put(propertyTagId, value);
    }

    public List<Integer> getTopicIncludedInSpec()
    {
        final String topicIdsString = get(CommonFilterConstants.TOPIC_IS_INCLUDED_IN_SPEC);
        
        return getIntegerList(topicIdsString);
    }

    public void setTopicIncludedInSpec(final List<Integer> topicIncludedInSpec)
    {
        put(CommonFilterConstants.TOPIC_IS_NOT_INCLUDED_IN_SPEC, topicIncludedInSpec);
    }

    public List<Integer> getNotTopicIncludedInSpec()
    {
        final String topicIdsString = get(CommonFilterConstants.TOPIC_IS_NOT_INCLUDED_IN_SPEC);
        
        return getIntegerList(topicIdsString);
    }

    public void setNotTopicIncludedInSpec(final List<Integer> notTopicIncludedInSpec)
    {
        put(CommonFilterConstants.TOPIC_IS_NOT_INCLUDED_IN_SPEC, notTopicIncludedInSpec);
    }

    public Boolean getHasNotXMLErrors()
    {
        final String hasNotXMLErrors = get(CommonFilterConstants.TOPIC_XML_NOT_FILTER_VAR);
        return hasNotXMLErrors == null ? null : Boolean.parseBoolean(hasNotXMLErrors);
    }

    public void setHasNotXMLErrors(final Boolean hasNotXMLErrors)
    {
        put(CommonFilterConstants.TOPIC_HAS_NOT_XML_ERRORS, hasNotXMLErrors);
    }

    public Boolean getHasNotRelationships()
    {
        final String hasNotRelationships = get(CommonFilterConstants.TOPIC_HAS_NOT_RELATIONSHIPS);
        return hasNotRelationships == null ? null : Boolean.parseBoolean(hasNotRelationships);
    }

    public void setHasNotRelationships(Boolean hasNotRelationships)
    {
        put(CommonFilterConstants.TOPIC_HAS_NOT_RELATIONSHIPS, hasNotRelationships);
    }

    public Boolean getHasNotIncomingRelationships()
    {
        final String hasNotIncomingRelationships = get(CommonFilterConstants.TOPIC_HAS_NOT_INCOMING_RELATIONSHIPS);
        return hasNotIncomingRelationships == null ? null : Boolean.parseBoolean(hasNotIncomingRelationships);
    }

    public void setHasNotIncomingRelationships(final Boolean hasNotIncomingRelationships)
    {
        put(CommonFilterConstants.TOPIC_HAS_NOT_INCOMING_RELATIONSHIPS, hasNotIncomingRelationships);
    }

    public Boolean getHasNotOpenBugzillaBugs()
    {
        final String hasNotOpenBugzillaBugs = get(CommonFilterConstants.TOPIC_HAS_NOT_OPEN_BUGZILLA_BUGS);
        return hasNotOpenBugzillaBugs == null ? null : Boolean.parseBoolean(hasNotOpenBugzillaBugs);
    }

    public void setHasNotOpenBugzillaBugs(final Boolean hasNotOpenBugzillaBugs)
    {
        put(CommonFilterConstants.TOPIC_HAS_NOT_OPEN_BUGZILLA_BUGS, hasNotOpenBugzillaBugs);
    }

    public Boolean getHasNotBugzillaBugs()
    {
        final String hasNotBugzillaBugs = get(CommonFilterConstants.TOPIC_HAS_NOT_BUGZILLA_BUGS);
        return hasNotBugzillaBugs == null ? null : Boolean.parseBoolean(hasNotBugzillaBugs);
    }

    public void setHasNotBugzillaBugs(final Boolean hasNotBugzillaBugs)
    {
        put(CommonFilterConstants.TOPIC_HAS_NOT_BUGZILLA_BUGS, hasNotBugzillaBugs);
    }
    
    public void setTag(final Integer tagId, final Integer state)
    {
        if (tags == null)
        {
            tags = new HashMap<Integer, Integer>();
        }
        tags.put(tagId, state);
    }
    
    public void setTags(final Map<Integer, Integer> tags)
    {
        this.tags = tags;
    }
    
    protected Map<Integer, Integer> getTags()
    {
        return tags;
    }
    
    public void setCategoryInternalState(final Integer catId, final Integer projectId, final Integer state)
    {
        if (catId == null) return;
        
        if (!categoryInternalStates.containsKey(catId))
        {
            categoryInternalStates.put(catId, new HashSet<CategoryState>());
        }
        
        boolean found = false;
        final Set<CategoryState> catStates = categoryInternalStates.get(catId);
        final Set<CategoryState> tempCatStates = new HashSet<CategoryState>(catStates);
        for (final CategoryState catState : tempCatStates)
        {
            /* Common Project */
            if (catState.getProjectId() == null && projectId == null
                    /* Normal Project */
                    || projectId != null && catState.getProjectId() != null && catState.getProjectId().equals(projectId))
            {
                found = true;
                
                if (state == null)
                {
                    catStates.remove(catState);
                }
                else
                {
                    catState.setState(state);
                }
            }
        }
        
        if (!found && state != null)
        {
            catStates.add(new CategoryState(projectId, state));
        }
    }
    
    public void setCommonCategoryInternalState(final Integer catId, final Integer state)
    {
        setCategoryInternalState(catId, null, state);
    }
    
    public Integer getCategoryInternalState(final Integer catId, final Integer projectId)
    {
        if (catId == null) return null;
        
        final Set<CategoryState> catStates = categoryInternalStates.get(catId);
        
        if (catStates == null || catStates.isEmpty()) return null;
        
        for (final CategoryState catState : catStates)
        {
            /* Common Project */
            if (catState.getProjectId() == null && projectId == null
                    /* Normal Project */
                    || projectId != null && catState.getProjectId().equals(projectId))
            {
                return catState.getState();
            }
        }
        
        return null;
    }
    
    public Integer getCommonCategoryInternalState(final Integer catId)
    {
        return getCategoryInternalState(catId, null);
    }
    
    protected Map<Integer, Set<CategoryState>> getCategoryInternalStates()
    {
        return categoryInternalStates;
    }
    
    public void setCategoryExternalState(final Integer catId, final Integer projectId, final Integer state)
    {
        if (catId == null) return;
        
        if (!categoryExternalStates.containsKey(catId))
        {
            categoryExternalStates.put(catId, new HashSet<CategoryState>());
        }
        
        boolean found = false;
        final Set<CategoryState> catStates = categoryExternalStates.get(catId);
        final Set<CategoryState> tempCatStates = new HashSet<CategoryState>(catStates);
        for (final CategoryState catState : tempCatStates)
        {
            /* Common Project */
            if (catState.getProjectId() == null && projectId == null
                    /* Normal Project */
                    || projectId != null && catState.getProjectId() != null && catState.getProjectId().equals(projectId))
            {
                found = true;
                
                if (state == null)
                {
                    catStates.remove(catState);
                }
                else
                {
                    catState.setState(state);
                }
            }
        }
        
        if (!found && state != null)
        {
            catStates.add(new CategoryState(projectId, state));
        }
    }
    
    public void setCommonCategoryExternalState(final Integer catId, final Integer state)
    {
        setCategoryExternalState(catId, null, state);
    }
    
    public Integer getCategoryExternalState(final Integer catId, final Integer projectId)
    {
        if (catId == null) return null;
        
        final Set<CategoryState> catStates = categoryExternalStates.get(catId);
        
        if (catStates == null || catStates.isEmpty()) return null;
        
        for (final CategoryState catState : catStates)
        {
            /* Common Project */
            if (catState.getProjectId() == null && projectId == null
                    /* Normal Project */
                    || projectId != null && catState.getProjectId().equals(projectId))
            {
                return catState.getState();
            }
        }
        
        return null;
    }
    
    public Integer getCommonCategoryExternalState(final Integer catId)
    {
        return getCategoryExternalState(catId, null);
    }
    
    protected Map<Integer, Set<CategoryState>> getCategoryExternalStates()
    {
        return categoryExternalStates;
    }
    
    @Override
    public String getQuery()
    {
        final StringBuilder query = new StringBuilder(super.getQuery());
        
        final Map<Integer, Integer> tags = getTags();
        for (final Integer key : tags.keySet())
        {
            final Integer value = tags.get(key);
            
            if (value != null)
            {
                query.append(CommonFilterConstants.MATCH_TAG + key + "=" + value + ";");
            }
        }
        
        final Map<Integer, String> propTags = getPropertyTagIds();
        for (final Integer key : propTags.keySet())
        {
            final String value = propTags.get(key);
            
            if (value != null)
            {
                query.append(CommonFilterConstants.TOPIC_PROPERTY_TAG + key + "=" + value + ";");
            }
        }
        
        final Map<Integer, Set<CategoryState>> categoryInternalStates = getCategoryInternalStates();
        for (final Integer key : categoryInternalStates.keySet())
        {
            final Set<CategoryState> catStates = categoryInternalStates.get(key);
            
            if (catStates != null && !catStates.isEmpty())
            {
                for (final CategoryState catState : catStates)
                {
                    final Integer state = catState.getState();
                    final String stateString;
                    if (state == CommonFilterConstants.CATEGORY_INTERNAL_AND_STATE)
                    {
                        stateString = CommonFilterConstants.AND_LOGIC;
                    }
                    else if (state == CommonFilterConstants.CATEGORY_INTERNAL_OR_STATE)
                    {
                        stateString = CommonFilterConstants.OR_LOGIC;
                    }
                    /* Invalid state so don't add it to the query */
                    else
                    {
                        continue;
                    }
                    
                    if (catState.getProjectId() == null)
                    {
                        query.append(CommonFilterConstants.CATEORY_INTERNAL_LOGIC + key + "=" + stateString + ";");
                    }
                    else
                    {
                        query.append(CommonFilterConstants.CATEORY_INTERNAL_LOGIC + key + "-" + catState.getProjectId() + "=" + stateString + ";");
                    }
                }
            }
        }
        
        final Map<Integer, Set<CategoryState>> categoryExternalStates = getCategoryExternalStates();
        for (final Integer key : categoryExternalStates.keySet())
        {
            final Set<CategoryState> catStates = categoryExternalStates.get(key);
            
            if (catStates != null && !catStates.isEmpty())
            {
                for (final CategoryState catState : catStates)
                {
                    final Integer state = catState.getState();
                    final String stateString;
                    if (state == CommonFilterConstants.CATEGORY_EXTERNAL_AND_STATE)
                    {
                        stateString = CommonFilterConstants.AND_LOGIC;
                    }
                    else if (state == CommonFilterConstants.CATEGORY_EXTERNAL_OR_STATE)
                    {
                        stateString = CommonFilterConstants.OR_LOGIC;
                    }
                    /* Invalid state so don't add it to the query */
                    else
                    {
                        continue;
                    }
                    
                    if (catState.getProjectId() == null)
                    {
                        query.append(CommonFilterConstants.CATEORY_EXTERNAL_LOGIC + key + "=" + stateString + ";");
                    }
                    else
                    {
                        query.append(CommonFilterConstants.CATEORY_EXTERNAL_LOGIC + key + "-" + catState.getProjectId() + "=" + stateString + ";");
                    }
                }
            }
        }
        
        return query.toString();
    }
    
    public void syncWithFilter(final RESTFilterV1 filter)
    {
        if (filter == null) return;
        
        /* Sync filter tags */
        if (filter.getFilterTags_OTM() != null && filter.getFilterTags_OTM().getItems() != null)
        {
            for (final RESTFilterTagV1 filterTag : filter.getFilterTags_OTM().getItems())
            {
                final RESTTagV1 tag = filterTag.getTag();
                
                if (tag != null)
                {
                    setTag(tag.getId(), filterTag.getState());
                }
            }
        }
        
        /* Sync filter fields */
        if (filter.getFilterFields_OTM() != null && filter.getFilterFields_OTM().getItems() != null)
        {
            for (final RESTFilterFieldV1 filterField : filter.getFilterFields_OTM().getItems())
            {
                put(filterField.getName(), filterField.getValue());
            }
        }
        
        /* Sync Category Fields */
        if (filter.getFilterCategories_OTM() != null && filter.getFilterCategories_OTM().getItems() != null)
        {
            for (final RESTFilterCategoryV1 filterCategory : filter.getFilterCategories_OTM().getItems())
            {
                final RESTCategoryV1 cat = filterCategory.getCategory();
                final RESTProjectV1 project = filterCategory.getProject();
                
                /* Continue as we need at least the category */
                if (cat == null) continue;
                
                /* External Category */
                if (filterCategory.getState() > 1)
                {
                    setCategoryExternalState(cat.getId(), project == null ? null : project.getId(), filterCategory.getState());
                }
                /* Internal Category */
                else
                {
                    setCategoryInternalState(cat.getId(), project == null ? null : project.getId(), filterCategory.getState());
                }
            }
        }
    }
}

class CategoryState
{
    private final Integer projectId;
    private Integer state;
    
    public CategoryState(final Integer projectId)
    {
        this.projectId = projectId;
    }
    
    public CategoryState(final Integer projectId, final Integer state)
    {
        this.projectId = projectId;
        this.setState(state);
    }

    public Integer getProjectId()
    {
        return projectId;
    }

    public Integer getState()
    {
        return state;
    }

    public void setState(final Integer state)
    {
        this.state = state;
    }
}
