package com.project.school;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Subjects")
public class Subject 
{
	private long id;
	private String subjectName;
	private String dayofWeek;
	private int hours;
	
	private Class klasa;
	private Teacher teacher;
	
	private List<Mark> marks;
	private List<Attendance> attendances;
	
	@Id
	@Column(name = "id_subject")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getDayofWeek() {
		return dayofWeek;
	}
	public void setDayofWeek(String dayofWeek) {
		this.dayofWeek = dayofWeek;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@ManyToOne
	@JoinColumn(name="classID")
	public Class getKlasa() {
		return klasa;
	}
	public void setKlasa(Class klasa) {
		this.klasa = klasa;
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
		return "Subject [id=" + id + ", subjectName=" + subjectName + ", dayofWeek=" + dayofWeek + ", hours=" + hours
				+ ", klasa=" + klasa + ", teacher=" + teacher + "]";
	}
	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	public List<Mark> getMarks() {
		return marks;
	}
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	public List<Attendance> getAttendances() {
		return attendances;
	}
	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}
	
	
	
}
