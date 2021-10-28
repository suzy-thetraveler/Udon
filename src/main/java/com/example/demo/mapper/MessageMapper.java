package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MessageModel;

@Repository
@Mapper
public interface MessageMapper {
	List<MessageModel> selectItem();
}
