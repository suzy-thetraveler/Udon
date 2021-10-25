package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RecruitController {

	// 클럽 회원 모집 페이지
	@RequestMapping(value = "/club_recruit", method = RequestMethod.GET)
	public String club_recruit() {

		return "content/club_recruit";
	}

	// 클럽 회원 모집 게시판
	@RequestMapping(value = "/recruit_board", method = RequestMethod.GET)
	public String recruit_board() {

		return "content/recruit_board";
	}

	// 클럽 회원 모집 글
	@RequestMapping(value = "/recruit_detail", method = RequestMethod.GET)
	public String recruit_detail() {

		return "content/recruit_detail";
	}

	// 클럽 지원한 회원들 보기
	@RequestMapping(value = "/apply_members", method = RequestMethod.GET)
	public String apply_members() {

		return "content/apply_members";
	}
}
