package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ClubModel;

@Repository
@Mapper
public interface ClubMapper {
	List<ClubModel> selectItem();
	
	ClubModel selectOne(ClubModel input);
}
