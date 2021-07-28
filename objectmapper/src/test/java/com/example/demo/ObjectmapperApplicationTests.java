package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class ObjectmapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("---------");

		// Text Json -> Object
		// Object -> Text Json

		var objectMapper = new ObjectMapper();

		// Object -> text
		// Object mapper가 get method를 활용한다
		var user = new User("steve", 10, "010-1111-2222");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);
		
		
		// text -> Object
		// object mapper 는 defalut 생서자를 필요로 한다
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);
	}

}
