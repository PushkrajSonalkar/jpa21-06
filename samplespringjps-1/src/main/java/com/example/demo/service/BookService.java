package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService 
{  
	public Book findBookById(int Id);
		 
	public void saveBook(Book book);


	public Book findBookAll();
	
}
