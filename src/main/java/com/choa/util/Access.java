package com.choa.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.choa.member.MemberDTO;

public class Access extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("controller 전");
/*		boolean check = false;
		if(((MemberDTO)(request.getSession().getAttribute("member"))).getGrade()=="teacher"){
			check = true;
		}
		return check;*/
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("컨트롤러 후 ");
		
		if(((MemberDTO)(request.getSession().getAttribute("member"))).getGrade()=="student"){
			modelAndView.setViewName("member/student");
		}
		System.out.println(((MemberDTO)(request.getSession().getAttribute("member"))).getGrade());
		System.out.println("주소 변경 완료");
		
	}
	
}
