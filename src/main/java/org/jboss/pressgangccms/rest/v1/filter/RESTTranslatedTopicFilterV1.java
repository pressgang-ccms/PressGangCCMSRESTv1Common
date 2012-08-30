package org.jboss.pressgangccms.rest.v1.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.pressgangccms.utils.constants.CommonFilterConstants;
import org.jboss.pressgangccms.utils.structures.Pair;

public class RESTTranslatedTopicFilterV1 extends RESTTopicFilterV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -7460325877532975728L;
        
        {
            addAll(RESTTopicFilterV1.getFilterInfo());
            
            /* Zanata ID's */
            add(new Pair<String, String>(CommonFilterConstants.ZANATA_IDS_FILTER_VAR, CommonFilterConstants.ZANATA_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.ZANATA_IDS_NOT_FILTER_VAR, CommonFilterConstants.ZANATA_IDS_NOT_FILTER_VAR_DESC));
            
            /* Latest Translations */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_LATEST_TRANSLATIONS_FILTER_VAR, CommonFilterConstants.TOPIC_LATEST_TRANSLATIONS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_NOT_LATEST_TRANSLATIONS_FILTER_VAR, CommonFilterConstants.TOPIC_NOT_LATEST_TRANSLATIONS_FILTER_VAR_DESC));

            /* Latest Completed Translations */
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR, CommonFilterConstants.TOPIC_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TOPIC_NOT_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR, CommonFilterConstants.TOPIC_NOT_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR_DESC));
        }
    };
    
    protected Map<String, Integer> locales = new HashMap<String, Integer>();
    
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
    
    public Boolean getLatestTranslations()
    {
        final String latestTranslations = filterVars.get(CommonFilterConstants.TOPIC_LATEST_TRANSLATIONS_FILTER_VAR);
        return latestTranslations == null ? null : Boolean.parseBoolean(latestTranslations);
    }

    public void setLatestTranslations(final Boolean latestTranslations)
    {
        put(CommonFilterConstants.TOPIC_LATEST_TRANSLATIONS_FILTER_VAR, latestTranslations);
    }

    public Boolean getLatestCompletedTranslations()
    {
        final String latestCompletedTranslations = filterVars.get(CommonFilterConstants.TOPIC_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR);
        return latestCompletedTranslations == null ? null : Boolean.parseBoolean(latestCompletedTranslations);
    }

    public void setLatestCompletedTranslations(final Boolean latestCompletedTranslations)
    {
        put(CommonFilterConstants.TOPIC_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR, latestCompletedTranslations);
    }

    public List<Integer> getZanataIds()
    {
        final String topicIdsString = filterVars.get(CommonFilterConstants.ZANATA_IDS_FILTER_VAR);
        
        return getIntegerList(topicIdsString);
    }

    public void setZanataIds(List<Integer> zanataIds)
    {
        put(CommonFilterConstants.ZANATA_IDS_FILTER_VAR, zanataIds);
    }

    public List<Integer> getNotZanataIds()
    {
        final String topicIdsString = filterVars.get(CommonFilterConstants.ZANATA_IDS_NOT_FILTER_VAR);
        
        return getIntegerList(topicIdsString);
    }

    public void setNotZanataIds(final List<Integer> notZanataIds)
    {
        put(CommonFilterConstants.ZANATA_IDS_NOT_FILTER_VAR, notZanataIds);
    }

    public Boolean getNotLatestTranslations()
    {
        final String notLatestTranslations = filterVars.get(CommonFilterConstants.TOPIC_NOT_LATEST_TRANSLATIONS_FILTER_VAR);
        return notLatestTranslations == null ? null : Boolean.parseBoolean(notLatestTranslations);
    }

    public void setNotLatestTranslations(final Boolean notLatestTranslations)
    {
        put(CommonFilterConstants.TOPIC_NOT_LATEST_TRANSLATIONS_FILTER_VAR, notLatestTranslations);
    }

    public Boolean getNotLatestCompletedTranslations()
    {
        final String notLatestCompletedTranslations = filterVars.get(CommonFilterConstants.TOPIC_NOT_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR);
        return notLatestCompletedTranslations == null ? null : Boolean.parseBoolean(notLatestCompletedTranslations);
    }

    public void setNotLatestCompletedTranslations(final Boolean notLatestCompletedTranslations)
    {
        put(CommonFilterConstants.TOPIC_NOT_LATEST_COMPLETED_TRANSLATIONS_FILTER_VAR, notLatestCompletedTranslations);
    }
    
    public void setLocale(final String locale, final Integer state)
    {
        if (locales == null)
        {
            locales = new HashMap<String, Integer>();
        }
        locales.put(locale, state);
    }
    
    public void setLocales(final Map<String, Integer> locales)
    {
        this.locales = locales;
    }
    
    protected Map<String, Integer> getLocales()
    {
        return locales;
    }
    
    @Override
    public String getQuery()
    {
        final StringBuilder query = new StringBuilder(super.getQuery());
        
        final Map<String, Integer> locales = getLocales();
        int count = 1;
        for (final String key : locales.keySet())
        {
            final Integer value = locales.get(key);
            
            if (value != null)
            {
                query.append(CommonFilterConstants.MATCH_LOCALE + count + "=" + key + value+ ";");
                count++;
            }
        }
        
        return query.toString();
    }
    
}
