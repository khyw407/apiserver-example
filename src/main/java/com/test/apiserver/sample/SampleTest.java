package com.test.apiserver.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleTest {
	
	@RequestMapping("/test")
	public String test() {
		return "Success : Request With Access Token";
	}
}
