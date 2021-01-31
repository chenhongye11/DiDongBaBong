package com.didongbabong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.didongbabong.mapper.FoodMapper;
import com.didongbabong.pojo.Food;
import com.didongbabong.vo.SysResult;

@Service
public class FoodServiceImpl implements FoodService {
	
	
	
	
	
	@Autowired
	private FoodMapper foodMapper;
	@Override
	public Food findFood(String foodName) {
		QueryWrapper queryWrapper = new QueryWrapper();
		
		queryWrapper.eq("name",foodName);
		Food food = foodMapper.selectOne(queryWrapper);
		
		return food;
	}
	
	
	

}
