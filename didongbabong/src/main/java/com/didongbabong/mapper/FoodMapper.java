package com.didongbabong.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.didongbabong.pojo.Food;

@Mapper
public interface FoodMapper extends BaseMapper<Food> {

}
