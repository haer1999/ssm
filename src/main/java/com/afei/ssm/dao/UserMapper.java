package com.afei.ssm.dao;

import com.afei.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer id);
}