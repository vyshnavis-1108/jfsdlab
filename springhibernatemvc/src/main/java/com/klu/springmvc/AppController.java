package com.klu.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	@Autowired
	DAO dao;
	//method to Add a New Student
	
	@GetMapping("/add")
	public String Add(Model m)
	{
		Student s = new Student(); //create Student object
		m.addAttribute("command", s);
		return "add";
	}
	// method to delete a Student data
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		Student s = dao.getStudentById(id);
		dao.deleteStudent(s);
		return "redirect:/show";	
		}
	// method to display Student data
	@GetMapping("/show")
	public String show(Model m)
	{
		List<Student> l = dao.getStudentList(); //gets Student data from table
		m.addAttribute("list", l);
		return "show";
		
	}
	
	//method to edit student data
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id,Model m)
	{
		Student s = dao.getStudentById(id);
		m.addAttribute("command", s);
		return "edit";	
	}

	@PostMapping("/editsave")
	public String EditSave(@ModelAttribute("s") Student s)
	{
		dao.updateStudent(s);
		return "redirect:/show";
	}
	@PostMapping("/addsave")
	public String AddSave(@ModelAttribute("s") Student s)
	{
		dao.saveStudent(s);
		return "redirect:/show";
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

