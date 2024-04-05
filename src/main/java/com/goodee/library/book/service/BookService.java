package com.goodee.library.book.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodee.library.book.dao.BookDao;
import com.goodee.library.book.dto.BookDto;

@Service
public class BookService {
	
	private static final Logger LOGGER =
			LogManager.getLogger(BookService.class);
	
	@Autowired
	BookDao bookDao;

	public int createBook(BookDto dto) {
		return bookDao.createBook(dto);
	}
	
	
	
}
