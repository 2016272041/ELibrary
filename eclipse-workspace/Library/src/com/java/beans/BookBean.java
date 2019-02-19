package com.java.beans;

public class BookBean {
	private String isbn,callno,name,author,publisher,refno;
	int quantity;
	private int issued;
	
public BookBean(String callno2, String name2, String author2, String publisher2, String publisher3, int quantity2) {
	super();
}
public BookBean(Object object, Object object2, Object object3, Object object4, int i) {
	super();
	this.isbn = isbn;
	this.callno = callno;
	this.name =name;
	this.author =author;
	this.publisher = publisher;
	this.quantity = quantity;
}
public String getisbn() {
	return isbn;
}
public String getcallno() {
	return callno;
}
public String getname() {
	return name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author; 	
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getIssued() {
	return issued;
}
public void setIssued(int issued) {
	this.issued = issued;
}
public String getCallno() {
	// TODO Auto-generated method stub
	return null;
}
	
}
