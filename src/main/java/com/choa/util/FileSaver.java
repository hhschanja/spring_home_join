package com.choa.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileSaver {

	//첫번째 방법
	public String fileSaver(String oriname, String realPath, byte [] dataFile) throws Exception{
		
		String fileName = UUID.randomUUID().toString()+"_"+oriname; // upload 폴더에 저장할 랜덤 이름 생성
		
		File f = new File(realPath); //실제 경로와 파일 이름으로 길목을 생성
		
		if(!f.exists()){
			f.mkdirs();
		}
		
		File target = new File(f, fileName);
		
		FileCopyUtils.copy(dataFile, target); //바이트 단위로 쪼개진 실제 놈을 f로 저장하겠다
		
		return fileName;
	}
	
	//2번째 방법
	public String fileSaver(String realPath, MultipartFile multiFile) throws Exception{
		
		Calendar ca = Calendar.getInstance();
		
		String fileName = ca.getTimeInMillis()+"_"+multiFile.getOriginalFilename();
		
		File f = new File(realPath);
		if(!f.exists()){
			f.mkdirs();
		}
		
		File target = new File(f, fileName);
	
		multiFile.transferTo(target);
		
		return fileName;
	}
	
}
