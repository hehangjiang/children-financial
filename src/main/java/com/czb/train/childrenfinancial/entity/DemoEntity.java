package com.czb.train.childrenfinancial.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @ClassName: DemoEntity
 * @Description:
 * @Author: hhj
 * @Date: 2019/7/23 
 * @Version: 0
 */

@Entity
public class DemoEntity {
    @Getter
    @Setter

    private String message;
}
