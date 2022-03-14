package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookkeep.entity.BookEntity;
import com.bookstore.bookkeep.service.IBookService;

/**
 * @author gstut
 *
 */
@RestController

public class BooksController {
	@Autowired
	IBookService bookService;
	
	@GetMapping("/")
	public String BookStore() {
		return "Welcome to the books store";
	}
	

	@PostMapping("/book")
	Integer createBook(@RequestBody BookEntity book) {
		Integer id = bookService.saveBook(book);
		System.out.println(id);
		return id;

	}

}
