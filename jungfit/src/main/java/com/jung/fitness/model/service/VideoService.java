package com.jung.fitness.model.service;

import java.util.HashMap;
import java.util.List;

import com.jung.fitness.model.dto.Video;

public interface VideoService {

	// 만들기
	void uploadVideo(Video video);

	// 목록 조회 //부위별 목록 조회
	List<Video> readVideoList(String part);

	// 한개만 조회
	Video readVideoById(String videoId);

	// 삭제
	void deleteVideo(String videoId);

	// viewCnt업데이트
	void updateViewCnt(String videoId);

	// 수정
	void modifyVideo(Video video);
	
	// 트레이너로 조회
	List<Video> readVideoByTrainer(String trainerId);
	
}
