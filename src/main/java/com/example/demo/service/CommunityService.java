package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CommunityMapper;
import com.example.demo.model.CommunityModel;

@Service
public class CommunityService {
	@Autowired
	public CommunityMapper mapper;

	public List<CommunityModel> selectItem() {
		return mapper.selectItem();
	}
}
