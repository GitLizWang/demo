package com.example.demo.user.service.Impl;

import com.example.demo.user.dao.UserDao;
import com.example.demo.user.entity.UserEntity;
import com.example.demo.user.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserSerivce {
    @Autowired
    private UserDao userDao;
    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public void save(UserEntity userEntity) {
        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        userDao.save(userEntity);
    }
}
