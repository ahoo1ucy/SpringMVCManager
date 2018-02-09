package com.lucy.manager.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lucy.manager.bean.User;
import com.lucy.manager.bean.UserExample;
import com.lucy.manager.bean.UserInfo;
import com.lucy.manager.bean.UserPoint;
import com.lucy.manager.dao.UserInfoMapper;
import com.lucy.manager.dao.UserMapper;
import com.lucy.manager.dao.UserPointMapper;
import com.lucy.manager.utils.SecretBLL;
import org.apache.ibatis.session.SqlSession;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.security.MessageDigest;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * 测试dao工具类方法
 * 推荐使用Spring的项目使用Spring的单元测试，可以自动注入我们需要的组件
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定Spring配置文件的位置
 * 3.直接autowired要使用的组件
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    UserPointMapper userPointMapper;

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    SqlSession sqlSession;

    /**
     * 创建Mapper
     */
    @Test
    public void TestCreate() throws JsonProcessingException {
        /*
        //1.创建SpringIOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取Mapper
        UserPoint bean = ioc.getBean(UserPoint.class);
        */

        //System.out.print(userPointMapper);

        //1.插入
        //userPointMapper.insertSelective(new UserPoint(null,0,0,new Date()));
        //userInfoMapper.insertSelective(new UserInfo(null,"13702347034","中国","广东省","佛山市","南海区西樵镇","大哥浩",new Date(1992,9,17),"M",null,new Date()));
        //userMapper.updateByPrimaryKeySelective(new User(8,null,null,null,null,null,1,1,null));

        //UserPointMapper mapper = sqlSession.getMapper(UserPointMapper.class);
        //for (int i = 0; i < 10; i++){
        //    //获取UUID
        //    //String uuid = UUID.randomUUID().toString().substring(0,5);
        //    userPointMapper.insertSelective(new UserPoint(null,0,0,new Date()));
        //}

        //UserExample IsEqualExample = new UserExample();
        //IsEqualExample.createCriteria().andAccountEqualTo("lucy");
        //List<User> list = userMapper.selectByExample(IsEqualExample);
        //User model = list.get(0);
        //ObjectMapper objectMapper = new ObjectMapper();
        //String json = objectMapper.writeValueAsString(model);
        //System.out.print("JSON = " + json);

        String md5 = SecretBLL.GetMD5("陆浩时好帅！");
        System.out.print("md5 = " + md5.toUpperCase());
    }
}
