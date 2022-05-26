package com.jung.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jung.fitness.model.dto.Follower;
import com.jung.fitness.model.service.FollowerService;
import com.jung.fitness.model.service.UserService;

@RestController
@RequestMapping("/follower")
public class FollowerController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private FollowerService followerService;
	
	@PostMapping("/follow")
	public ResponseEntity<String> follow(String myId, String yourId){
		Follower f = new Follower(myId, yourId);
		followerService.followUser(f);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}
	
	@DeleteMapping("/follow")
	public ResponseEntity<String> unFollow(String myId, String yourId){
		Follower f = new Follower(myId, yourId);
		followerService.deleteFollower(f);
		return new ResponseEntity<String>("DELETE SUCCESS", HttpStatus.OK);
	}
	
	@GetMapping("/follow/follower/{id}")
	public ResponseEntity<List<Follower>> listFollower(@PathVariable String id){
		return new ResponseEntity<List<Follower>>( followerService.listFollower(id) ,HttpStatus.OK);
	}
	
	@GetMapping("/follow/following/{id}")
	public ResponseEntity<List<Follower>> listFollowing(@PathVariable String id){
		return new ResponseEntity<List<Follower>>( followerService.listFollowing(id) ,HttpStatus.OK);
	}
	
	
}
