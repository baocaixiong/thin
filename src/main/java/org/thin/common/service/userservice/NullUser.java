package org.thin.common.service.userservice;

/**
 * @author zhangming12
 */
public class NullUser implements UserService
{
    NullUser()
    {

    }

    @Override
    public User getByIdentity(String identity)
    {
        return null;
    }
}
