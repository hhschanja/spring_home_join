package com.choa.controller;

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
	
	
}
