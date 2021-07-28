package com.example.demo;

public class Encoder {

	public String encode(String message) {
		return java.util.Base64.getEncoder().encodeToString(message.getBytes());
	}
}
