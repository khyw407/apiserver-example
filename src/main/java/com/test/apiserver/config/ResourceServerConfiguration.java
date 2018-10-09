package com.test.apiserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{
	
	/*
	 * Input Type	: HttpSecurity
	 * Output Type	: void
	 * Description	: @EnableResourceServer를 통해 API서버가 OAuth2 인증을 받도록 한다.
	 * 				  ResourceServerConfigurerAdapter를 상속받아 configure 메소드를 override하는데, 
	 * 				    해당 클래스는 OAuth2 security로 보호되는 경로에 대한 설정을 하는 역할을 한다.
	 * 				    기본적으로는 모든 요청에 대해서 인증을 요구하나, /test 경로로 들어오는 요청에 대해서만 인증을 요구한다.
	 * 				  scope가 read인 경우에만 해당 요청이 통과된다.
	 */
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.headers().frameOptions().disable(); //HTTP 헤더 충돌 방지를 위해 설정
		http.authorizeRequests().antMatchers("/test/**").access("#oauth2.hasScope('read')");
	}
}