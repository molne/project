package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}