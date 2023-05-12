package com.example.brmsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String testDatabaseConnection() {
		String result;
		try {
			//Perform a simple query to check the database connection
			result ="Database connection test successful!";
		}catch(Exception e){
			result = "Database connection test failed"+e.getMessage();
		}
		return result;
	}
	
}
