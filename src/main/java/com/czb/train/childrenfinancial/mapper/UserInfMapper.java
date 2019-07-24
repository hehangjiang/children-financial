package com.czb.train.childrenfinancial.mapper;

import com.czb.train.childrenfinancial.entity.UserInf;
import com.czb.train.childrenfinancial.entity.UserInfKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfMapper {
    int deleteByPrimaryKey(UserInfKey key);

    int insert(UserInf record);

    int insertSelective(UserInf record);

    UserInf selectByPrimaryKey(UserInfKey key);

    UserInf selectByAccount(String account);

    int updateByPrimaryKeySelective(UserInf record);

    int updateByPrimaryKey(UserInf record);
}