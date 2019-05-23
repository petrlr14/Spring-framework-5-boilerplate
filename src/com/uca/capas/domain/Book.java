package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name="student")
public class Book {
	
	@Id
	@GeneratedValue(generator="book_id_book_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="book_id_book_seq", sequenceName = "public.book_id_book_seq", allocationSize = 1)
	@Column(name="id_book")
	private Integer cBook;
	
	@Column(name="s_autor")
	private String autor;
	
	@Column(name="s_title")
	private String title;
	
	@Column(name="s_isbn")
	private String isbn;
	
	@Column(name="s_category")
	private String category;
	
	@Column(name="i_stock")
	private Integer stock;
	
	public Book() {
		super();
	}

	public Integer getcBook() {
		return cBook;
	}

	public void setcBook(Integer cBook) {
		this.cBook = cBook;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	
}
