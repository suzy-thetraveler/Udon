package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ClubMapper;
import com.example.demo.model.ClubModel;

import lombok.extern.slf4j.Slf4j;


@Service
public class ClubService {
	@Autowired
	public ClubMapper mapper;
	
	
	public List<ClubModel> selectItem(){
		return mapper.selectItem();
	}
	
	public ClubModel selectOne(ClubModel input) throws Exception{
		return mapper.selectOne(input);
	}

}
