package com.jung.fitness.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		registry
		.addMapping("/**")
		.allowedOrigins("*")
		.allowedMethods("GET", "POST","PUT","DELETE")
		.maxAge(6000);
		//30분 1800초 그러면 600이 10분 / 6000이면 100분 / 1시간 40분
	}
	
}
