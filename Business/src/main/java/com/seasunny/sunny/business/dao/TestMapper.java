package com.seasunny.sunny.business.dao;

import com.seasunny.sunny.business.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select("select * from person where id = #{id}")
    Person getById(@Param("id") int id);

}
