package com.example;


import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-05-27.
 */
public interface DemoMapper {
    @Select("select * from demo where name=#{name}")
    public List<Demo> likeName(String name);
}
