package com.example;

import com.example.demo.bean.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017-05-27.
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/find/{name}")
    public List<Demo> likeName(@PathVariable String name){
        return demoService.likeName(name);
    }
}
