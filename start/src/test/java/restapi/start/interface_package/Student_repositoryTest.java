package restapi.start.interface_package;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import restapi.start.service_package.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Student_repositoryTest {
    @Autowired
    private Student_repository studentRepositoryVariable;

    @Test
    public void insertData(){
        Student studentVariable= Student.builder()


                .studentName("vanya")
                .studentId(12322)
                .studentName("sumitpuri")
                .studentId(233333)
                .build();
        studentRepositoryVariable.save(studentVariable);
    }


}