package com.jung.fitness.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jung.fitness.model.dao.MessengerDao;
import com.jung.fitness.model.dao.UserDao;
import com.jung.fitness.model.dto.Message;

@Service("messengerService")
public class MessengerServiceImpl implements MessengerService{
	
	@Autowired
	private MessengerDao messengerDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		messengerDao.createMessage(message);
	}

	@Override
	public void deleteMessage(int no) {
		// TODO Auto-generated method stub
		messengerDao.deleteMessage(no);
	}

	@Override
	public List<Message> readListById(String id) { //여기서의 id는 받은 사람꺼
		// TODO Auto-generated method stub
		return messengerDao.selectListById(id);
	}

	@Override
	public void updateView(int no) {
		// TODO Auto-generated method stub
		Message m = messengerDao.getMessageByNo(no);
		m.setView(1);
		messengerDao.updateMessage(m);
	}

	@Override
	public Message getMessage(int no) {
		// TODO Auto-generated method stub
		this.updateView(no);
		return messengerDao.getMessageByNo(no);
	}

}
