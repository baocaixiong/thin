package org.thin.ugc.domain;

import org.thin.common.service.userservice.User;

public class ContentWithUser
{
    private long id;
    private String userIdentity;
    private String text;
    private boolean withImage;
    private User user;
}
