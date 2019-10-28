package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.Enquire;

public interface EnquireMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Enquire record);

    int insertSelective(Enquire record);

    Enquire selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Enquire record);

    int updateByPrimaryKey(Enquire record);
}