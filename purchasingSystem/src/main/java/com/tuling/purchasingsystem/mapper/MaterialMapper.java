package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.Material;

public interface MaterialMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Material record);

    int insertSelective(Material record);

    Material selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}