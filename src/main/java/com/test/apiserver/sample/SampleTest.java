package com.test.apiserver.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleTest {
	
	/*
	 * Output Type	: String
	 * Description	: @RequestMapping 어노테이션을 통해 /test 경로의 요청을 test()메소드에서 처리하도록 한다.
	 * 				  Http 요청의 헤더에 Access Token에 대한 정보가 있으면 문자열을 리턴한다.
	 */
	@RequestMapping("/test")
	public String test() {
		return "Success : Request With Access Token";
	}
}
