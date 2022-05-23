package com.jung.fitness.model.dao;

import java.util.List;

import com.jung.fitness.model.dto.Video;

public interface VideoDao {

	// create(만들기)
	void createVideo(Video video);

	// readList(전체)
	List<Video> seletVideoList(String part);

	// read(한개만)
	Video getVideoById(String videoId);

	// delete(삭제)
	void deleteVideo(String videoId);

	// update수정
	void updateVideo(Video video);
}
