package com.jung.fitness.model.service;

import java.util.List;

import com.jung.fitness.model.dto.Follower;

public interface FollowerService {
		//등록
		void followUser(Follower follower);
		
		//삭제
		void deleteFollower(Follower follower);
		
		//팔로워 목록 조회
		List<Follower> listFollower(String myId);
		
		//팔로잉 목록 조회
		List<Follower> listFollowing(String myId);
}
