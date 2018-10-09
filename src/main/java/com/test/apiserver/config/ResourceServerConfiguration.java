package com.test.apiserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.headers().frameOptions().disable();//HTTP 헤더 충돌 방지를 위해 설정
		
		///test라고 되어있는 URL은 scope가 read면 통과되고, 다른 모든 접근들은 별도의 인증을 요구하지 않음
		http.authorizeRequests().antMatchers("/test/**").access("#oauth2.hasScope('read')");
	}
}