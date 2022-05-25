package com.jung.fitness.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jung.fitness.exception.PWIncorrectException;
import com.jung.fitness.exception.UserNotFoundException;
import com.jung.fitness.model.dao.UserDao;
import com.jung.fitness.model.dto.User;
import com.jung.fitness.util.SHA256;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	//등록(Create)
	@Override
	public void join(User user) throws Exception{
		// TODO Auto-generated method stub
		user.setPassword(new SHA256().getHash(user.getPassword()));
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		userDao.insertUser(user);
	}
	
	//조회 (Read)
	@Override
	public User login(String id, String pw) throws Exception {
		// TODO Auto-generated method stub
		User user = userDao.selectById(id);
		System.out.println(user);
		// id로 select해와서
		if(user == null)
			throw new UserNotFoundException();
		//그 user가 pw가 맞으면 통과
		if(!user.getPassword().equals(new SHA256().getHash(pw)))
			throw new PWIncorrectException();
		else
			return user;
	}

	//수정 (update)
	@Override
	public void modifyUser(User user, String ckpw, String newpw) throws Exception{
		// TODO Auto-generated method stub
		User originUser = userDao.selectById(user.getUserId());
		if(!originUser.getPassword().equals(new SHA256().getHash(ckpw)))
			throw new PWIncorrectException();
		else
		originUser.setPassword(new SHA256().getHash(newpw));
		originUser.setAddress(originUser.getAddress());
		originUser.setEmail(originUser.getEmail());
		originUser.setHeight(originUser.getHeight());
		originUser.setWeight(originUser.getWeight());
		//소개
		userDao.updateUser(originUser);
	}
	
	//삭제(Delete)
	@Override
	public void deleteUser(String id, String pw) throws Exception {
		// TODO Auto-generated method stub
		User user = userDao.selectById(id);
		System.out.println(user);
		// pw가 맞는 경우만 delete
		if(!user.getPassword().equals(new SHA256().getHash(pw)))
			throw new PWIncorrectException();
		else
			userDao.deleteUser(user.getUserId());
	}
	
	//조회 (Read all)
	@Override
	public List<User> readListUser() {
		// TODO Auto-generated method stub
		return userDao.selectList();
	}

	

}
