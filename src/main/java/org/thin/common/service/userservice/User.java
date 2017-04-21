package org.thin.common.service.userservice;

public class User
{
    /**
     * 用户的唯一标识符
     */
    private String identity;
    /**
     * 用户的名称
     */
    private String name;

    public User()
    {
        this.identity = "";
        this.name = "";
    }

    public User(String identity, String name)
    {
        this.identity = identity;
        this.name = name;
    }

    public String getIdentity()
    {
        return identity;
    }

    public void setIdentity(String identity)
    {
        this.identity = identity;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
