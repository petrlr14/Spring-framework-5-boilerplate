package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Book;
import com.uca.capas.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/all", method = RequestMethod.POST)
	public ModelAndView findAll() {
		ModelAndView view=new ModelAndView();
		List<Book> books=bookService.findAll();
		view.addObject("books", books);
		view.setViewName("all");
		view.addObject("count", bookService.distBooks());
		view.addObject("autores", bookService.distAutors());
		return view;
	}
	
	@RequestMapping(value="/get", method=RequestMethod.POST)
	public ModelAndView findBy(@RequestParam String selection, @RequestParam String searchQuery) {
		ModelAndView view=new ModelAndView();
		view.setViewName("by");
		selection=selection.equals("GÃ©nero")?"G&eacute;nero":selection;
		List<Book> books=bookService.findBy(searchQuery, selection);
		view.addObject("books", books);
		view.addObject("count", books.size());
		view.addObject("search", searchQuery);
		System.out.println();
		view.addObject("type", selection);
		return view;
	}

}
