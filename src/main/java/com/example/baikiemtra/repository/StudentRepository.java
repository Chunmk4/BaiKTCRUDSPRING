package com.example.baikiemtra.repository;

import com.example.baikiemtra.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    public List<Student> findStudentByNameContaining(String keyword);

}
