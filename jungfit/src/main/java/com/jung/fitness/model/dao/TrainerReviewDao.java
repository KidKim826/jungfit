package com.jung.fitness.model.dao;

import java.util.HashMap;
import java.util.List;

import com.jung.fitness.model.dto.TrainerReview;

public interface TrainerReviewDao {
	// 트레이너 리뷰 리스트 조회
	List<TrainerReview> selectList(HashMap<String, String> params);

	// 트레이너 리뷰 R
	TrainerReview selectOne(int id);

	// 트레이너 리뷰 C
	void insertTReview(TrainerReview tReview);

	// 트레이너 리뷰 U
	void updateTReview(TrainerReview tReview);

	// 트레이너 리뷰 D
	void deleteTReview(int id);
}
