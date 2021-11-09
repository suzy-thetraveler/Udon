package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ClubMapper;
import com.example.demo.model.ClubModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClubService {
	@Autowired
	public ClubMapper mapper;
	@Autowired
	SqlSession sqlSession;
	
	public List<ClubModel> selectItem(){
		return mapper.selectItem();
	}
	
	public ClubModel selectOne(ClubModel input) throws Exception{
		ClubModel result =null;
		
		try {
			result = sqlSession.selectOne("mapper.selectOne", input);
			
			if(result == null) {
				throw new NullPointerException("result=null");
			}			
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		return result;
	}

}
