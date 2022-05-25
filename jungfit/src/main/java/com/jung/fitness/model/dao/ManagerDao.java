package com.jung.fitness.model.dao;

import com.jung.fitness.model.dto.Manager;

public interface ManagerDao {
	//R
	Manager selectById(String id) throws Exception;
	//U
	void updateManager(Manager manager) throws Exception;
}
