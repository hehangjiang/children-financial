package com.czb.train.childrenfinancial.controller;

import com.czb.train.childrenfinancial.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @Description: demo
 * @Author: hhj
 * @Date: 2019/7/23 
 * @Version: 0
 */

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    public String hello() {
        return "hello, group 6";
    }

    @RequestMapping("/getdemo")
    public String getDemo() {
        return demoService.getDemo();
    }
}
