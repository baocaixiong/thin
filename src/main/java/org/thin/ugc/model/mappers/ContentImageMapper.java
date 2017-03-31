package org.thin.ugc.model.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.thin.ugc.model.ContentImage;

import java.util.List;

@Mapper
@Repository
public interface ContentImageMapper
{
    @Select("select * from content_img where cid = #{contentId}")
    public List<ContentImage> getImagesByContentId(@Param("contentId") String contentId);
}
