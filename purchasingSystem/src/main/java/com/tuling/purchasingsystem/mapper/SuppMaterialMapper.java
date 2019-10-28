package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.SuppMaterial;

public interface SuppMaterialMapper {
    int insert(SuppMaterial record);

    int insertSelective(SuppMaterial record);
}