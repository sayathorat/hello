package com.example.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SqlDemoApplication {

	 @RequestMapping("/")
	 String hello(Map<String, Object> model) {
		  model.put("message", "Welcome to my app!");
		  return "hello";
		}
	public static void main(String[] args) {
		SpringApplication.run(SqlDemoApplication.class, args);
	}

}
