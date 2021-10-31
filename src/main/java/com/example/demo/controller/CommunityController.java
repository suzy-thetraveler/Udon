package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.MemberModel;
import com.example.demo.model.PostModel;
import com.example.demo.service.PostService;

@Controller
public class CommunityController {

	@Autowired
	PostService postService;
	
	// 게시글 상세
	@RequestMapping(value = "/detail_board", method = RequestMethod.GET)
	public ModelAndView detail_board(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		
		List<PostModel> postList = postService.selectItem();
		mav.addObject("postList", postList);
		mav.setViewName("content/detail_board");
		
		return mav;
	}
	

	// 커뮤니티 상세
	@RequestMapping(value = "/community_detail", method = RequestMethod.GET)
	public String community_detail() {

		return "content/community_detail";
	}

	// 커뮤니티
	@RequestMapping(value = "/community", method = RequestMethod.GET)
	public String community() {

		return "content/community";
	}

	// 글쓰기
	@RequestMapping(value = "/write_board", method = RequestMethod.GET)
	public String write_board() {

		return "content/write_board";
	}

}
