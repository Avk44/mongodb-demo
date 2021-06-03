package be.multimedi.mongodbdemo.repository;

import be.multimedi.mongodbdemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
