package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.ContractApply;

public interface ContractApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContractApply record);

    int insertSelective(ContractApply record);

    ContractApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractApply record);

    int updateByPrimaryKey(ContractApply record);
}