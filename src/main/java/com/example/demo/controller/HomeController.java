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

	// 내 클럽 목록, 클럽 만들기 가능
	@RequestMapping(value = "/myclub", method = RequestMethod.GET)
	public String myclub() {

		return "myclub";
	}

	// 클럽 페이지
	@RequestMapping(value = "/club_detail", method = RequestMethod.GET)
	public String club_detail() {

		return "club_detail";
	}

	// 클럽 앨범
	@RequestMapping(value = "/club_album", method = RequestMethod.GET)
	public String club_album() {

		return "club_album";
	}

	// 클럽 일정
	@RequestMapping(value = "/club_calendar", method = RequestMethod.GET)
	public String club_calendar() {

		return "club_calendar";
	}

	@RequestMapping(value = "/club_vote", method = RequestMethod.GET)
	public String club_vote() {

		return "club_vote";
	}

	// 클럽 멤버 찾기, 메세지 기능
	@RequestMapping(value = "/club_members", method = RequestMethod.GET)
	public String club_members() {

		return "club_members";
	}

	// 클럽 만들기 대분류선택
	@RequestMapping(value = "/create_club1", method = RequestMethod.GET)
	public String create_club1() {

		return "create_club1";
	}

	// 클럽 만들기 상세정보입력
	@RequestMapping(value = "/create_club2", method = RequestMethod.GET)
	public String create_club2() {

		return "create_club2";
	}

	// 클럽 회원 모집 페이지
	@RequestMapping(value = "/club_recruit", method = RequestMethod.GET)
	public String club_recruit() {

		return "club_recruit";
	}

	// 클럽 회원 모집 게시판
	@RequestMapping(value = "/recruit_board", method = RequestMethod.GET)
	public String recruit_board() {

		return "recruit_board";
	}

	// 클럽 회원 모집 글
	@RequestMapping(value = "/recruit_detail", method = RequestMethod.GET)
	public String recruit_detail() {

		return "recruit_detail";
	}

	// 클럽 지원한 회원들 보기
	@RequestMapping(value = "/apply_members", method = RequestMethod.GET)
	public String apply_members() {

		return "apply_members";
	}

	// 로그인 페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";

	}

	// 회원가입 페이지
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {

		return "register";
	}

	// 아이디, 비밀번호 찾기
	@RequestMapping(value = "/find_account", method = RequestMethod.GET)
	public String find_account() {

		return "find_account";
	}

	// 마이 페이지
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {

		return "mypage";
	}

	// 게시글 상세
	@RequestMapping(value = "/detail_board", method = RequestMethod.GET)
	public String detail_board() {

		return "detail_board";
	}

	// 커뮤니티 상세
	@RequestMapping(value = "/community_detail", method = RequestMethod.GET)
	public String community_detail() {

		return "community_detail";
	}

	// 커뮤니티
	@RequestMapping(value = "/community", method = RequestMethod.GET)
	public String community() {

		return "community";
	}

	// 글쓰기
	@RequestMapping(value = "/write_board", method = RequestMethod.GET)
	public String write_board() {

		return "write_board";
	}

	// 회원정보
	@RequestMapping(value = "/myinfo", method = RequestMethod.GET)
	public String myinfo() {

		return "myinfo";
	}

	// 프로필 수정
	@RequestMapping(value = "/setprofile", method = RequestMethod.GET)
	public String setprofile() {

		return "setprofile";
	}

	// 고객센터
	@RequestMapping(value = "/cs_center", method = RequestMethod.GET)
	public String cs_center() {

		return "cs_center";
	}

	// 내가 쓴 글 목록
	@RequestMapping(value = "/mypostings", method = RequestMethod.GET)
	public String mypostings() {

		return "mypostings";
	}

}