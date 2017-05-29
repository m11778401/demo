package com.example.demo.service;

import com.example.demo.bean.Cat;
import com.example.demo.repository.Cat2Repository;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017-05-27.
 */
@Service
public class CatService {
    @Autowired
    private CatRepository catRepository;
    @Autowired
    private Cat2Repository cat2Repository;

    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }
    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }
    @Transactional
    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }
    @Transactional
    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }
}
