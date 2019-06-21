package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;


@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Long> 
{

	 Book findBookById(int Id);
	 @Query("SELECT DISTINCT e.dept FROM Employee e")
	  List<String> findAllBook(Sort sort);
	Book findAllBooks();
}
