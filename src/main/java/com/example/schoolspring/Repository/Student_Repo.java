package com.example.schoolspring.Repository;

import com.example.schoolspring.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Student_Repo extends JpaRepository<Student,Long> {
    List<Student> findByFull_name(String full_name);
}
