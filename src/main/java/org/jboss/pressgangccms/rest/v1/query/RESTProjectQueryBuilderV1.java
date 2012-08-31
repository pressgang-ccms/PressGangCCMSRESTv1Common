package org.jboss.pressgangccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgangccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgangccms.utils.constants.CommonFilterConstants;
import org.jboss.pressgangccms.utils.structures.Pair;

public class RESTProjectQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.PROJECT_IDS_FILTER_VAR_DESC, CommonFilterConstants.PROJECT_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROJECT_TITLE_FILTER_VAR, CommonFilterConstants.PROJECT_TITLE_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROJECT_DESCRIPTION_FILTER_VAR, CommonFilterConstants.PROEJCT_DESCRIPTION_FILTER_VAR_DESC));
        }
    };

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
    
    public List<Integer> getProjectIds()
    {
        final String projectIdsString = get(CommonFilterConstants.PROJECT_IDS_FILTER_VAR);
        
        return getIntegerList(projectIdsString);
    }
    
    public void setProjectIds(final List<Integer> projectIds)
    {   
        put(CommonFilterConstants.PROJECT_IDS_FILTER_VAR, projectIds);
    }
    
    public String getProjectTitle()
    {
        return get(CommonFilterConstants.PROJECT_TITLE_FILTER_VAR);
    }
    
    public void setProjectTitle(final String projectTitle)
    {
        put(CommonFilterConstants.PROJECT_TITLE_FILTER_VAR, projectTitle);
    }
    
    public String getProjectDescription()
    {
        return get(CommonFilterConstants.PROJECT_DESCRIPTION_FILTER_VAR);
    }
    
    public void setProjectDescription(final String projectDescription)
    {
        put(CommonFilterConstants.PROJECT_DESCRIPTION_FILTER_VAR, projectDescription);
    }
}
