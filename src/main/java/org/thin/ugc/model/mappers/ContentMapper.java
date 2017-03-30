package org.thin.ugc.model.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.thin.ugc.model.Content;

import java.math.BigInteger;

@Mapper
public interface ContentMapper
{
    @Select("SELECT * FROM `content` WHERE id = #{id}")
    Content findByCid(@Param("id") BigInteger cid);
}
