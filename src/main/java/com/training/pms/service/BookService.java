package com.training.pms.service;

import org.springframework.stereotype.Component;

import com.training.pms.model.Book;

@Component
public interface BookService {
	public Book saveBook(Book book);
	public Book findById(int bookId);
}
