package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface VideoDao {
    void addVideos(Video video);

    void batchAddVideoTags(List<VideoTag> tagList);

    Integer pageCountVideos(Map<String, Object> params);

    List<Video> pageListVideos(Map<String, Object> params);
}
