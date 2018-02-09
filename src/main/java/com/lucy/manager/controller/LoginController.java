package com.lucy.manager.controller;


import com.lucy.manager.bean.Msg;
import com.lucy.manager.bean.User;
import com.lucy.manager.service.LoginService;
import com.lucy.manager.utils.CheckPW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * 登录控制器
 *
 */

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Msg Login(HttpServletRequest request, HttpServletResponse response, @RequestParam String account, @RequestParam String password){
        User model = loginService.GetUser(account);
        if (model == null){
            return Msg.returnMsg(-1,"该账号还未注册！");
        }else {
            if (CheckPW.IsLogin(account, password, model.getPassword())){
                //登录成功
                //生成UUID填写到Token与Cookie
                String uuidstr = UUID.randomUUID().toString().substring(0,16);
                loginService.UpdateToken(model.getUserid(), uuidstr);
                Cookie[] cookies = request.getCookies();
                for(Cookie cookie : cookies){
                    if (cookie.getName().equals("User_Token")){
                        cookie.setMaxAge(0);
                    }
                }
                Cookie newCookie = new Cookie("User_Token",uuidstr);
                newCookie.setMaxAge(24 * 60 * 60);
                response.addCookie(newCookie);
                return Msg.success().add("Token", uuidstr);
            }else {
                //登录失败
                return Msg.fail();
            }
        }
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping(value = "/api/regist", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Msg Regist(HttpServletRequest request, HttpServletResponse response, @RequestParam String account,@RequestParam String password,@RequestParam String username){
        if (loginService.RegistUser(account, password, username)){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }

    /**
     * Cookie检查
     * @return
     */
    @RequestMapping(value = "/api/checkck",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Msg Check(HttpServletRequest request, HttpServletResponse response){
        boolean error = true;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){
            if (cookie.getName().equals("User_Token")){
                error = false;
                break;
            }
        }

        return error == true ? Msg.fail() : Msg.success();
    }
}
