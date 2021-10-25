package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClubController {
	
	// 내 클럽 목록, 클럽 만들기 가능
		@RequestMapping(value = "/myclub", method = RequestMethod.GET)
		public String myclub() {

			return "content/myclub";
		}

		// 클럽 페이지
		@RequestMapping(value = "/club_detail", method = RequestMethod.GET)
		public String club_detail() {

			return "content/club_detail";
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
		public String club_members() {

			return "content/club_members";
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