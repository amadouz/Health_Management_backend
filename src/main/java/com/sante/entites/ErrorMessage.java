package com.sante.entites;

import java.util.Date;

public class ErrorMessage {

	private Date dateJr;
	private String message;
	public ErrorMessage(Date dateJr, String message) {
		super();
		this.dateJr = dateJr;
		this.message = message;
	}
	public Date getDateJr() {
		return dateJr;
	}
	public void setDateJr(Date dateJr) {
		this.dateJr = dateJr;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
