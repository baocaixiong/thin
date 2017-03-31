package org.thin.ugc.service.imgservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties({ImgServiceProperties.class})
public class ImgServiceAutoConfiguration
{
    private static final Logger logger = LoggerFactory.getLogger(ImgServiceAutoConfiguration.class);

    private ImgServiceProperties serviceProperties;

    public ImgServiceAutoConfiguration(ImgServiceProperties properties)
    {
        this.serviceProperties = properties;
    }

    @Bean
    public ImgServiceFactory getImageService()
    {
        return new ImgServiceFactory(this.serviceProperties);
    }
}
