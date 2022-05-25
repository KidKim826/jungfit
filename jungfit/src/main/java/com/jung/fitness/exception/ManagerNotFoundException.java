package com.jung.fitness.exception;

public class ManagerNotFoundException extends Exception {
	public ManagerNotFoundException() {
		super("관리자를 찾을 수 없습니다.");
	}
}
