package com.tech552.springbootactuatordemo.controllers;

import com.tech552.springbootactuatordemo.models.Student;
import com.tech552.springbootactuatordemo.services.StudentService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class StudentController {

    Counter hitCounter;

    public StudentController(MeterRegistry meterRegistry){
        hitCounter = Counter.builder("hit_counter")
                            .description("Number of hits")
                            .register(meterRegistry);
    }

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        hitCounter.increment();
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/student/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student ){
        studentService.updateStudent(id, student);
    }
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
