package com.choa.home;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.BeforeClass;
import org.junit.Test;

import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;


public class StudentDAOImplTest extends MyAbstract{

	@Inject
	private StudentDAOImpl studentDAOImpl;
	private static StudentDTO studentDTO;
	
	@Test
	public void test() throws Exception{
	
		int result = studentDAOImpl.memberJoin(studentDTO);
	
		assertEquals(1, result);
	}

	
	@BeforeClass
	public static void create(){
		
		String data = "data15";
		
		studentDTO = new StudentDTO();
		
		studentDTO.setId(data);
		studentDTO.setPw(data);
		studentDTO.setName(data);
		studentDTO.setAge(30);
		studentDTO.setGrade(data);
		studentDTO.setPhone(data);
		studentDTO.setSid(data);
		studentDTO.setTid(data);
		
	}
	
	
	
}
