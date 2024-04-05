package com.goodee.library.book.dao;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.goodee.library.book.dto.BookDto;

@Repository
public class BookDao {
	
	private static final Logger LOGGER =
			LogManager.getLogger(BookDao.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "com.goodee.library.bookMapper.";

	public int createBook(BookDto dto) {
		int result = 0;
		try {
			result = sqlSession.insert(namespace+"createBook",dto);
		} catch(Exception e) {
			StringWriter errors = new StringWriter();
	        e.printStackTrace(new PrintWriter(errors));
	        LOGGER.error(errors.toString());
		}
		return result;
	}

}
