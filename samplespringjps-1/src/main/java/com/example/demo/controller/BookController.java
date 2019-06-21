package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Book;
import com.example.demo.model.User;
import com.example.demo.service.BookService;

@Controller
public class BookController 
{

	/*
	 * @Autowired private BookService bookService;
	 * 
	 * @RequestMapping(value= {"/home/home"}, method=RequestMethod.GET) public
	 * ModelAndView retrive() { ModelAndView model = new ModelAndView(); Book book =
	 * bookService.findUserByEmail(auth.getName());
	 * 
	 * model.addObject("userName", user.getFirstname() + " " + user.getLastname());
	 * model.setViewName("home/home"); return model; }
	 */
}
