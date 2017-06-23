package com.choa.member.student;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class StudentServiceImpl implements MemberService{

	@Inject
	private StudentDAOImpl studentDAOImpl;
	
	@Override
	public int memberJoin(MemberDTO memberDTO, HttpSession session) throws Exception {
		
		String realPath = session.getServletContext().getRealPath("resources/upload");
		
		FileSaver fs = new FileSaver();
		
		String fileName = fs.fileSaver(realPath, memberDTO.getMf());
		
		memberDTO.setFilename(fileName);
		memberDTO.setOriname(memberDTO.getMf().getOriginalFilename());
		
		return studentDAOImpl.memberJoin(memberDTO);
	}
	
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		return studentDAOImpl.memberLogin(memberDTO);
	}
}
