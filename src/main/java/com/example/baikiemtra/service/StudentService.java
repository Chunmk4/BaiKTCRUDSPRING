package com.example.baikiemtra.service;

import com.example.baikiemtra.model.Student;
import com.example.baikiemtra.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllListStudent() {
        return (List<Student>) studentRepository.findAll();
    }
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public Student findById(int id) {
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    public List<Student> searchWithKeyword(String keyword) {
        return studentRepository.findStudentByNameContaining(keyword);
    }
}


