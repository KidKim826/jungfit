package com.jung.fitness.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {
	private String trainerId;
	private String password;
	private String name;
	private String email;
	private String info;
}
