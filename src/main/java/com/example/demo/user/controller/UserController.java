package com.example.demo.user.controller;

import com.example.demo.user.entity.UserEntity;
import com.example.demo.user.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private final UserSerivce userSerivce;

    public UserController(UserSerivce userSerivce) {
        this.userSerivce = userSerivce;
    }

    @RequestMapping("/test")
    public String test(){
        return "看见我你就没毛病!";
    }
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public List<UserEntity> getAll(Map map){
        return userSerivce.getAll(map);
    }
    @RequestMapping("/delById")
    public String delById(Integer id){
        userSerivce.delById(id);
        return "redirect:/index.html";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){
        System.out.println("用户注册:"+userEntity.toString());
        userSerivce.save(userEntity);
        return "success";
    }
}
