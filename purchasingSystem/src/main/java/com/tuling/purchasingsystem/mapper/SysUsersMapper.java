package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.SysUsers;

public interface SysUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    SysUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUsers record);

    int updateByPrimaryKey(SysUsers record);
}