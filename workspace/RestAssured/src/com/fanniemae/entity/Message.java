package com.fanniemae.entity;

import java.util.Date;

// data model for rest request 
/*
 * "messageId": 101
 *	"msg": "Hello There"
 *	"author": "Naveen"
*/
public class Message {
	private int messageId;
	private String msg;
	private String author; 
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Message(int messageId, String msg, String author, Date date) {
		super();
		this.messageId = messageId;
		this.msg = msg;
		this.author = author;
		this.date = date;
	}
	
	public Message(){}
	
}
