package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class HalloController {
    @RequestMapping("/hallo")
    public  String say(){
        return "wwwhallo";
    }

    @RequestMapping("/hallo2")
    public  String say2(){
        return "hallo 2";
    }

    @RequestMapping("/hallo3")
    public  String say3(){
        return "hallo 333333";
    }

    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("张三");
        demo.setCreateTime(new Date());
        return demo;
    }
}
