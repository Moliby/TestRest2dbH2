package com.example.testrest2dbh2.service;

import com.example.testrest2dbh2.entity.Student;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();


    List<Student> getAllStudent();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);

}
