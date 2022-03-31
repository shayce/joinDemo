package com.training.pms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.pms.model.Book;
import com.training.pms.model.Story;
import com.training.pms.repository.BookRepository;
import com.training.pms.repository.StoryRepository;

@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private StoryRepository storyrepository;

	@Transactional
	@Override
	public Book saveBook(Book book) {
		List<Story> storyList = new ArrayList<>();

		// create first story
		Story story1 = new Story();
		story1.setStoryName("Push Ki Rat");

		// create second story
		Story story2 = new Story();
		story2.setStoryName("Idgah");

		// create third story
		Story story3 = new Story();
		story3.setStoryName("Story Of Two Oxes");

		// add all story into storyList. Till here we have prepared data for
		// OneToMany
		storyList.add(story1);
		storyList.add(story2);
		storyList.add(story3);

		// Prepare data for ManyToOne
		story1.setBook(book);
		story2.setBook(book);
		story3.setBook(book);

		book.setStoryList(storyList);
		book = bookRepository.save(book);

		return book;

	}

	public Book findById(int bookId) {
		Optional<Book> book = bookRepository.findById(bookId);
		
		return book.get();
	}

}
