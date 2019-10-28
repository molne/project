package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.SysMenus;

public interface SysMenusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenus record);

    int insertSelective(SysMenus record);

    SysMenus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenus record);

    int updateByPrimaryKey(SysMenus record);
}