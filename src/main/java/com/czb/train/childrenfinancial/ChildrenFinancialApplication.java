package com.czb.train.childrenfinancial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("com.czb.train.childrenfinancial.mapper")
public class ChildrenFinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildrenFinancialApplication.class, args);
    }

}
