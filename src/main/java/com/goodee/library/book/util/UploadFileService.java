package com.goodee.library.book.util;

import java.io.File;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileService {

	private static final Logger LOGGER =
			LogManager.getLogger(UploadFileService.class);
	
	public String upload(MultipartFile file) {
		LOGGER.info("파일을 서버에 저장");
		
		boolean result = false; // 판단의 기준점
		
		String origin = file.getOriginalFilename();
		String extension = origin.substring(origin.lastIndexOf("."),origin.length());
		UUID uuid = UUID.randomUUID();
		String change = uuid.toString().replaceAll("-", "");
		
		File savedFile = new File("C:\\library\\upload\\"+change+extension);
		
		if(savedFile.exists() == false) {
			savedFile.mkdir();
		}
		try {
			file.transferTo(savedFile);
			result = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(result == true) {
			return change+extension;
		}else {
			return null;
		}
	}
}
