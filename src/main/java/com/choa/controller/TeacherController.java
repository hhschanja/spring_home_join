package com.choa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choa.member.MemberDTO;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

@Controller
@RequestMapping("/member/**")
public class TeacherController {
	
	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	@RequestMapping(value="teacherJoin", method = RequestMethod.POST)
	public String teacherJoin(TeacherDTO teacherDTO,Model model,HttpSession session) throws Exception{
		
		int result = teacherServiceImpl.memberJoin(teacherDTO,session);

		String message = "실패";
		if(result>0){
			message = "성공";
		}
		
		model.addAttribute("message", message).addAttribute("path", "../");
		
		return "common/result";
	}
	
	@RequestMapping(value="teacherLogin",method=RequestMethod.POST)
	public String teacherLogin(MemberDTO memberDTO, HttpSession session) throws Exception{
		MemberDTO memberDTO2 = teacherServiceImpl.memberLogin(memberDTO, session);
		
		if(memberDTO2!=null){
			session.setAttribute("member", memberDTO2);
		}
		
		return "redirect:/";
		
	}
}
