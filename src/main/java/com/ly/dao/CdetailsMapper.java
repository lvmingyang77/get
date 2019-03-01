package com.ly.dao;

import com.ly.pojo.Cdetails;

public interface CdetailsMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Cdetails record);

    int insertSelective(Cdetails record);

    Cdetails selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Cdetails record);

    int updateByPrimaryKey(Cdetails record);
}