package com.czb.train.childrenfinancial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ChildrenFinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildrenFinancialApplication.class, args);
    }

}
