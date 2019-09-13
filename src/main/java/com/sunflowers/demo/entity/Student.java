package com.project.school;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student 
{
	private long id;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private String city;
	private String address;
	private String contactNumber;
	
	@Basic
	private java.sql.Date dateOfBirth;
	
	private Class klasa;
	private List<Note> notes;
	private List<Mark> marks;
	private List<Attendance> attendances;

	@Id
	@Column(name = "id_student")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public java.sql.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@ManyToOne
	@JoinColumn(name="classID")
	public Class getKlasa() {
		return klasa;
	}

	public void setKlasa(Class klasa) {
		this.klasa = klasa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", login=" + login + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", city=" + city + ", address=" + address + ", contactNumber="
				+ contactNumber + ", dateOfBirth=" + dateOfBirth + ", klasa=" + klasa + "]";
	}

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	public List<Attendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}
	
	
	
	
}
