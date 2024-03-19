package com.example.schoolspring.Repository;

import com.example.schoolspring.Entity.Student;
import com.example.schoolspring.Entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Teacher_RepoTest {
    @Autowired
    private Teacher_Repo teacher_repo;
    @Test
    public void saveTeacher() {
        Teacher teacher = Teacher.builder()
                .teacher_email("Ajayi@34gmail.com")
                .teacher_id(1l)
                .teacher_name("MR bellz ajayi")
                .build();
        teacher_repo.save(teacher);
    }}