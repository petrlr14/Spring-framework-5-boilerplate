package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	@Override
	public Student findOne(Integer code) {
		return studentDAO.findOne(code);
	}

	@Transactional
	@Override
	public void save(Student student) {
		int newRow=student.getcStudent()==null?0:1;
		studentDAO.save(student, newRow);
	}

}
