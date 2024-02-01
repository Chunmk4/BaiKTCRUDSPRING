package com.example.baikiemtra.controller;

import com.example.baikiemtra.model.Student;
import com.example.baikiemtra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("")
    public String showHome(Model model) {
        List<Student> students = studentService.getAllListStudent();
        model.addAttribute("students", students);
        return "home";
    }

    @GetMapping("/add-student")
    public String showAddStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);

        return "create";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student) {
        studentService.createStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditStudentForm(@PathVariable int id, Model model) {

        model.addAttribute("student", studentService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.updateStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("/view/{id}")
    public String showViewCar(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "view";
    }
    @GetMapping("/search")
    public String showEditStudentForm(@RequestParam("keyword") String keyword, Model model) {

        model.addAttribute("students", studentService.searchWithKeyword(keyword));

        return "home";

    }
}
