package com.jung.fitness.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jung.fitness.model.dto.VideoReview;
import com.jung.fitness.model.service.VideoReviewService;


@RestController
@RequestMapping("/review")
public class VideoReviewController {

	@Autowired
	private VideoReviewService vReviewService;

	@GetMapping("/videoList/{videoId}")
	public ResponseEntity<List<VideoReview>> list(@PathVariable
			String videoId,
			@RequestParam(defaultValue = "") String mode,
			@RequestParam(defaultValue = "") String keyword) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("mode", mode);
		params.put("keyword", keyword);
		params.put("videoId", videoId);
		return new ResponseEntity<List<VideoReview>>(vReviewService.getVReviewList(params), HttpStatus.OK);
	}

	@PostMapping("/video")
	public ResponseEntity<String> writeVReview(VideoReview vReview) {
		vReviewService.writeVReview(vReview);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.CREATED);
	}

	// 상세조회
	@GetMapping("video/{id}")
	public ResponseEntity<VideoReview> detail(@PathVariable int id) {
		return new ResponseEntity<VideoReview>(vReviewService.readVReview(id), HttpStatus.OK);
	}

	// update
	@PutMapping("video/{id}")
	public ResponseEntity<String> updateVReview(@PathVariable int id, VideoReview vReview) {
		vReviewService.modifyVReview(vReview);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

	// delete
	@DeleteMapping("video/{id}")
	public ResponseEntity<String> deleteVReview(@PathVariable int id) {
		vReviewService.removeVReview(id);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

}
