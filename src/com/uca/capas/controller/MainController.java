package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.domain.Student;
import com.uca.capas.service.StudentService;

@Controller
public class MainController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public ModelAndView init() {
		ModelAndView view=new ModelAndView();
		List<Student> students=null;
		try {
			students=studentService.findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}	
		view.addObject("students", students);
		view.setViewName("main");
		return view; 
	}
	
	@RequestMapping("/findOne")
	public ModelAndView findOne() {
		ModelAndView view=new ModelAndView();
		view.setViewName("findOne");
		return view;
	}
	
	@RequestMapping(path="/find", method = RequestMethod.POST)
	public ModelAndView findOne(@RequestParam Integer code) {
		System.out.println(code);
		ModelAndView view=new ModelAndView();
		view.addObject("student", this.studentService.findOne(code));
		view.setViewName("student");
		return view;
	}
	
	@RequestMapping(path="/addOne", method = RequestMethod.POST)
	public ModelAndView save() {
		
	}
}
