package org.thin.ugc.service.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thin.ugc.service.userservice.fromdb.FromDbUserGetter;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnClass({UserService.class})
@EnableConfigurationProperties(UserCenterProperties.class)
public class UserCenterAutoConfiguration
{
    private static final Logger logger = LoggerFactory.getLogger(UserCenterAutoConfiguration.class);

    private UserCenterProperties properties;

    public UserCenterAutoConfiguration(UserCenterProperties properties)
    {
        this.properties = properties;
    }

    @PostConstruct
    public void checkConfig()
    {
        logger.info("post userservice bean constructed");
    }

    @Bean
    public UserService getUserService()
    {
        String getter = this.properties.getGetter();
        if (getter.equals("db")) {
            return new FromDbUserGetter();
        }

        return null;
    }
}
