package com.czb.train.childrenfinancial.mapper;

import com.czb.train.childrenfinancial.entity.BusiInf;
import com.czb.train.childrenfinancial.entity.BusiInfKey;

public interface BusiInfMapper {
    int deleteByPrimaryKey(BusiInfKey key);

    int insert(BusiInf record);

    int insertSelective(BusiInf record);

    BusiInf selectByPrimaryKey(BusiInfKey key);

    int updateByPrimaryKeySelective(BusiInf record);

    int updateByPrimaryKey(BusiInf record);
}