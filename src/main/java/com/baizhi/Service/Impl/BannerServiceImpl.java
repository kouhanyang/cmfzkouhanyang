package com.baizhi.Service.Impl;

import com.baizhi.Service.BannerService;
import com.baizhi.dao.BannerDao;
import com.baizhi.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/24.
 */
@Service
@Transactional
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDao bannerDao;

    @Override
    public Map selectByPage(int page, int rows) {
        Map map = new HashMap();
        int start = (page - 1) * rows;
        int end = (page * rows) - 1;
        List<Banner> list = bannerDao.selectByPage(start, end);
        int total = bannerDao.selectCount();
        map.put("rows", list);
        map.put("total", total);

        return map;
    }
}
