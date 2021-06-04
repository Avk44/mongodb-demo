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

    @Override
    public Student saveStudent(Student student) {
        studentRepository.findStudentByEmail(student.getEmail())
                .ifPresentOrElse(s -> {
                    System.out.printf("%s %s already exist.", s.getFirstName(), s.getLastName());
                },() ->{
                    System.out.printf("Inserting student %s %s.",student.getFirstName(), student.getLastName());
                    studentRepository.save(student);
                });

        return student;
    }

    @Override
    public Student getStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email).get();
    }
}
