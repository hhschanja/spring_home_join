package com.choa.home;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.BeforeClass;
import org.junit.Test;

import com.choa.member.teacher.TeacherDAOImpl;
import com.choa.member.teacher.TeacherDTO;

public class TeacherDAOImplTest extends MyAbstract{

	@Inject
	private TeacherDAOImpl teacherDAOImpl;
	private static TeacherDTO teacherDTO;
	
	@Test
	public void test() throws Exception{
		
		int result = teacherDAOImpl.memberJoin(teacherDTO);
		
		assertEquals(1, result);
	}

	
	@BeforeClass
	public static void create(){
		
		String data = "data99";
		
		teacherDTO = new TeacherDTO();
		
		teacherDTO.setId(data);
		teacherDTO.setPw(data);
		teacherDTO.setName(data);
		teacherDTO.setAge(30);
		teacherDTO.setGrade(data);
		teacherDTO.setSubject(data);
		teacherDTO.setTid(data);
	}
	
}
