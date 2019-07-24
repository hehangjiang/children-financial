package com.czb.train.childrenfinancial.mapper;

import com.czb.train.childrenfinancial.entity.FinProductInf;

public interface FinProductInfMapper {
    int deleteByPrimaryKey(String productId);

    int insert(FinProductInf record);

    int insertSelective(FinProductInf record);

    FinProductInf selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(FinProductInf record);

    int updateByPrimaryKey(FinProductInf record);
}