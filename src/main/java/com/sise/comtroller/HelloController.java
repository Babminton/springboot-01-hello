package com.sise.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*@program: springboot-01-helloworld
 *@description: 控制层
 *@author: zeng
 *@create: 2019-07-30 18:43
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
           return "Hello World!";
    }
}
