package be.multimedi.mongodbdemo.service;

import be.multimedi.mongodbdemo.model.Student;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentByEmail(String email);
}
