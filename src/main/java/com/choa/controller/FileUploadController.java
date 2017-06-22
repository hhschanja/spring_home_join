package com.choa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.choa.util.FileSaver;

@Controller
public class FileUploadController {

	
	//첫번째 방법
	@RequestMapping(value="/fileUpload",method=RequestMethod.POST)
	public void fileUpload(String name, MultipartHttpServletRequest multiRequest)throws Exception{
		
		String realPath = multiRequest.getSession().getServletContext().getRealPath("resources/upload"); //멀티 리퀘스트에서 실제경로 들고오기
		
		MultipartFile mf = multiRequest.getFile("f1"); //파라미터 이름으로 멀티리퀘스트에서 파라미터 이름에 해당하는 멀티파일 찾아온 다음에
		byte [] dataFile = mf.getBytes(); //그놈의 전체를 들고오기
		
		String oriname = mf.getOriginalFilename(); //saver로 보내기도 하고 DB에 넣기도 하고
		
		FileSaver fs = new FileSaver();
		
		String filename = fs.fileSaver(oriname, realPath, dataFile); //파일 name을 받아서 DB에 set하면되지
	}
	
}
