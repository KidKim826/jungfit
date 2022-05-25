package com.jung.fitness.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.jung.fitness.util.JWTUtil;

@Component
public class JWTInterceptor implements HandlerInterceptor{
	
	private static final String HEADER_AUTH = "access-token";
	
	@Autowired
	private JWTUtil jwtUtil;
	
	//preHandel: 요청이 왔을 때 그걸 처리하기 전에 잡아다가 우리가 처리를 먼저 하겠다 하는 아이
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if (request.getMethod().equals("OPTIONS")) {
			//jwt 토큰을 쓸 때 유효한지 한 번 미리 보내본다.
			//그 때 요청이 꼬여서 미리 보내보는 것과 실제 보내는 거에서 문제가 생겨서.
			//추가해줘야해
            return true;
        }
		
		final String token= request.getHeader(HEADER_AUTH);
		System.out.println("token: " + token);
		if(token != null) {
			jwtUtil.checkToken(token);
			return true;
		}
		throw new Exception("유효하지 않은 접근 입니다.");
	}
	
}
