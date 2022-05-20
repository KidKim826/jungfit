package com.jung.fitness.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoReview {
	private int reviewId;
	private String videoId;
	private String userId;
	private String title;
	private String regDate;
	private String content;
	private int viewCnt;
}
