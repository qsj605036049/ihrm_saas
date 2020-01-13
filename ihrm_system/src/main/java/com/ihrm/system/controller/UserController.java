package com.ihrm.system.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.domain.BsUser;
import com.ihrm.system.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Map;

/**
 * @author qinshiji
 * @date 2020/1/13 9:31
 */
@RestController
@RequestMapping("/system")
public class UserController {

    @Autowired
    private UserService userService;
    /**
     *  登录处理
     * @param loginMap
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody Map<String,String> loginMap){
        String mobile = loginMap.get("mobile");
        String password = loginMap.get("password");
        /*
        * 登录认证处理流程
        * 1.密码md5加密
        * 2.shiro认证
        * 3.返回结果
        **/
//        密码md5加密 1.密码 2.盐 3.加密次数
        password = new Md5Hash(password, mobile, 3).toString();
//        1.构造shiro登录令牌
        UsernamePasswordToken token = new UsernamePasswordToken(mobile, password);
//        2.获取subject
        Subject subject = SecurityUtils.getSubject();
//        3.调用login方法,进入realm完成认证
        subject.login(token);
//        4.获取sessionId,返回结果
        String sessionId = (String) subject.getSession().getId();
        return new Result(ResultCode.SUCCESS,sessionId);
    }

    @GetMapping("/user")
    public Result getUser(){
        BsUser user = userService.findByMobile("13800000001");
        return new Result(ResultCode.SUCCESS,user);
    }
}
