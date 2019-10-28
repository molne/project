package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.ContractDetail;

public interface ContractDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContractDetail record);

    int insertSelective(ContractDetail record);

    ContractDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractDetail record);

    int updateByPrimaryKey(ContractDetail record);
}