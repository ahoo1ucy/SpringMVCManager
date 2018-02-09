package com.lucy.manager.dao;

import com.lucy.manager.bean.UserPoint;
import com.lucy.manager.bean.UserPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointMapper {
    long countByExample(UserPointExample example);

    int deleteByExample(UserPointExample example);

    int deleteByPrimaryKey(Integer userpointid);

    int insert(UserPoint record);

    int insertSelective(UserPoint record);

    List<UserPoint> selectByExample(UserPointExample example);

    UserPoint selectByPrimaryKey(Integer userpointid);

    int updateByExampleSelective(@Param("record") UserPoint record, @Param("example") UserPointExample example);

    int updateByExample(@Param("record") UserPoint record, @Param("example") UserPointExample example);

    int updateByPrimaryKeySelective(UserPoint record);

    int updateByPrimaryKey(UserPoint record);
}