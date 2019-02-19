package com.java.beans;

public class LibrarianBean {
private int id;
private int libno;
private String name,email,password;
private long mobile;
private String alternatemailid;

public LibrarianBean(String name2, String email2, String password2, String alternatemailid2, String password3, long mobile2) {}

public LibrarianBean(int id, String name, String email, String password, String alternatemailid2, String password2, long mobile) {
	super();
	this.id = id;
	this.libno = libno;
	this.name = name;
	this.email = email;
	this.password = password;
	this.mobile = mobile;
	this.alternatemailid = alternatemailid;
}
public LibrarianBean() {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.mobile = mobile;
	this.alternatemailid = alternatemailid;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getLibno() {
	return libno;
}
public void getLibno(int libno) {
	this.libno = libno;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getAlternatemailid() {
	return alternatemailid;
}
public void setAlternatemailid(String alternatemailid) {
	this.alternatemailid = alternatemailid;
}

}
