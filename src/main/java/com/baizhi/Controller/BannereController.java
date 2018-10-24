package com.baizhi.Controller;

import com.baizhi.Service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2018/10/24.
 */
@RestController
@RequestMapping("/banner")
public class BannereController {
    @Autowired
    private BannerService bannerService;
    @RequestMapping("/select")
    public Map selectByPage(int page,int rows){
        return bannerService.selectByPage(page,rows);
    }
}
