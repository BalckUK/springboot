package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Component;

@Component
public class UrlEncoder implements IEconder {
	
	@Override
	public String encode(String message) {
		try {
			return URLEncoder.encode(message, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}