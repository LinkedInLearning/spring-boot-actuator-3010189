package com.tech552.springbootactuatordemo.repos;

import com.tech552.springbootactuatordemo.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends CrudRepository<Student, Long> {
}
