package com.czb.train.childrenfinancial.mapper;

import com.czb.train.childrenfinancial.entity.CardInf;
import com.czb.train.childrenfinancial.entity.CardInfKey;

public interface CardInfMapper {
    int deleteByPrimaryKey(CardInfKey key);

    int insert(CardInf record);

    int insertSelective(CardInf record);

    CardInf selectByPrimaryKey(CardInfKey key);

    int updateByPrimaryKeySelective(CardInf record);

    int updateByPrimaryKey(CardInf record);
}