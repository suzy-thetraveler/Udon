package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MessageMapper;
import com.example.demo.model.MessageModel;

@Service
public class MessageService {
	@Autowired
	public MessageMapper mapper;
	
	public List<MessageModel> selectItem(){
		return mapper.selectItem();
	}
}
