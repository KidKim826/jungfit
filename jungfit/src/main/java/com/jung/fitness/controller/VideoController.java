package com.jung.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jung.fitness.model.dto.Video;
import com.jung.fitness.model.service.VideoService;

@RestController
@RequestMapping("/video")
public class VideoController {

	@Autowired
	private VideoService videoService;

	// 조회 (부위별로)
	@GetMapping("/list/part/{part}")
	public ResponseEntity<List<Video>> list(@PathVariable String part) {
		return new ResponseEntity<List<Video>>(videoService.readVideoList(part), HttpStatus.OK);
	}

	// 비디오 아이디로 상세 조회
	@GetMapping("/list/{videoId}")
	public ResponseEntity<Video> detail(@PathVariable String videoId) {
		return new ResponseEntity<Video>(videoService.readVideoById(videoId), HttpStatus.OK);
	}

	// 삭제
	@DeleteMapping("/list/{videoId}")
	public ResponseEntity<String> delete(@PathVariable String videoId) {
		videoService.deleteVideo(videoId);
		return new ResponseEntity<String>("DELETE SUCCESS", HttpStatus.OK);
	}

	// 트레이너아이디로 비디오 목록 조회
	@GetMapping("/list/trainer-info/{trainerId}")
	public ResponseEntity<List<Video>> trainerVideo(@PathVariable String trainerId)	{
		return new ResponseEntity<List<Video>>(videoService.readVideoByTrainer(trainerId), HttpStatus.OK);
	}
}
