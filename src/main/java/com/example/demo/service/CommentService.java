package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CommentMapper;
import com.example.demo.model.CommentModel;


@Service
public class CommentService {
	@Autowired
	public CommentMapper mapper;
	
	public List<CommentModel> selectItem(){
		return mapper.selectItem();
	}
	
	public CommentModel selectOne(CommentModel input) {
		return mapper.selectOne(input);
	}
	
}
