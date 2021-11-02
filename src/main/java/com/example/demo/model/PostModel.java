package com.example.demo.model;

import lombok.Data;

@Data
public class PostModel {
	private int postno;
	private String title;
	private String writer;
	private String sort;
	private String date;
	private String content;
	private int community_commno;
	private int member_memberno;
	private int like;
	private int hit;
	private int c_num;//댓글수
}
