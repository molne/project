package com.tuling.purchasingsystem.mapper;

import com.tuling.purchasingsystem.entity.StockSupplier;

public interface StockSupplierMapper {
    int insert(StockSupplier record);

    int insertSelective(StockSupplier record);
}