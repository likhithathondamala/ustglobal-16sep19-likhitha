package com.ustglobal.mail.dto;
import java.util.List;

public class UserResponse {
private int statuscode;
private String message;
private String description;
private List<User> user;


public List<User> getUser() {
	return user;
}
public void setUser(List<User> user) {
	this.user = user;
}
public int getStatuscode() {
	return statuscode;
}
public void setStatuscode(int statuscode) {
	this.statuscode = statuscode;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
