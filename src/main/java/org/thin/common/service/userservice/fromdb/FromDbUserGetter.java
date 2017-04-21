package org.thin.common.service.userservice.fromdb;

import org.thin.common.service.userservice.User;
import org.thin.common.service.userservice.UserService;

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
