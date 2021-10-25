package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommunityController {

	// 게시글 상세
	@RequestMapping(value = "/detail_board", method = RequestMethod.GET)
	public String detail_board() {

		return "content/detail_board";
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
