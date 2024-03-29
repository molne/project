package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.Contract;

public interface ContractMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}