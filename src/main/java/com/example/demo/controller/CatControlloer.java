package com.example.demo.controller;

import com.example.demo.bean.Cat;
import com.example.demo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-05-27.
 */
@RestController
public class CatControlloer {
    @Autowired
    private CatService catService;

    @RequestMapping("/save")
    public void save(){
        Cat cat=new Cat();
        cat.setId(1);
        cat.setCatName("jojo");
        cat.setCatAge(5);
        catService.save(cat);

    }
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable  int id){
        catService.delete(id);
    }
    @RequestMapping("/find")
    public Iterable<Cat> findAll(){
        return catService.getAll();
    }

    @RequestMapping("/findByCatName/{catname}")
    public Cat findByCatName(@PathVariable String catname){
        return catService.findByCatName(catname);
    }

    @RequestMapping("/findByCatName")
    public Cat findByCatName2( String catname){
        return catService.findByCatName(catname);
    }

}
