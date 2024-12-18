package com.StudentManagementSystem.repository;

import com.StudentManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repository extends JpaRepository<Student,Integer> {

}
