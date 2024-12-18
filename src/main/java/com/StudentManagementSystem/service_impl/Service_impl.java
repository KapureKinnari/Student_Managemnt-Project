package com.StudentManagementSystem.service_impl;

import com.StudentManagementSystem.Entity.Student;
import com.StudentManagementSystem.repository.Student_Repository;
import com.StudentManagementSystem.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_impl implements Student_Service {

    @Autowired
    com.StudentManagementSystem.repository.Student_Repository  Student_Repository;
    @Override
    public List<Student> getAllStudents() {

       // return Student_Repository.findAll();
        //or
        List<Student> list= Student_Repository.findAll();
        return list;
    }

    @Override
    public Student saveStudent(Student student) {
        return Student_Repository.save(student);
    }

    @Override
    public Student getById(int id) {
        return Student_Repository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        Student_Repository.deleteById(id);
    }
}
