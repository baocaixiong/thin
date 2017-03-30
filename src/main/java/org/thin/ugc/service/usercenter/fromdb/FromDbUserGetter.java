package org.thin.ugc.service.usercenter.fromdb;

import org.thin.ugc.service.usercenter.User;
import org.thin.ugc.service.usercenter.UserService;

public class FromDbUserGetter implements UserService
{
    @Override
    public User getByIdentity(String identity)
    {
        if (identity.equals("1")) {
            return new User("1", "张明");
        }

        return null;
    }
}
