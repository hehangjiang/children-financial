package com.czb.train.childrenfinancial.service.impl;

import com.czb.train.childrenfinancial.entity.DemoEntity;
import com.czb.train.childrenfinancial.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoServiceImpl
 * @Description:
 * @Author: hhj
 * @Date: 2019/7/23
 * @Version: 0
 */

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getDemo() {
        System.out.println("children-financial");
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setMessage("hehe");
        return demoEntity.getMessage();
    }
}
