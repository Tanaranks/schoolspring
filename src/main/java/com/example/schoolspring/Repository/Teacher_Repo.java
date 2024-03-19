package com.example.schoolspring.Repository;

import com.example.schoolspring.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Teacher_Repo extends JpaRepository<Teacher,Long> {
}
