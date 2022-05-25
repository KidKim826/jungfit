package com.jung.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jung.fitness.exception.MessageNotFoundException;
import com.jung.fitness.model.dto.Message;
import com.jung.fitness.model.service.MessengerService;
import com.jung.fitness.model.service.UserService;


@RestController
@RequestMapping("/mailbox")
public class MessengerController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	//고민스러운건, get방식일때 아이디가 담겨서 좀 고민이긴한데 어떻게 하는것이 좋을꼬,,
	
	@Autowired
	private MessengerService messengerService;

	@Autowired
	private UserService userService;

	@GetMapping("/message/list/{id}") //통과
	public ResponseEntity<List<Message>> list(@PathVariable String id) {
		return new ResponseEntity<List<Message>>(messengerService.readListById(id), HttpStatus.OK);
	}

	@PostMapping("/message/send") //통과
	public ResponseEntity<String> send(Message message) {
		messengerService.sendMessage(message);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	@DeleteMapping("/message/{no}") //통과
	public ResponseEntity<String> delete(@PathVariable int no) {
		try{
			messengerService.deleteMessage(no);
		}catch (Exception e) {
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<String> (SUCCESS, HttpStatus.OK);
	}

	@GetMapping("/message/{no}") //통
	public ResponseEntity<Message> detail(@PathVariable int no) {
		messengerService.getMessage(no);
		return new ResponseEntity<Message> (messengerService.getMessage(no), HttpStatus.OK);
	}

}
