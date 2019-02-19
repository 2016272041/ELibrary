package com.java.beans;

import java.sql.Date;

public class IssueBookBean {
private String callno,studentid,studentname;
private long studentmobile;
private char isbn;
private Date issueddate;
private String mailid;
private String returnstatus;

public IssueBookBean(String libno, String callno2, String studentid2, String studentname2, String studentmobile2, String studentemail) {}
public IssueBookBean() {
	super();
	this.callno = callno;
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentmobile = studentmobile;
	this.isbn = isbn;
	this.mailid = mailid;
	this.returnstatus = returnstatus;
}

public String getReturnstatus() {
	return returnstatus;
}
public void setReturnstatus(String returnstatus) {
	this.returnstatus = returnstatus;
}
public Date getIssueddate() {
	return issueddate;
}
public void setIssueddate(Date issueddate) {
	this.issueddate = issueddate;
}
public String getCallno() {
	return callno;
}
public void setCallno(String callno) {
	this.callno = callno;
}
public String getStudentid() {
	return studentid;
}
public void setStudentid(String studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public long getStudentmobile() {
	return studentmobile;
}
public void setStudentmobile(long studentmobile) {
	this.studentmobile = studentmobile;
}
public char getIsbn() {
	return isbn;
}
public void setIsbn(char isbn) {
	this.isbn = isbn;
}
public String mailid() {
	return mailid;
}
public void SetMailid(String mailid) {
	this.mailid = mailid;
}

}
