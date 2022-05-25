package com.jung.fitness.model.dao;

import java.util.List;

import com.jung.fitness.model.dto.Message;

public interface MessengerDao {
	//c (send)
	void createMessage(Message message);
	//D 
	void deleteMessage(int no);
	//내 목록 조회
	List<Message> selectListById(String id);
	//하나만 상세 조회
	Message getMessageByNo(int no);
	//업데이트
	void updateMessage(Message message);
	//리스트를 조회할때, 이름에 따라서,,,?
}
