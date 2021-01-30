package com.didongbabong.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.didongbabong.pojo.Food;
import com.didongbabong.service.FoodService;
import com.didongbabong.vo.SysResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class FoodController {
	
	
	@Autowired
	FoodService foodService;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@RequestMapping("/find/{foodName}")
	public String findFood(@PathVariable String foodName) {
		
		
		Food food = foodService.findFood(foodName);
		try {
			return objectMapper.writeValueAsString(food);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			
		}
		return null;
		
		
	}
	
	@RequestMapping("/insert/{food}")
	public SysResult insertFood(@PathVariable Food food) {
		return null;
		
	}
	

}
