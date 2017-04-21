package org.thin.common.service.imgservice;

/**
 * @author baocaixiong
 */
public interface FrontUpload
{
    /**
     * 简单上传凭证
     * @return
     */
    public String simpleFrontUploadToken(String bucketName);

    /**
     * 复杂上传凭证,支持文件同名覆盖
     * @return
     */
    public String frontUploadToken(String bucketName, String fileKey);
}
