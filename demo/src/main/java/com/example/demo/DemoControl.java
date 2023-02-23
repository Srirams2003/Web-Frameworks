package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControl {
	@Value("This is my name") private String s;
	@GetMapping("/display")
public String show() {
	return s;
}
}
