package com.project.school;

import javax.persistence.*;

@Entity
@Table(name = "Marks")
public class Mark 
{
	private long id;
	private int mark;
	private Student student;
	private Subject subject;
	
	@Id
	@Column(name = "id_mark")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
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
	@JoinColumn(name="subjectID")
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Mark [id=" + id + ", mark=" + mark + ", student=" + student + ", subject=" + subject + "]";
	}
	
	
}
