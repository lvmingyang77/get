package com.ly.dao;

import com.ly.pojo.ShopCart;

public interface ShopCartMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(ShopCart record);

    int insertSelective(ShopCart record);

    ShopCart selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(ShopCart record);

    int updateByPrimaryKey(ShopCart record);
}