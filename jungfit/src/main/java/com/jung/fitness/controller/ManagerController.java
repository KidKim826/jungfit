package com.jung.fitness.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jung.fitness.model.dto.Manager;
import com.jung.fitness.model.service.ManagerService;
import com.jung.fitness.util.JWTUtil;

@RestController
@RequestMapping("/admin")
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private JWTUtil jwtUtil;

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@PostMapping("/manager")
	public ResponseEntity<Map<String, Object>> login(String managerId, String password) throws Exception {
		HttpStatus status = HttpStatus.BAD_REQUEST;

		HashMap<String, Object> result = new HashMap<>();
		Manager manager = managerService.login(managerId, password);
		try {
			if (manager.getManagerId() != null) {
				result.put("access-token", jwtUtil.createToken("id", manager.getManagerId()));
				result.put("message", SUCCESS);
				status = HttpStatus.ACCEPTED;
			} else {
				// 실패 했을 때 처리할거 써주기
			}
		} catch (Exception e) {
			result.put("message", FAIL);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<Map<String, Object>>(result, status);
	}

	@GetMapping("/manager")
	public ResponseEntity<String> logout(HttpSession session) {
		session.invalidate();
		return new ResponseEntity<String>("SESSIONQUIT", HttpStatus.OK);
	}

	// update 랑 updateform
	@PutMapping("/manager")
	public ResponseEntity<String> modify(Manager manager, String ckpw, String newpw) throws Exception {
		managerService.modifyManager(manager, ckpw, newpw);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

}
