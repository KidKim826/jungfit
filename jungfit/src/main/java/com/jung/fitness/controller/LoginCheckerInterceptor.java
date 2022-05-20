package com.jung.fitness.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginCheckerInterceptor implements HandlerInterceptor{
	private static final Logger logger = LoggerFactory.getLogger(LoginCheckerInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("name") == null) {
			logger.debug("로그인안됨");
			response.sendRedirect(request.getContextPath() + "");
			return false;
		}
		return true;
	}
}
