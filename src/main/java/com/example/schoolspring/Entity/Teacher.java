package com.example.schoolspring.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "Teacher_Table")
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_sequence",
            sequenceName = "teacher_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_sequence")
    private long teacher_id;
    private String teacher_name;
    private String teacher_email;

    @OneToMany
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;
}
