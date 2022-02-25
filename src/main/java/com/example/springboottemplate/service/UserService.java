package com.example.springboottemplate.service;

import com.example.springboottemplate.entity.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

//    User getUserName(Integer id);

    Void createUser(User user);

    PageInfo<User> findAll(Integer pageNum, Integer pageSize);
}
