package com.didongbabong.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	
	@RequestMapping("/{moduleName}")
	public String index(@PathVariable String moduleName) {
		return moduleName;
	}

}
