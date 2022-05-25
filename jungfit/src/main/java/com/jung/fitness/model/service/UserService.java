package com.jung.fitness.model.service;

import java.util.List;

import com.jung.fitness.model.dto.User;

public interface UserService {
	// 회원가입 (Sign in / Create)
	void join(User user) throws Exception;

	// 로그인
	User login(String id, String pw) throws Exception;

	// 회원 정보 수정
	void modifyUser(User user, String ckpw, String newpw) throws Exception;

	// 회원 탈퇴
	void deleteUser(String id, String pw) throws Exception;

	// 유저 목록 조회
	List<User> readListUser();
	
	// WithOut Pw
	User getUserWoPw(String id) throws Exception;
//	// pw 확인
//	boolean originalPW(User user, String ckpw) throws Exception;
	
	// 멤버십 업데이트
	
	// 트레이너 업데이트
}
