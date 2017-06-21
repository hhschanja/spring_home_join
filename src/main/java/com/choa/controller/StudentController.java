package com.choa.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

@Controller
@RequestMapping("/member/**")
public class StudentController {
	
	@Inject
	private StudentServiceImpl studentServiceImpl;
	
	@RequestMapping(value="memberJoin")
	public void memberJoin(){
		
	}
	
	@RequestMapping(value="studentJoin",method=RequestMethod.POST)
	public String studentJoin(StudentDTO studentDTO, Model model) throws Exception{
		
		int result = studentServiceImpl.memberJoin(studentDTO);

		String message = "실패";
		if(result>0){
			message = "성공";
		}
		
		model.addAttribute("message", message).addAttribute("path", "../");
		
		return "common/result";
	}
	
}
