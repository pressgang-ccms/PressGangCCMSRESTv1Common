package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTProjectQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.PROJECT_IDS_FILTER_VAR_DESC, CommonFilterConstants.PROJECT_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROJECT_NAME_FILTER_VAR, CommonFilterConstants.PROJECT_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROJECT_DESCRIPTION_FILTER_VAR, CommonFilterConstants.PROJECT_DESCRIPTION_FILTER_VAR_DESC));
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
    
    public String getProjectName()
    {
        return get(CommonFilterConstants.PROJECT_NAME_FILTER_VAR);
    }
    
    public void setProjectName(final String projectName)
    {
        put(CommonFilterConstants.PROJECT_NAME_FILTER_VAR, projectName);
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
