package org.thin.ugc.service.imgservice;


import com.qiniu.util.Auth;

public class Qiniu implements ImgService, FrontUpload, ServerUpload
{
    private ImgServiceProperties properties;
    private final Auth auth;

    Qiniu(ImgServiceProperties properties)
    {
        this.properties = properties;
        this.auth = Auth.create(properties.getQiNiuAccessKey(), properties.getQiNiuSecretKey());
    }

    @Override
    public boolean validateIdentity(String identity)
    {
        return false;
    }

    @Override
    public String simpleFrontUploadToken(String bucketName)
    {
        return auth.uploadToken(bucketName);
    }

    @Override
    public String frontUploadToken(String bucketName, String fileKey)
    {
        return auth.uploadToken(bucketName, fileKey);
    }
}
