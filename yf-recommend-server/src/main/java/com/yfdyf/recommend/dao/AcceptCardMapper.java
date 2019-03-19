package com.yfdyf.recommend.dao;

import com.yfdyf.recommend.entity.bean.AcceptCard;

public interface AcceptCardMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(AcceptCard record);

    int insertSelective(AcceptCard record);

    AcceptCard selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(AcceptCard record);

    int updateByPrimaryKey(AcceptCard record);
}