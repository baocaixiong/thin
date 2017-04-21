package org.thin.common.service.imgservice;

/**
 * @author baocaixiong
 */
public interface ImgService
{
    /**
     * @param identity 图片上传后产生的唯一标识符
     * @return true如果图片有效, 否则false
     */
    boolean validateIdentity(String identity);
}
