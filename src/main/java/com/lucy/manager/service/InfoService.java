package com.lucy.manager.service;

import com.lucy.manager.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    UserInfoMapper userInfoMapper;


}
