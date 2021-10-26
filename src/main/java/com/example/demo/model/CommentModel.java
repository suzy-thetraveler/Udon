package com.example.demo.model;

import lombok.Data;

@Data
public class CommentModel {
	private int commentno;
	private String content;
	private int member_memberno;
	private String date;
	private int post_postno;

}
