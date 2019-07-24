package com.czb.train.childrenfinancial.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @ClassName: DemoEntity
 * @Description:
 * @Author: hhj
 * @Date: 2019/7/23 
 * @Version: 0
 */

@Entity
public class DemoEntity implements Serializable {
    @Getter
    @Setter

    private String message;
}
