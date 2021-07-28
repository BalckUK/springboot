package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String name;
	private int age;

	@JsonProperty("phone_number")
	private String phoneNumber;

	public User() {
		this.name = null;
		this.age = 0;
		this.phoneNumber = null;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public User(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public User DefaultUser() {
		return new User("default", 0, "010-1111-2222");
	}

	@Override
	public String toString() {
		return name + " " + age+" "+phoneNumber;
	}
}
