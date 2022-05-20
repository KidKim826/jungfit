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

import com.jung.fitness.model.dto.TrainerReview;
import com.jung.fitness.model.service.TrainerReviewService;

@RestController
@RequestMapping("/review")
public class TrainerReviewController {
	@Autowired
	private TrainerReviewService tReviewService;

	@GetMapping("/trainer")
	public ResponseEntity<List<TrainerReview>> list(
			@RequestParam(defaultValue = "") String mode,
			@RequestParam(defaultValue = "") String keyword) {

		HashMap<String, String> params = new HashMap<String, String>();
		params.put("mode", mode);
		params.put("keyword", keyword);
		return new ResponseEntity<List<TrainerReview>>(tReviewService.getTReviewList(params), HttpStatus.OK);
	}

	@PostMapping("/trainer")
	public ResponseEntity<String> writeTReview(TrainerReview tReview) {
		tReviewService.writeTReview(tReview);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.CREATED);
	}

	// 상세조회
	@GetMapping("trainer/{id}")
	public ResponseEntity<TrainerReview> detail(@PathVariable int id) {
		return new ResponseEntity<TrainerReview>(tReviewService.readTReview(id), HttpStatus.OK);
	}

	// update
	@PutMapping("trainer/{id}")
	public ResponseEntity<String> updateTReview(@PathVariable int id, TrainerReview tReview) {
		tReviewService.modifyTReview(tReview);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

	// delete
	@DeleteMapping("trainer/{id}")
	public ResponseEntity<String> deleteTReview(@PathVariable int id) {
		tReviewService.removeTReview(id);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

}
