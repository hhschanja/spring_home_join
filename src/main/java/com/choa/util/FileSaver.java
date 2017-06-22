package com.choa.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class FileSaver {

	public String fileSaver(String oriname, String realPath, byte [] dataFile) throws Exception{
		
		String fileName = UUID.randomUUID().toString()+"_"+oriname; // upload 폴더에 저장할 랜덤 이름 생성
		
		File f = new File(realPath, fileName); //실제 경로와 파일 이름으로 길목을 생성
		
		if(!f.exists()){
			f.mkdirs();
		}
		
		FileCopyUtils.copy(dataFile, f); //바이트 단위로 쪼개진 실제 놈을 f로 저장하겠다
		
		return fileName;
	}
	
}
