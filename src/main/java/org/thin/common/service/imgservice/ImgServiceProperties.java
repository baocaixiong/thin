package org.thin.common.service.imgservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = ImgServiceProperties.IMAGE_SERVICE_PREFIX)
public class ImgServiceProperties
{
    public static final String IMAGE_SERVICE_PREFIX = "imageservice";

    private String provider;

    @Value("${imageservice.qiniu.access_key}")
    private String qiNiuAccessKey;

    @Value("${imageservice.qiniu.secret_key}")
    private String qiNiuSecretKey;

    public String getProvider()
    {
        return provider;
    }

    public void setProvider(String provider)
    {
        this.provider = provider;
    }

    public String getQiNiuAccessKey()
    {
        return qiNiuAccessKey;
    }

    public void setQiNiuAccessKey(String qiNiuAccessKey)
    {
        this.qiNiuAccessKey = qiNiuAccessKey;
    }

    public String getQiNiuSecretKey()
    {
        return qiNiuSecretKey;
    }

    public void setQiNiuSecretKey(String qiNiuSecretKey)
    {
        this.qiNiuSecretKey = qiNiuSecretKey;
    }

    @Override
    public String toString()
    {
        return "ImgServiceProperties{" +
                "provider='" + provider + '\'' +
                ", qiNiuAccessKey='" + qiNiuAccessKey + '\'' +
                ", qiNiuSecretKey='" + qiNiuSecretKey + '\'' +
                '}';
    }
}
