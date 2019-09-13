package com.project.school;

import javax.persistence.*;

@Entity
@Table(name = "Attendances")
public class Attendance 
{
	private long id;
	private int attendance;
	@Basic
	private java.sql.Date currentDay;
	private Student student;
	private Subject subject;
	@Id
	@Column(name = "id_attendance")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public java.sql.Date getCurrentDay() {
		return currentDay;
	}
	public void setCurrentDay(java.sql.Date currentDay) {
		this.currentDay = currentDay;
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
		return "Attendance [id=" + id + ", attendance=" + attendance + ", currentDay=" + currentDay + ", student="
				+ student + ", subject=" + subject + "]";
	}
	
	
}
