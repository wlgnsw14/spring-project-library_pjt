package com.goodee.library.member.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goodee.library.member.dto.MemberDto;
import com.goodee.library.member.service.MemberService;

@Controller
public class MemberApiController {

	private static final Logger LOGGER =
			LogManager.getLogger(MemberApiController.class);
	
	@Autowired
	MemberService service;
	
	@ResponseBody
	@PostMapping("/join")
	public Map<String, String> joinMember(@RequestBody MemberDto dto) {
		LOGGER.info("회원가입 기능");
		// 1. 회원 정보 전달 받기(json)
		// 2. 회원 정보 데이터베이스 등록
		return service.createMember(dto);
		// 3. 회원 정보 등록 결과 view에 전달(json)
	}
	
	
	@ResponseBody
	@PostMapping("/login")
	public Map<String, String> login(@RequestBody MemberDto dto, HttpSession session){
		LOGGER.info("로그인 기능");
		return service.loginMember(dto, session);
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		LOGGER.info("로그아웃 기능");
		session.invalidate(); // 세션 무효화
		return "redirect:/";
	}
	
	@PostMapping("/member/{m_no}")
	@ResponseBody
	public Map<String, String> memberEdit(@RequestBody MemberDto dto, HttpSession session){
		LOGGER.info("회원 정보 수정 기능");
		return service.updateMember(dto, session);
	}
	
	
	@DeleteMapping("/member/{m_no}")
	@ResponseBody
	public Map<String, String> deleteMember(@PathVariable("m_no") long m_no, HttpSession session){
		LOGGER.info("회원 정보 삭제");
		return service.deleteMember(m_no, session);
	}
	
	
}
