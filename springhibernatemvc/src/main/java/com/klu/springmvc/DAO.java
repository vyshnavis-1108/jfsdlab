package com.klu.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class DAO {
HibernateTemplate template;

public HibernateTemplate getTemplate() {
	return template;
}
public void setTemplate(HibernateTemplate template) {
	this.template = template;
}
//method to save the Student data 
public void saveStudent(Student s) {
		template.save(s);
}
//method to update the Student data
public void updateStudent(Student s) {
		template.update(s);
}
//method to delete the student data
public void deleteStudent(Student s) {
	template.delete(s);
}
//method to get the Student data based on Student Id.
public Student getStudentById(int id){ 
Student s = (Student)template.get(Student.class, id); //get the details of Student based on Id
return s;
}

//method to get List of student data
public List<Student> getStudentList(){
	
	List<Student> l = new ArrayList<Student>();
	l = template.loadAll(Student.class);
	
	return l;
}

}

