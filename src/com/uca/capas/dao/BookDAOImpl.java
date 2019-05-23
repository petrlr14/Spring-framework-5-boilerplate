package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Book> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book");
		Query query = entityManager.createNativeQuery(sb.toString(),Book.class);
		List<Book> resultset= query.getResultList();
		return resultset;
	}

	@Override
	public List<Book> findByAutor(String autor) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book where public.book.s_autor ILIKE CONCAT('%', :autor, '%')");
		Query query = entityManager.createNativeQuery(sb.toString(),Book.class);
		query.setParameter("autor", autor);
		List<Book> resultset= query.getResultList();
		return resultset;
	}

	@Override
	public List<Book> findByISBN(String ISBN) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book where public.book.s_isbn = :isbn");
		Query query = entityManager.createNativeQuery(sb.toString(),Book.class);
		query.setParameter("isbn", ISBN);
		List<Book> resultset= query.getResultList();
		return resultset;
	}

	@Override
	public List<Book> findByGenero(String genero) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book where public.book.s_category ILIKE CONCAT('%', :genero, '%')");
		Query query = entityManager.createNativeQuery(sb.toString(),Book.class);
		query.setParameter("genero", genero);
		List<Book> resultset= query.getResultList();
		return resultset;
	}

	@Override
	public String disctBooks() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select sum(public.book.i_stock) from public.book");
		Query query = entityManager.createNativeQuery(sb.toString());
		return query.getSingleResult().toString();
	}

	@Override
	public String disctAutors() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT COUNT(DISTINCT(public.book.s_autor)) FROM public.book");
		Query query = entityManager.createNativeQuery(sb.toString());
		return query.getSingleResult().toString();
	}
}