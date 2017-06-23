package com.choa.member.teacher;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class TeacherServiceImpl implements MemberService{

	@Inject
	private TeacherDAOImpl teacherDAOImpl;
	
	@Override
	public int memberJoin(MemberDTO memberDTO, HttpSession session) throws Exception {
		
		String realPath = session.getServletContext().getRealPath("resources/upload");
		
		FileSaver f = new FileSaver();
		
		String fileName = f.fileSaver(realPath, memberDTO.getMf());
		
		memberDTO.setFilename(fileName);
		memberDTO.setOriname(memberDTO.getMf().getOriginalFilename());
		
		return teacherDAOImpl.memberJoin(memberDTO);
	}
	
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		return teacherDAOImpl.memberLogin(memberDTO);
	}
}
