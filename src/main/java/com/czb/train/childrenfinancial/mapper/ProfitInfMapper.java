package com.czb.train.childrenfinancial.mapper;

import com.czb.train.childrenfinancial.entity.ProfitInf;
import com.czb.train.childrenfinancial.entity.ProfitInfKey;

public interface ProfitInfMapper {
    int deleteByPrimaryKey(ProfitInfKey key);

    int insert(ProfitInf record);

    int insertSelective(ProfitInf record);

    ProfitInf selectByPrimaryKey(ProfitInfKey key);

    int updateByPrimaryKeySelective(ProfitInf record);

    int updateByPrimaryKey(ProfitInf record);
}