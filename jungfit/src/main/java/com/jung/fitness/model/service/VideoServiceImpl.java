package com.jung.fitness.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jung.fitness.model.dao.VideoDao;
import com.jung.fitness.model.dto.Video;

@Service("videoService")
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	private VideoDao videoDao;
	
	@Override
	public void uploadVideo(Video video) {
		videoDao.createVideo(video);
	}

	@Override
	public List<Video> readVideoList(String part) {
		// TODO Auto-generated method stub
		return videoDao.seletVideoList(part);
	}

	@Override
	public Video readVideoById(String videoId) {
		// TODO Auto-generated method stub
		this.updateViewCnt(videoId);
		return videoDao.getVideoById(videoId);
	}

	@Override
	public void deleteVideo(String videoId) {
		// TODO Auto-generated method stub
		videoDao.deleteVideo(videoId);
	}

	@Override
	public void updateViewCnt(String videoId) {
		// TODO Auto-generated method stub
		Video v = videoDao.getVideoById(videoId);
		v.setViewCnt(v.getViewCnt()+1);
		videoDao.updateVideo(v);
	}

	@Override
	public void modifyVideo(Video video) {
		// TODO Auto-generated method stub
		Video v = videoDao.getVideoById(video.getVideoId());
		v.setTitle(v.getTitle());
		videoDao.updateVideo(v);
	}

	@Override
	public List<Video> readVideoByTrainer(String trainerId) {	
		return videoDao.selectByTrainer(trainerId);
	}
}
