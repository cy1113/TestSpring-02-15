package com.cy.Spring.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.Spring.lesson01.model.Movie;

@RestController
@RequestMapping("/lesson01/test02")
public class test02 {
	
	
	@RequestMapping("/1")
	public List<Map<String, Object>> printMap() {
		Map<String, Object> map = new HashMap<>();
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		
		
		return list;
	}
}
