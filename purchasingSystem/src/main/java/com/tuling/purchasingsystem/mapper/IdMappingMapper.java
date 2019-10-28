package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.IdMapping;

public interface IdMappingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IdMapping record);

    int insertSelective(IdMapping record);

    IdMapping selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IdMapping record);

    int updateByPrimaryKey(IdMapping record);
}