package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

	// text
	@GetMapping("/text")
	public String text(@RequestParam String account) {
		return account;
	}

	// req요청이되면 -> object mapper가 ->object로 변경을 해줌 -> method로 이동함
	// ->object로 변경되고 -> objcet mapper가 -> json형태로 변경해줌
	// json
	@PostMapping("/json")
	public User json(@RequestBody User user) {
		return user;
	}

	
	//ResonseEntiy
	//응답을 커스텀마이징하는 코드
	@PutMapping("/put")
	public ResponseEntity<User> User_put(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}

}
