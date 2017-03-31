package org.thin.ugc.service.imgservice;

import org.thin.ugc.service.imgservice.FrontUpload;
import org.thin.ugc.service.imgservice.ImgService;
import org.thin.ugc.service.imgservice.ServerUpload;

public class Qiniu implements ImgService, FrontUpload, ServerUpload
{
    @Override
    public boolean validateIdentity(String identity)
    {
        return false;
    }

    @Override
    public String simpleFrontUploadToken(String bucketName)
    {
        return "123123";
    }

    @Override
    public String frontUploadToken(String bucketName, String fileKey)
    {
        return "123123";

    }
}
