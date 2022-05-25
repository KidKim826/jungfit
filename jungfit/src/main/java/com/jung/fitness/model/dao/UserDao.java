package com.jung.fitness.model.dao;

import java.util.List;

import com.jung.fitness.model.dto.User;

public interface UserDao {
	// 회원가입 (C)
	void insertUser(User user) throws Exception;

	// 로그인 R
	User selectById(String id) throws Exception;

	// 회원 정보 수정 U
	void updateUser(User user) throws Exception;

	// 회원 탈퇴 D
	void deleteUser(String id) throws Exception;

	// 유저 목록 조회 RL
	List<User> selectList();
	
	// 비번 제외 유저 조회
	User selectByIdWoPw(String id) throws Exception;
	
}