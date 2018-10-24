package com.baizhi.Service;

import com.baizhi.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/24.
 */
public interface BannerService {
    public Map selectByPage(int page, int rows);

}
