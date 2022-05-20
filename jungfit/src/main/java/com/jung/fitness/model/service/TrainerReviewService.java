package com.jung.fitness.model.service;

import java.util.HashMap;
import java.util.List;

import com.jung.fitness.model.dto.TrainerReview;

public interface TrainerReviewService {
	// 모든 비디오리뷰 조회
	List<TrainerReview> getTReviewList(HashMap<String, String> params);

	// 비디오 리뷰 조회 뷰카운트 증가
	TrainerReview readTReview(int id);

	// 비디오 리뷰 조회 뷰카운트 증가 x
	TrainerReview getTReviewById(int id);

	// 비디오 리뷰 C
	void writeTReview(TrainerReview tReview);

	// 비디오 리뷰 U
	void modifyTReview(TrainerReview tReview);

	// 비디오 리뷰 D
	void removeTReview(int id);

	// 뷰카운트 증가
	void updateCnt(int id);
}
