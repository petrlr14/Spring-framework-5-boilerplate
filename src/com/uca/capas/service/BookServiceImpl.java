package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDAO;
	
	@Override
	public List<Book> findAll() {
		return bookDAO.findAll();
	}

	@Override
	public List<Book> findByAutor(String autor) throws DataAccessException {
		return bookDAO.findByAutor(autor);
	}

	@Override
	public List<Book> findByISBN(String ISBN) throws DataAccessException {
		return bookDAO.findByISBN(ISBN);
	}

	@Override
	public List<Book> findByGenero(String genero) throws DataAccessException {
		return bookDAO.findByGenero(genero);
	}

	@Override
	public List<Book> findBy(String parameter, String type) {
		List<Book> list;
		switch(type) {
			case "Autor":  list=this.findByAutor(parameter);
					break;
			case "ISBN":  list=this.findByISBN(parameter);
				break;
			case "G&eacute;nero":  list=this.findByGenero(parameter);
				break;
			default: list=this.findAll();
				break;
		}
		return list;
	}

	@Override
	public String distBooks() {
		return bookDAO.disctBooks();
	}

	@Override
	public String distAutors() {
		return bookDAO.disctAutors();
	}
}
