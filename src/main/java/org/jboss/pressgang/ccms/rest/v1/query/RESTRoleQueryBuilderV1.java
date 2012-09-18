package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgangccms.utils.structures.Pair;

public class RESTRoleQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.ROLE_IDS_FILTER_VAR, CommonFilterConstants.ROLE_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.ROLE_NAME_FILTER_VAR, CommonFilterConstants.ROLE_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.ROLE_DESCRIPTION_FILTER_VAR, CommonFilterConstants.ROLE_DESCRIPTION_FILTER_VAR_DESC));
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
    
    public List<Integer> getRoleIds()
    {
        final String roleIdsString = get(CommonFilterConstants.ROLE_IDS_FILTER_VAR);
        
        return getIntegerList(roleIdsString);
    }
    
    public void setRoleIds(final List<Integer> roleIds)
    {   
        put(CommonFilterConstants.ROLE_IDS_FILTER_VAR, roleIds);
    }
    
    public String getRoleName()
    {
        return get(CommonFilterConstants.ROLE_NAME_FILTER_VAR);
    }
    
    public void setRoleName(final String roleName)
    {
        put(CommonFilterConstants.ROLE_NAME_FILTER_VAR, roleName);
    }
    
    public String getRoleDescription()
    {
        return get(CommonFilterConstants.ROLE_DESCRIPTION_FILTER_VAR);
    }
    
    public void setRoleDescription(final String roleDescription)
    {
        put(CommonFilterConstants.ROLE_DESCRIPTION_FILTER_VAR, roleDescription);
    }
}
