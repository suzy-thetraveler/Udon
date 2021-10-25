package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	//메인페이지
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String Home(HttpServletRequest request) {

		return "content/main";
	}

	
	// 로그인 페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "content/login";

	}

	// 회원가입 페이지
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {

		return "content/register";
	}

	// 아이디, 비밀번호 찾기
	@RequestMapping(value = "/find_account", method = RequestMethod.GET)
	public String find_account() {

		return "content/find_account";
	}

	// 마이 페이지
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {

		return "content/mypage";
	}


	// 회원정보
	@RequestMapping(value = "/myinfo", method = RequestMethod.GET)
	public String myinfo() {

		return "content/myinfo";
	}

	// 프로필 수정
	@RequestMapping(value = "/setprofile", method = RequestMethod.GET)
	public String setprofile() {

		return "content/setprofile";
	}

	// 고객센터
	@RequestMapping(value = "/cs_center", method = RequestMethod.GET)
	public String cs_center() {

		return "content/cs_center";
	}

	// 내가 쓴 글 목록
	@RequestMapping(value = "/mypostings", method = RequestMethod.GET)
	public String mypostings() {

		return "content/mypostings";
	}

}
