package com.DTO;

import javax.validation.constraints.NotEmpty;

public class RegistrationDTO {
    @NotEmpty(message="cannot be blank")
	private String name;
	private String username;
	private  char[] password;
	private String country;
	private String [] hobbies;
	private String gender;
	private communicationDTO communicationDto;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public communicationDTO getCommunicationDto() {
		return communicationDto;
	}
	public void setCommunicationDto(communicationDTO communicationDto) {
		this.communicationDto = communicationDto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
