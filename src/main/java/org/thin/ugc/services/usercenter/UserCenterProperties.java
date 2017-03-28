package org.thin.ugc.services.usercenter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = UserCenterProperties.USER_CENTER_PREFIX)
public class UserCenterProperties
{
    public static final String USER_CENTER_PREFIX = "usercenter";

    private String getter;

    private String dbGetterUrl;

    public String getGetter()
    {
        return getter;
    }

    public void setGetter(String getter)
    {
        this.getter = getter;
    }

    public String getDbGetterUrl()
    {
        return dbGetterUrl;
    }

    public void setDbGetterUrl(String dbGetterUrl)
    {
        this.dbGetterUrl = dbGetterUrl;
    }
}
