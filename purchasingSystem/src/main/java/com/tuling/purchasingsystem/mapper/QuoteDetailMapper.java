package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.QuoteDetail;

public interface QuoteDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuoteDetail record);

    int insertSelective(QuoteDetail record);

    QuoteDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QuoteDetail record);

    int updateByPrimaryKey(QuoteDetail record);
}