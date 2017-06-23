package com.choa.member.student;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;

@Repository
public class StudentDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE="MemberMapper.";
	private final String NAMESPACE2="StudentMapper.";
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		int result = 0;
		
		int result1 = sqlSession.insert(NAMESPACE+"memberJoin", memberDTO);
		int result2 = sqlSession.insert(NAMESPACE2+"studentJoin", memberDTO);
		
		if(result1==1 && result2==1){
			result = 1;
		}
		
		return result;
	}
	
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE2+"studentLogin", memberDTO);
	}
}
