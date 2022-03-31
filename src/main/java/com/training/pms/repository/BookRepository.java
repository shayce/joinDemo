package com.training.pms.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.pms.model.Book;


@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
	
}
