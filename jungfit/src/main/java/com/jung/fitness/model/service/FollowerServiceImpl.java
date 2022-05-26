package com.jung.fitness.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jung.fitness.model.dao.FollowerDao;
import com.jung.fitness.model.dto.Follower;

@Service("followService")
public class FollowerServiceImpl implements FollowerService {
	
	@Autowired
	private FollowerDao followerDao;
	
	@Override
	public void followUser(Follower follower) {
		// TODO Auto-generated method stub
		followerDao.insertFollower(follower);
	}


	@Override
	public List<Follower> listFollower(String myId) {
		// TODO Auto-generated method stub
		return followerDao.selectFollower(myId);
	}

	@Override
	public List<Follower> listFollowing(String myId) {
		// TODO Auto-generated method stub
		return followerDao.selectFollowing(myId);
	}


	@Override
	public void deleteFollower(Follower follower) {
		// TODO Auto-generated method stub
		followerDao.deleteFollower(follower);
	}

	
}
