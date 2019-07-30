package com.sise;

/*@program: springboot-01-helloworld
 *@description: 主程序
 *@author: zeng
 *@create: 2019-07-30 18:36
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication:
 *  Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，
 *  SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；
 */

@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }


}
