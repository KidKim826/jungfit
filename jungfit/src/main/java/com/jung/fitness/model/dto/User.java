package com.jung.fitness.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int seq;
	private String userId;
	private String password;
	private String name;
	private String email;
	private String address;
	private float bmi;
	private int height;
	private int weight;
	private int age;
	private int membership;
	private String trainerId;
}
