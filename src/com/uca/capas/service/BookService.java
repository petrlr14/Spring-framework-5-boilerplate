package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Book;

public interface BookService {
	
	public List<Book> findAll();
	public List<Book> findBy(String parameter, String type);
	public List<Book> findByAutor(String autor);
	public List<Book> findByISBN(String ISBN);
	public List<Book> findByGenero(String genero);
	public String distBooks();
	public String distAutors();
	
}
