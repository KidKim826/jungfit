package com.jung.fitness.model.dao;

import java.util.List;

import com.jung.fitness.model.dto.Follower;

public interface FollowerDao {
	//등록
	void insertFollower(Follower follower);
	
	//삭제
	void deleteFollower(Follower follower);
	
	//팔로워 목록 조회
	List<Follower> selectFollower(String myId);
	
	//팔로잉 목록 조회
	List<Follower> selectFollowing(String myId);
	
}
