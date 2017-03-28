package org.thin.ugc.services.usercenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

@Configuration
@ConditionalOnClass({UserGetter.class})
@ConditionalOnBean(DataSource.class)
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
    public void checkConfig() throws URISyntaxException
    {
        String getter = this.properties.getGetter();
        if (getter.equals("db")) {
            URI uri = new URI(properties.getDbGetterUrl());
        }
    }

    @Bean
    public UserGetter userGetter()
    {
        String getter = this.properties.getGetter();
        if (getter.equals("db")) {

        }

        return null;
    }
}
