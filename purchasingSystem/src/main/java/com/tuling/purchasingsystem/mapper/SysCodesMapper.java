package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.SysCodes;

public interface SysCodesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysCodes record);

    int insertSelective(SysCodes record);

    SysCodes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodes record);

    int updateByPrimaryKey(SysCodes record);
}