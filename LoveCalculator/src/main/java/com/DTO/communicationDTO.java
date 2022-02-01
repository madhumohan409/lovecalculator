package com.DTO;

public class communicationDTO {
	private String email = "madhu@123";
	public Phone phone;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "communicationDTO [email=" + email + ", phone=" + phone + "]";
	}

	

	

}
