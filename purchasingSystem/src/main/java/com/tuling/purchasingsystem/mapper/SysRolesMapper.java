package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.SysRoles;

public interface SysRolesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoles record);

    int insertSelective(SysRoles record);

    SysRoles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoles record);

    int updateByPrimaryKey(SysRoles record);
}