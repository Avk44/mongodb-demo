package be.multimedi.mongodbdemo;

import be.multimedi.mongodbdemo.model.Address;
import be.multimedi.mongodbdemo.model.Gender;
import be.multimedi.mongodbdemo.model.Student;
import be.multimedi.mongodbdemo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MongodbDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MongodbDemoApplication.class, args);
    }
}
