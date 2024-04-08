package com.goodee.library.book.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.goodee.library.book.dto.BookDto;
import com.goodee.library.book.service.BookService;

@Controller
public class BookViewController {
	
	private static final Logger LOGGER =
			LogManager.getLogger(BookViewController.class);
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/book")
	public String bookList(BookDto dto, Model model) {
		LOGGER.info("도서 목록 화면 이동");
		// 전체 도서 개수 조회
		// 1. bookService 의존성 주입
		// 2. bookService : selectBookCount
		// 3. bookDao : selectBookCount
		// 4. 쿼리 : tbl_book 테이블 전체 데이터 개수 조회
		int totalData = bookService.selectBookCount(dto.getB_name());
		dto.setTotalData(totalData);
		List<BookDto> resultList = bookService.selectBookList(dto);
		model.addAttribute("resultList",resultList);
		model.addAttribute("paging",dto);
		return "book/list";
	}
	
	@GetMapping("/book/add")
	public String createBook() {
		LOGGER.info("도서 등록 화면 이동");
		return "book/add";
	}
}
