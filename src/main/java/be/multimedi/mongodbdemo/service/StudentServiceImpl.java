package be.multimedi.mongodbdemo.service;

import be.multimedi.mongodbdemo.model.Student;
import be.multimedi.mongodbdemo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
