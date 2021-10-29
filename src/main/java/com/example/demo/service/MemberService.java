package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.MemberModel;

@Service
public class MemberService {
	@Autowired
	public MemberMapper mapper;
	
	public List<MemberModel> selectItem(){
		return mapper.selectItem();
	}

}
