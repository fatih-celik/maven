package com.ibtech.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import com.ibtech.model.Student;

@ManagedBean(name="projeBean")
@ViewScoped

public class ProjeBean {
	
	private Student student ;
	private List<Student> studentList; 
	
	public ProjeBean() {
		student = new Student();
		studentList =new ArrayList<Student>();
	}
	
	
	public void ekle() {
		studentList.add(student);


	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
	
	
	
	
	
}
