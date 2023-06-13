package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.dto.TestRequestBodyDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("test")
public class TestController {
	
	@GetMapping
	public String testController() {
		return "Hello World!(안녕하세요!)";
	}
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
		return "Hello World! ID"+testRequestBodyDTO.getId()+" Message : "+testRequestBodyDTO.getMessage();
	}

}
