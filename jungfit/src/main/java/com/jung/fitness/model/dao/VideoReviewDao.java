package com.jung.fitness.model.dao;

import java.util.HashMap;
import java.util.List;

import com.jung.fitness.model.dto.VideoReview;

public interface VideoReviewDao {
	// 동영상 리뷰 리스트 조회
	List<VideoReview> selectList(HashMap<String, String> params);

	// 비디오 리뷰 R
	VideoReview selectOne(int id);

	// 비디오 리뷰 C 
	void insertVReview(VideoReview vReview);

	// 비디오 리뷰 U
	void updateVReview(VideoReview vReview);

	// 비디오 리뷰 D
	void deleteVReview(int id);
}
