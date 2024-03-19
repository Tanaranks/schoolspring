package com.example.schoolspring.Repository;

import com.example.schoolspring.Entity.Course;
import com.example.schoolspring.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Course_RepoTest {
    @Autowired
    private Course_Repo course_repo;
    @Test
        public void saveCourse(){
            Course course = Course.builder()
                    .course_name("Physics")
                    .course_credit("3")
                    .course_id("01A")
                    .build();
            course_repo.save(course);
    }

}