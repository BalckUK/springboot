package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PostRequestDto;

@RestController
@RequestMapping("/api")
public class PostApiController {

	@PostMapping("/post")
	public void post(@RequestBody Map<String, Object> requestData) {
		requestData.entrySet().forEach(stringobjectEntry -> {
			System.out.println("key : " + stringobjectEntry.getKey());
			System.out.println("value : " + stringobjectEntry.getValue());
		});
	}

	// 더 간단하게 만든 코드
	@PostMapping("/post/simple")
	public void postsimple(@RequestBody Map<String, Object> requestData) {
		requestData.forEach((key, value) -> {
			System.out.println("keySimple : " + key);
			System.out.println("valueSimple : " + value);
		});
	}
	
	
	@RequestMapping("/post1")
	public void post1(@RequestBody PostRequestDto requestData) {
		System.out.println(requestData);
	}
}
