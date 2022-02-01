package com.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message = " *user name shoud not be blank")
	@Size(min = 3, max = 15, message = "userName should be 3 to 15 chars")
	private String userName;
	@NotBlank(message = "crushName should not be blank")
	@Size(min = 3, max = 15, message = "crushName should be 3 to 15 letters")
	private String crushName;
	@AssertTrue(message = "you have to agree terms and conditions")

	private boolean termsAndConditions;
	

	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(boolean termsConditions) {
		this.termsAndConditions = termsConditions;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
