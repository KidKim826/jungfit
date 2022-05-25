package com.jung.fitness.model.service;

import java.util.List;

import com.jung.fitness.model.dto.Message;

public interface MessengerService {
	// c (send)
	void sendMessage(Message message);

	// D
	void deleteMessage(int no);

	// 내 목록 조회
	List<Message> readListById(String id);
	
	//하나 상세 읽기
	Message getMessage(int no);

	// 읽음 처리
	void updateView(int no);
}
