package org.thin.ugc.models.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.thin.ugc.models.Content;

@Mapper
public interface ContentMapper
{
    @Select("SELECT * FROM `content` WHERE id = #{id}")
    Content findByCid(@Param("id") long cid);
}
