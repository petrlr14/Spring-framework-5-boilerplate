package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.domain.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Student> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.student");
		Query query = entityManager.createNativeQuery(sb.toString(),Student.class);
		List<Student> resulset= query.getResultList();
		return resulset;
	}

	@Override
	public Student findOne(Integer code) throws DataAccessException {
		Student student = entityManager.find(Student.class, code);
		return student;
	}

	@Transactional
	@Override
	public void save(Student student, Integer newRow) throws DataAccessException {
		try {
			if(newRow==0) entityManager.persist(student);
			else student=entityManager.merge(student);
			entityManager.flush();
		}catch (Exception e) {
			throw e;
		}
	}

	@Transactional
	@Override
	public void delete(Student student) throws DataAccessException {
		entityManager.remove(entityManager.contains(student)?student:entityManager.merge(student));
	}
	
	
	
}