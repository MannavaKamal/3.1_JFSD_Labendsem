package com.klef.jfsd.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class model1 {
	@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
private String name;
private String email;
private String address;
private long phonenum;
private String dob;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhonenum() {
	return phonenum;
}
public void setPhonenum(long phonenum) {
	this.phonenum = phonenum;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}



}
