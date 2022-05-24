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

import com.jung.fitness.model.dto.User;
import com.jung.fitness.model.service.UserService;
import com.jung.fitness.util.JWTUtil;

@RestController
@RequestMapping("/jung")
public class UserController { // 여기는 그냥 일반 회원

	@Autowired
	private UserService userService;

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private JWTUtil jwtUtil;
	// Rest
	// GET / DELETE / PUT / POST가능
	// 밑에서 경로 매핑 하면되고

	// 필요한거
	// login이랑 login form보내주는거
	// loginstart에서 login main으로 (loginform / login)
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@PostMapping("/user")
	public ResponseEntity<Map<String, Object>> login(String userId, String password) throws Exception{
		HttpStatus status = HttpStatus.BAD_REQUEST;
		
		HashMap<String, Object> result = new HashMap<>();
		User user = userService.login(userId, password);
		try {	
				if (user.getUserId() != null) {
				result.put("access-token", jwtUtil.createToken("id", user.getUserId()));
				result.put("message", SUCCESS);
				status = HttpStatus.ACCEPTED;
				}else {
				//실패 했을 때 처리할거 써주기
				}
		}catch(Exception e) {
			result.put("message", FAIL);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<Map<String,Object>>(result, status);
	}

	// logout
	// logout하는거
	@GetMapping("/user")
	public ResponseEntity<String> logout(HttpSession session) {
		session.invalidate();
		return new ResponseEntity<String>("SESSIONQUIT", HttpStatus.OK);
	}

	// update 랑 updateform
	@PutMapping("/user")
	public ResponseEntity<String> modify(User user, String ckpw, String newpw) throws Exception {
		userService.modifyUser(user, ckpw, newpw);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

	// delete
	@PostMapping("/user/withdraw")
	public ResponseEntity<String> delete(HttpSession session, String userId, String password) {
		try {
			userService.deleteUser(userId, password);
			session.invalidate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

	// join /회원가입 (joingform / join)
	@PostMapping("/user/join")
	public ResponseEntity<String> createUser(User user) throws Exception {
		userService.join(user);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.CREATED);// 201번
	}

}
