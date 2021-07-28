package com.company.ioc;

public class Main {
	public static void main(String[] args) {
		String url = "www.naver,com/books/it?page=10&size=206&name=spring-boot";
		
		
		//Base 64 enconding
		IEconder encoder = new Base64Encoder();
		String result = encoder.encode(url);
		System.out.println(result);
		
		
		//url encodring
		IEconder urlencoder = new UrlEncoder();
		String urlResult = urlencoder.encode(url);
		System.out.println(urlResult);
		
		
	}
}
