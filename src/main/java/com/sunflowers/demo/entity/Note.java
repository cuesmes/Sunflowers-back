package com.project.school;

import javax.persistence.*;

@Entity
@Table (name = "Notes")
public class Note 
{
	private long id;
	private String note;
	private Student student;
	private Teacher teacher;
	
	@Id
	@Column(name = "id_note")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@ManyToOne
	@JoinColumn(name="studentID")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@ManyToOne
	@JoinColumn(name="teacherID")
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", note=" + note + ", student=" + student + ", teacher=" + teacher + "]";
	}
	
	
}
