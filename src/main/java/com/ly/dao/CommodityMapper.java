package com.ly.dao;

import com.ly.pojo.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}