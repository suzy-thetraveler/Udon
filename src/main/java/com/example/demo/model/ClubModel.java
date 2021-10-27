package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class ClubModel {
	private int clubno;
	private String name;
	private String des;
	private int member_memberno;
}
