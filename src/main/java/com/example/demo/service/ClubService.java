package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ClubMapper;
import com.example.demo.model.ClubModel;

@Service
public class ClubService {
	@Autowired
	public ClubMapper mapper;
	
	public List<ClubModel> selectItem(){
		return mapper.selectItem();
	}
	
	public List<ClubModel> selectOne(ClubModel input){
		return mapper.selectOne(input);
	}

}
