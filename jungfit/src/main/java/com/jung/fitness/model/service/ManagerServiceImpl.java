package com.jung.fitness.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jung.fitness.exception.ManagerNotFoundException;
import com.jung.fitness.exception.PWIncorrectException;
import com.jung.fitness.model.dao.ManagerDao;
import com.jung.fitness.model.dto.Manager;
import com.jung.fitness.util.SHA256;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao managerDao;

	@Override
	public Manager login(String id, String pw) throws Exception {
		// TODO Auto-generated method stub
		Manager manager = managerDao.selectById(id);
		System.out.println(manager);
		// id로 select해와서
		if (manager == null)
			throw new ManagerNotFoundException();
		// 그 user가 pw가 맞으면 통과
		if (!manager.getPassword().equals(new SHA256().getHash(pw)))
			throw new PWIncorrectException();
		else
			return manager;
	}

	@Override
	public void modifyManager(Manager manager, String ckpw, String newpw) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Manager originManager = managerDao.selectById(manager.getManagerId());
				if(!originManager.getPassword().equals(new SHA256().getHash(ckpw)))
					throw new PWIncorrectException();
				else
				originManager.setPassword(new SHA256().getHash(newpw));
				originManager.setEmail(originManager.getEmail());
				originManager.setOfficeNum(originManager.getOfficeNum());
				originManager.setPosition(originManager.getPosition());
				//소개
				managerDao.updateManager(originManager);
	}

}
