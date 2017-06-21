package com.choa.member.teacher;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;

@Service
public class TeacherServiceImpl implements MemberService{

	@Inject
	private TeacherDAOImpl teacherDAOImpl;
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
