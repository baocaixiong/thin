package org.thin.ugc.filters;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRemoteIpFilter
{
    @Bean
    public RemoteIpFilter remoteIpFilter()
    {
        return new RemoteIpFilter();
    }
}
