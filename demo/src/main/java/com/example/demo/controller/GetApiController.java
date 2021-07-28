package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.dto.UserRequest;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

	// 현재 최신 방식
	@GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
	public String getHello() {
		return "get Hello";
	}

	// 예전에 사용하는 방식
	// get방식 http://localhost:9090/api/get/hi
	@RequestMapping(path = "/hi", method = RequestMethod.GET) // 모든 메소드가 매핑이 된다 get,put,post 등등
	public String hi() {
		return "hi";
	}

	// http://locahost:9090/api/get/path-variable/{name}
	@GetMapping("/path-variable/{name}")
	// 매개변수에서 두개의 매개변수중 하나는 path값을 사용하을 하늑 것인데 이름이 겹친다면 이러한 식으로 사용 할 수 있다
	public String pathVariable(@PathVariable(name = "name") String PathName, String name) {
		System.out.println("PathVariable : " + PathName);
		return PathName;
	}

	// http://localhost:9090/api/get/query-param?user=steve&email=haga5032@naver.com&age=25
	@GetMapping(path = "query-param")
	public String queryParam(@RequestParam Map<String, String> queryParam) {

		StringBuilder sb = new StringBuilder();
		queryParam.entrySet().forEach(entry -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("\n");

			sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
		});

		return sb.toString();
	}

	@GetMapping("query-param02")
	public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
		System.out.println(name + " " + email + " " + age);
		return name+" "+email+" "+age;
	}
	
	@GetMapping("query-param03")
	public String queryParam03(UserRequest userRequest) {
		System.out.println(userRequest.getName() + " " + userRequest.getEmail() + " " + userRequest.getAge());
		return userRequest.toString();
	}

}
