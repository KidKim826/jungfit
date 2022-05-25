package com.jung.fitness.model.service;

import com.jung.fitness.model.dto.Manager;

public interface ManagerService {
	//매니저 로그인
	Manager login(String id, String pw) throws Exception;
	
	//매니저 정보수정
	void modifyManager(Manager manager, String ckpw, String newpw) throws Exception;
	
}
