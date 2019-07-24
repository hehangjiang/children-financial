package com.czb.train.childrenfinancial.mapper;

import com.czb.train.childrenfinancial.entity.LsInf;
import com.czb.train.childrenfinancial.entity.LsInfKey;

public interface LsInfMapper {
    int deleteByPrimaryKey(LsInfKey key);

    int insert(LsInf record);

    int insertSelective(LsInf record);

    LsInf selectByPrimaryKey(LsInfKey key);

    int updateByPrimaryKeySelective(LsInf record);

    int updateByPrimaryKey(LsInf record);
}