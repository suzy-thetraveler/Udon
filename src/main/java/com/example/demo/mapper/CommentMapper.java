package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CommentModel;

@Repository
@Mapper
public interface CommentMapper {
	List<CommentModel> selectItem();
	
	List<CommentModel> selectOne(CommentModel input);
}
