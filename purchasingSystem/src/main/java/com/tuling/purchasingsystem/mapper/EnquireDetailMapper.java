package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.EnquireDetail;

public interface EnquireDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnquireDetail record);

    int insertSelective(EnquireDetail record);

    EnquireDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnquireDetail record);

    int updateByPrimaryKey(EnquireDetail record);
}