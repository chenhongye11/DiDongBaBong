package com.didongbabong.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.didongbabong.service.FoodService;
import com.didongbabong.vo.SysResult;

@Controller
public class FoodController {
	
	@RequestMapping("/food/{foodName}")
	public SysResult findFood(@PathVariable String foodName) {
		
		//@Autowired
		FoodService foodService;
		return null;
		
		
		
	}
	

}
