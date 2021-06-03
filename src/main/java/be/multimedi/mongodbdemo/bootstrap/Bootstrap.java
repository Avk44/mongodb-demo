package be.multimedi.mongodbdemo.bootstrap;

import be.multimedi.mongodbdemo.model.Address;
import be.multimedi.mongodbdemo.model.Gender;
import be.multimedi.mongodbdemo.model.Student;
import be.multimedi.mongodbdemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Bootstrap {
    private final StudentService studentService;

    @PostConstruct
    public void init(){
        Address addressDiego = Address.builder().country("Belgium").city("Brussels").postCode("1020").build();
        Student student = Student.builder()
                .firstName("Diego")
                .lastName("Bonucci")
                .email("diego@mail.com")
                .gender(Gender.MALE)
                .address(addressDiego)
                .favouriteSubjects(List.of("Math","Chemistry"))
                .totalSpentInBooks(BigDecimal.TEN)
                .created(LocalDateTime.now()).build();
        studentService.saveStudent(student);

    }
}
