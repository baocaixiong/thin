package org.thin.ugc.model;

import java.math.BigInteger;

/**
 * 内容包含的图片
 *
 * @author baocaixiong
 */
public class ContentImage
{
    private Long id;
    private Integer bizIdentity; // 业务标识符
    private BigInteger contentId;
    private String userIdentity;
    private String host; // 图片宿主
}
