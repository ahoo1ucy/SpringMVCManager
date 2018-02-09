package com.lucy.manager.service;

import com.lucy.manager.bean.User;
import com.lucy.manager.bean.UserExample;
import com.lucy.manager.dao.UserMapper;
import com.lucy.manager.utils.CheckPW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    UserMapper userMapper;


    /**
     * 根据Account获取用户模型
     * @param Account 账号名
     * @return
     */
    public User GetUser(String Account){
        UserExample IsEqualExample = new UserExample();
        IsEqualExample.createCriteria().andAccountEqualTo(Account);
        List<User> list = userMapper.selectByExample(IsEqualExample);
        if (list.size() == 0){
            return null;
        }else {
            return list.get(0);
        }
    }

    /**
     * 更新Token
     * @param UserId 用户Id
     * @param Token Token
     */
    public void UpdateToken(int UserId, String Token){
        User user = new User(UserId,null,null,null,Token,null,null,null,null);
        userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 注册用户
     * @param account 账号名
     * @param password 密码
     * @param username 用户名
     * @return
     */
    public boolean RegistUser(String account, String password, String username){
        try {
            User model = GetUser(account);
            if (model != null){
                return false;
            }else {
                String Encryption_PassWord = CheckPW.MD5Str(account, password);
                User user = new User(null, account, username, Encryption_PassWord, null, 1, null, null,new Date());
                userMapper.insertSelective(user);
                return true;
            }
        }catch (Exception ex){
            return false;
        }
    }
}
