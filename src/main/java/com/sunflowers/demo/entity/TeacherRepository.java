package com.project.school;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface TeacherRepository  extends CrudRepository< Teacher, Long>
{

}
