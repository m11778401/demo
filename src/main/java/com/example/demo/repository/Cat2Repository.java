package com.example.demo.repository;

import com.example.demo.bean.Cat;
import org.springframework.data.repository.Repository;


/**
 * Created by Administrator on 2017-05-27.
 */
public interface Cat2Repository extends Repository<Cat,Integer> {

    public Cat findByCatName(String catName);
}
