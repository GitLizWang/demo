package com.example.demo.user.dao;

import com.example.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content") Map map);
    void delById(Integer id);
    void save(UserEntity userEntity);
}
