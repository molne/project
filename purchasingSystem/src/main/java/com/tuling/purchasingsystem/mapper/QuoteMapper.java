package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.Quote;

public interface QuoteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Quote record);

    int insertSelective(Quote record);

    Quote selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Quote record);

    int updateByPrimaryKey(Quote record);
}