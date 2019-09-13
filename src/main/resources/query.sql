drop database school;

create database school;

use school;


create table Classes
(
	id_class int not null AUTO_INCREMENT PRIMARY KEY,
    class_number int not null,
    class_letter CHARACTER(1) not null
);


create table Teachers 
( 
	id_teacher int AUTO_INCREMENT Primary key, 
	login varchar(50) not null unique,
	password varchar(50) not null,
	first_name varchar(80) not null, 
	last_name varchar(80) not null, 
	city varchar(60) not null, 
	address varchar(70) not null, 
	contact_number varchar(9) not null, 
	date_of_birth date not null
);

create table Students 
( 
	id_student int AUTO_INCREMENT Primary key,
	login varchar(50) not null unique,
	password varchar(50) not null,	
	first_name varchar(80) not null, 
	last_name varchar(80) not null, 
	city varchar(60) not null, 
	address varchar(70) not null, 
	contact_number varchar(9) not null, 
	date_of_birth date not null ,
	classID int not null,
	CONSTRAINT fk_Student_classid FOREIGN KEY (classID) REFERENCES classes (id_class)
);

create table Subjects
(
	id_subject int not null AUTO_INCREMENT PRIMARY KEY,
    subject_name varchar(50) not null,
    classID int not null,
    teacherID int not null,
	day_of_week varchar(12) not null,
	hours int not null,
    Constraint fk_subject_classID FOREIGN KEY (classID) REFERENCES classes(id_class),
    Constraint fk_subject_teacherID FOREIGN KEY (teacherID) REFERENCES teachers(id_teacher)
);

create table Notes 
( 
	id_note int not null AUTO_INCREMENT PRIMARY Key,
	note varchar(300),
	studentID int not null,
	teacherID int not null,
	CONSTRAINT fk_notes_studentID FOREIGN KEY (studentID) REFERENCES students(id_student),
	CONSTRAINT fk_notes_teacherID FOREIGN KEY (teacherID) REFERENCES teachers(id_teacher) 
);



create table Marks
(
	id_mark int not null AUTO_INCREMENT PRIMARY KEY,
    mark int not null,
    subjectID int not null,
    studentID int not null,
    CONSTRAINT fk_marks_subjectID FOREIGN KEY (subjectID) REFERENCES subjects(ID_subject),
	CONSTRAINT fk_marks_studentID FOREIGN KEY (studentID) REFERENCES students(ID_student)
);

create table Attendances
(
    id_attendance int not null AUTO_INCREMENT PRIMARY KEY,
    attendance int not null default 1,
    subjectID int not null,
    studentID int not null,
	current_day date not null,
	CONSTRAINT fk_attendances_subjectID FOREIGN KEY (subjectID) REFERENCES subjects(id_subject),
    CONSTRAINT fk_attendances_studentID FOREIGN KEY (studentID) REFERENCES students(id_student)
);

INSERT INTO classes( class_number, class_letter) VALUES (1,'A'),(2,'B');
INSERT INTO teachers(login,password,first_name,last_name,city,address,contact_number,date_of_birth) values('login1','haslo1','Jan','Kowalski','Lodz','Adres1','123','1996/11/21'),('login2','haslo2','Adam','Nowak','NieLodz','Adres2','1234','1996/11/21');
INSERT INTO students(login,password,first_name,last_name,city,address,contact_number,date_of_birth,classID) values ('uczen1','uczen1','Jan','Pierwszy','miasto1','ad1','12','1996/11/21',1),('uczen2','uczen2','Adam','drugi','miasto2','ad2','123','1996/11/21',2),
('uczen3','uczen3','Kamil','Trzeci','miasto3','ad3','112','1996/11/21',1),('uczen4','uczen4','Jacek','Czwarty','miasto4','ad4','122','1996/11/21',2);
Insert into subjects(subject_name,classID,teacherID,day_of_week,hours) values ('Polski',1,1,'Wtorek',3),('Angielski',1,2,'Czwartek',2),('Mechanika',2,1,'Piatek',2);
INSERT into notes(note,studentID,teacherID) VALUES('Uczen zachowuje sie nie stosownie na lekcji.',1,1),('Uczen bije innych uczniow.',1,2);
insert into marks(mark,subjectID,studentID) values (3,1,1),(2,1,3),(5,2,1),(4,3,2);
insert into attendances(attendance,subjectID,studentID,current_day) values(1,1,1,'1996/11/21'),(1,1,3,'1996/11/21'),(-1,2,1,'1996/11/21'),(1,2,1,'1996/11/21');
