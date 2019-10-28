package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.SysLogs;

public interface SysLogsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLogs record);

    int insertSelective(SysLogs record);

    SysLogs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLogs record);

    int updateByPrimaryKey(SysLogs record);
}