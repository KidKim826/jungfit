package com.jung.fitness.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {
	private String videoId;
	private String title;
	private String part;
	private int viewCnt;
	private String trainerId;
}
