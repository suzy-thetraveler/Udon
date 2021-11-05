package com.example.demo.controller;

import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ClubModel;
import com.example.demo.model.MemberModel;
import com.example.demo.service.ClubService;
import com.example.demo.service.MemberService;

@Controller
public class ClubController {

	// 내 클럽 목록, 클럽 만들기 가능
	@RequestMapping(value = "/myclub", method = RequestMethod.GET)
	public ModelAndView myclub(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		
		List<ClubModel> clubList = clubService.selectItem();
		mav.addObject("clubList",clubList);
		mav.setViewName("content/myclub.html");
		
		return mav;
	}

	// 클럽 페이지
	@Autowired
	ClubService clubService;
	@Autowired
	MemberService memberService;

	@RequestMapping(value = "/club_detail", method = RequestMethod.GET)
		public ModelAndView club_detail(HttpServletRequest request, @RequestParam(value="clubno", required=false) int clubno) {
			ModelAndView mav = new ModelAndView();
			
			//ClubModel input = new ClubModel();//빌더패턴에 대한거 알아보기.
			//ClubModel input = new ClubModel(1, null, null, clubno);
			//빌더가 실행이 안되는 이유를 찾아야함
			
			//List<ClubModel> clubList = clubService.selectOne(input);
			//파라미터작업 이어가야함
			
			//mav.addObject("clubList",clubList);
			mav.setViewName("content/club_detail.html");

			return mav;
		}

	// 클럽 앨범
	@RequestMapping(value = "/club_album", method = RequestMethod.GET)
	public String club_album() {

		return "content/club_album";
	}

	// 클럽 일정
	@RequestMapping(value = "/club_calendar", method = RequestMethod.GET)
	public String club_calendar() {

		return "content/club_calendar";
	}

	@RequestMapping(value = "/club_vote", method = RequestMethod.GET)
	public String club_vote() {

		return "content/club_vote";
	}

	// 클럽 멤버 찾기, 메세지 기능
	@RequestMapping(value = "/club_members", method = RequestMethod.GET)
	public ModelAndView club_members(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		
		List<MemberModel> memberList = memberService.selectItem();
		mav.addObject("memberList",memberList);
		mav.setViewName("content/club_members.html");

		return mav;
	}

	// 클럽 만들기 대분류선택
	@RequestMapping(value = "/create_club1", method = RequestMethod.GET)
	public String create_club1() {

		return "content/create_club1";
	}

	// 클럽 만들기 상세정보입력
	@RequestMapping(value = "/create_club2", method = RequestMethod.GET)
	public String create_club2() {

		return "content/create_club2";
	}

}
