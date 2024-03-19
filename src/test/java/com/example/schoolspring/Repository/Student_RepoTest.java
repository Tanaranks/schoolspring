package com.example.schoolspring.Repository;

import com.example.schoolspring.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Student_RepoTest {
    @Autowired
    private Student_Repo student_repo;
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .studentId(2L)
                .Full_name("billy kim")
                .Email("Bill24@gmail.com")
                .PhoneNo("09056324643")
                .build();
student_repo.save(student);
    }
@Test
    public void printAllStudents(){
    List<Student> studentList = student_repo.findAll();
    System.out.println("THE STUDENT:" + studentList);
}

}