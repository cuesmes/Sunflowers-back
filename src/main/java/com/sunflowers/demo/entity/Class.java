package com.project.school;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name ="Classes")
public class Class 
{
	private long id;
	private int classNumber;
	private char classLetter;
	private List<Student> students;
	private List<Subject> subjects;
	
	@Id
	@Column(name = "id_class")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public char getClassLetter() {
		return classLetter;
	}
	public void setClassLetter(char classLetter) {
		this.classLetter = classLetter;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", classNumber=" + classNumber + ", classLetter=" + classLetter + "]";
	}
	@OneToMany(mappedBy = "klasa", cascade = CascadeType.ALL)
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@OneToMany(mappedBy = "klasa", cascade = CascadeType.ALL)
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
