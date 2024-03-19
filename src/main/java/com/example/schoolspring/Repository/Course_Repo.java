package com.example.schoolspring.Repository;

import com.example.schoolspring.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Course_Repo extends JpaRepository<Course,Long> {
}
