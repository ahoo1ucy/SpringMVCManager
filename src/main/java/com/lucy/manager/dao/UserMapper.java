package com.lucy.manager.dao;

import com.lucy.manager.bean.User;
import com.lucy.manager.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userid);

    List<User> selectByExampleWithUserInfo(UserExample example);

    User selectByPrimaryKeyWithUserInfo(Integer userid);

    List<User> selectByExampleWithUserPoint(UserExample example);

    User selectByPrimaryKeyWithUserPoint(Integer userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}