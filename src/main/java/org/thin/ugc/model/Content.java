package org.thin.ugc.model;

import com.fasterxml.jackson.annotation.JsonView;
import org.thin.ugc.view.View;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Content
{
    @JsonView(View.Summary.class)
    private BigInteger id;

    private Integer bizIdentity; // 业务标识符
    @JsonView(View.Summary.class)
    private String userIdentity;
    @JsonView(View.Summary.class)
    private String text;
    @JsonView(View.Summary.class)
    private Boolean idWithImage; // 是否包含图片
    @JsonView(View.Summary.class)
    private Boolean idDeleted; // 是否被用户删除
    @JsonView(View.Summary.class)
    private Boolean idShield; // 是否被系统屏蔽
    @JsonView(View.Summary.class)
    private BigInteger forefathersId; // 最原始的一条ContentId
    @JsonView(View.Summary.class)
    private BigInteger parentId; // 回复的那条ContentId
    @JsonView(View.Summary.class)
    private Timestamp createdTime;
    @JsonView(View.Summary.class)
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
}
