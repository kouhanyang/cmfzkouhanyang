package com.baizhi.test;

import com.baizhi.Service.BannerService;
import com.baizhi.dao.BannerDao;
import com.baizhi.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/24.
 */

public class BannerTest extends Test {
    @Autowired
    private BannerDao bannerDao;
    @org.junit.Test
    public void select(){
        List list=bannerDao.selectByPage(0,5);
        System.out.println(list);
    }
    @org.junit.Test
    public void selecetCount(){
        int n=bannerDao.selectCount();
        System.out.println(n);
    }
}
