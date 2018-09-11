package com.mobao.mapper;

import com.mobao.entity.dao.UserTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserTestMapper {
    int insert(UserTest record);

    int insertSelective(UserTest record);

    UserTest selectByPrimaryKey(Long id);

    List<UserTest> selectAllUsers();
}