package com.jung.fitness.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jung.fitness.model.dao.TrainerReviewDao;
import com.jung.fitness.model.dto.TrainerReview;
import com.jung.fitness.model.dto.VideoReview;

@Service
public class TrainerReviewServiceImpl implements TrainerReviewService {

	@Autowired
	private TrainerReviewDao tReviewDao;

	@Override
	public List<TrainerReview> getTReviewList(HashMap<String, String> params) {
		return tReviewDao.selectList(params);
	}

	@Override
	public TrainerReview readTReview(int id) {
		this.updateCnt(id);
		return tReviewDao.selectOne(id);
	}

	@Override
	public TrainerReview getTReviewById(int id) {
		return tReviewDao.selectOne(id);
	}

	@Override
	public void writeTReview(TrainerReview tReview) {
		tReviewDao.insertTReview(tReview);
	}

	@Override
	public void modifyTReview(TrainerReview tReview) {
		TrainerReview origintr = tReviewDao.selectOne(tReview.getReviewId());
		origintr.setTitle(tReview.getTitle());
		origintr.setContent(tReview.getContent());
		tReviewDao.updateTReview(origintr);
	}

	@Override
	public void removeTReview(int id) {
		tReviewDao.deleteTReview(id);
	}

	@Override
	public void updateCnt(int id) {
		TrainerReview tr = tReviewDao.selectOne(id);
		tr.setViewCnt(tr.getViewCnt() + 1);
		tReviewDao.updateTReview(tr);
	}

}
