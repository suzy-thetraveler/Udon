package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PostModel;

@Repository
@Mapper
public interface PostMapper {
	List<PostModel> selectItem();
	
	List<PostModel> selectOne(PostModel input);
}
