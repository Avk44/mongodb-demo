package be.multimedi.mongodbdemo.controller;

import be.multimedi.mongodbdemo.model.Student;
import be.multimedi.mongodbdemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/student/{email}")
    public ResponseEntity<Student> saveStudent(@PathVariable String email){
        return ResponseEntity.ok(studentService.getStudentByEmail(email));
    }
}
