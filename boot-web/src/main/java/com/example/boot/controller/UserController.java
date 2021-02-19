package com.example.boot.controller;

import com.example.boot.UserService;
import com.example.boot.mybatis.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author niutongtong
 */
@RestController
@RequestMapping("/ntt")
@Api("用户API")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/findUser")
    @ApiOperation("通过ID查找用户信息")
   public User findUser(@RequestParam(name="id", required=false, defaultValue= "1") Integer id){
     return userService.selectByPrimaryKey(id);
   }
}
