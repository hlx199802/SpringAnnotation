package com.taozhu.config.test;

import com.taozhu.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 */
public class SpringConfigurationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.taozhu.config");
        SpringConfiguration springConfiguration =
                applicationContext.getBean(SpringConfiguration.class);
        System.out.println(springConfiguration);
    }

}
