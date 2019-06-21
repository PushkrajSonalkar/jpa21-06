package com.example.demo.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.Role;
import com.example.demo.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService
{


	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book findBookById(int Id) {
		return bookRepository.findBookById(Id);
	}

	@Override
	public void saveBook(Book book)
	{
		  bookRepository.save(book);
		
	}
	@Override
	public Book findBookAll() {
		return bookRepository.findAllBooks();
		
	}
	
}
