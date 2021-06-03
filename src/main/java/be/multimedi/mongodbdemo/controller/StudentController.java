package be.multimedi.mongodbdemo.controller;

import be.multimedi.mongodbdemo.model.Student;
import be.multimedi.mongodbdemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> fetchAllStudents(){
        return studentService.getAllStudents();
    }
}
