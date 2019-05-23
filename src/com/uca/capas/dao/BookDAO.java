package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.uca.capas.domain.Book;

public interface BookDAO {
		
	public List<Book> findAll() throws DataAccessException;
	public List<Book> findByAutor(String autor) throws DataAccessException;
	public List<Book> findByISBN(String ISBN) throws DataAccessException;
	public List<Book> findByGenero(String genero) throws DataAccessException;
	public String disctBooks() throws DataAccessException;
	public String disctAutors() throws DataAccessException;
}
