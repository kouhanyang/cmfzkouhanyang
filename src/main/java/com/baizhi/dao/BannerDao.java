package com.baizhi.dao;

import com.baizhi.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
public interface BannerDao {
    //查询轮播图
    public List<Banner> selectByPage(@Param("start") int start,@Param("end") int end);
    //查新轮播图数量
    public int selectCount();
}
