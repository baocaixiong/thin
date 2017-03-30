package org.thin.ugc.model.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.thin.ugc.model.Content;

import java.math.BigInteger;

@Mapper
@Repository
public interface ContentMapper
{
    @Select("SELECT * FROM `content` WHERE id = #{id}")
    Content findByCid(@Param("id") BigInteger cid);
}
