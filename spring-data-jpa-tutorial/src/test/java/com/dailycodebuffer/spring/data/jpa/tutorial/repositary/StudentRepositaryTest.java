package com.dailycodebuffer.spring.data.jpa.tutorial.repositary;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Guardian;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//@DataJpaTest will help  us to test the repositary layers and dont make any changes in out databaseand then  flush the data ;
//@DataJdbcTest
//@spring boot make the changes in our database and we want to make the change in our database , at this moment ;
@SpringBootTest
class StudentRepositaryTest {
    @Autowired
    private StudentRepositary studentrepositary;

    @Test
    public void saveStudent(){
        Student studentObj =Student.builder()
                .name("sumitt")
                .build();
        studentrepositary.save(studentObj);
    }
    
@Test
    public void saveGuardian(){
        Guardian guardianObj=Guardian.builder()
                .guardianEmail("Dragon@gmail")
                .guardianName("Dragon")

                .build();


        Student studentObj1 =Student.builder()
                .name("luffy")
                .guardian(guardianObj)
                .build();

        studentrepositary.save(studentObj1);
    }

    @Test
    public void printStudent(){
        List<Student> sturdentList=studentrepositary.findAll();
        System.out.println(sturdentList);
    }

}