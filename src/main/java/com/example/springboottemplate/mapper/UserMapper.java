package com.example.springboottemplate.mapper;

import com.example.springboottemplate.dto.TbUser;
import com.example.springboottemplate.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//指定这是一个操作数据库的mapper
public interface UserMapper {
    List<User> findAll();

    List<TbUser> selectOne();

}