package com.choa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/member/**")
public class MemberController {

	
	@RequestMapping(value="memberJoin")
	public void memberJoin(){
		
	}
	
	@RequestMapping(value="memberLogin")
	public void memberLogin(){
		
	}
	
	@RequestMapping(value="memberMypage")
	public void memberMypage(){
		
	}
	
	@RequestMapping(value="memberLogout")
	public String memberLogout(HttpSession session){
		session.invalidate();
		
		return "redirect:/";
	}
	
}
