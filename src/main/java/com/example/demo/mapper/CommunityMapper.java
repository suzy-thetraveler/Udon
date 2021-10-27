package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CommunityModel;

@Repository
@Mapper
public interface CommunityMapper {
	List<CommunityModel> selectItem();
}
