package com.example.demo.model;

import lombok.Data;

@Data
public class MessageModel {
	private int messageno;
	private String from;
	private String to;
	private String content;
	private String date;
	private int member_memberno;
}
