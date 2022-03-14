package com.bookstore.bookkeep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookkeep.entity.BookEntity;

@Service
public class BookServiceImpl implements IBookService{
	@Autowired
	IBookRepository bookRepository;
	@Override
	public Integer saveBook(BookEntity book) {
		BookEntity savedBook = bookRepository.save(book);
		return savedBook.getId();
	}

}
