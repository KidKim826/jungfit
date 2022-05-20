package com.jung.fitness.model.service;

import java.util.HashMap;
import java.util.List;

import com.jung.fitness.model.dto.VideoReview;

public interface VideoReviewService {
	// 모든 비디오리뷰 조회
	List<VideoReview> getVReviewList(HashMap<String, String> params);

	// 비디오 리뷰 조회 뷰카운트 증가
	VideoReview readVReview(int id);

	// 비디오 리뷰 조회 뷰카운트 증가 x
	VideoReview getVReviewById(int id);

	// 비디오 리뷰 C
	void writeVReview(VideoReview vReview);

	// 비디오 리뷰 U
	void modifyVReview(VideoReview vReview);

	// 비디오 리뷰 D
	void removeVReview(int id);

	// 뷰카운트 증가
	void updateCnt(int id);
}
