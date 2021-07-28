package com.company.ioc;

public class Encoder {

	public String encode(String message) {
		return java.util.Base64.getEncoder().encodeToString(message.getBytes());
	}
}
