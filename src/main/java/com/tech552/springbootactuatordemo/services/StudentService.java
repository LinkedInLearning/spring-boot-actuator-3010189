package com.tech552.springbootactuatordemo.services;

import com.tech552.springbootactuatordemo.models.Student;
import com.tech552.springbootactuatordemo.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        List<Student> listOfStudents = new ArrayList<>();
        studentRepository.findAll().forEach(listOfStudents::add);
        return listOfStudents;
    }

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    public void updateStudent(Long id, Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
