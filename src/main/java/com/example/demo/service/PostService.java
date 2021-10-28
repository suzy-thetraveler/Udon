package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PostMapper;
import com.example.demo.model.PostModel;

@Service
public class PostService {
	@Autowired
	public PostMapper mapper;
	
	public List<PostModel> selectItem(){
		return mapper.selectItem();
	}
}
