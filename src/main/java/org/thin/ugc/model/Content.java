package org.thin.ugc.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Content
{
    private BigInteger id;
    private Integer bizIdentity; // 业务标识符
    private String userIdentity;
    private String text;
    private Boolean idWithImage; // 是否包含图片
    private Boolean idDeleted; // 是否被用户删除
    private Boolean idShield; // 是否被系统屏蔽
    private BigInteger forefathersId; // 最原始的一条ContentId
    private BigInteger parentId; // 回复的那条ContentId
    private Timestamp createdTime;
    private Timestamp updatedTime;

    public Content(BigInteger id,
                   Integer bizIdentity,
                   String userIdentity,
                   String text,
                   Boolean idWithImage,
                   Boolean idDeleted,
                   Boolean idShield,
                   BigInteger forefathersId,
                   BigInteger parentId,
                   Timestamp createdTime,
                   Timestamp updatedTime
    )
    {
        this.id = id;
        this.bizIdentity = bizIdentity;
        this.userIdentity = userIdentity;
        this.text = text;
        this.idWithImage = idWithImage;
        this.idDeleted = idDeleted;
        this.idShield = idShield;
        this.forefathersId = forefathersId;
        this.parentId = parentId;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString()
    {
        return "Content{" +
                "id=" + id +
                ", bizIdentity=" + bizIdentity +
                ", userIdentity='" + userIdentity + '\'' +
                ", text='" + text + '\'' +
                ", idWithImage=" + idWithImage +
                ", idDeleted=" + idDeleted +
                ", idShield=" + idShield +
                ", forefathersId=" + forefathersId +
                ", parentId=" + parentId +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }

    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
    }

    public Integer getBizIdentity()
    {
        return bizIdentity;
    }

    public void setBizIdentity(Integer bizIdentity)
    {
        this.bizIdentity = bizIdentity;
    }

    public String getUserIdentity()
    {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity)
    {
        this.userIdentity = userIdentity;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public Boolean getIdWithImage()
    {
        return idWithImage;
    }

    public void setIdWithImage(Boolean idWithImage)
    {
        this.idWithImage = idWithImage;
    }

    public Boolean getIdDeleted()
    {
        return idDeleted;
    }

    public void setIdDeleted(Boolean idDeleted)
    {
        this.idDeleted = idDeleted;
    }

    public Boolean getIdShield()
    {
        return idShield;
    }

    public void setIdShield(Boolean idShield)
    {
        this.idShield = idShield;
    }

    public BigInteger getForefathersId()
    {
        return forefathersId;
    }

    public void setForefathersId(BigInteger forefathersId)
    {
        this.forefathersId = forefathersId;
    }

    public BigInteger getParentId()
    {
        return parentId;
    }

    public void setParentId(BigInteger parentId)
    {
        this.parentId = parentId;
    }

    public Timestamp getCreatedTime()
    {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime)
    {
        this.createdTime = createdTime;
    }

    public Timestamp getUpdatedTime()
    {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime)
    {
        this.updatedTime = updatedTime;
    }
}
