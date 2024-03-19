package com.example.schoolspring.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "Student_Table")
public class Student {
    @Id
    @SequenceGenerator(name = "Student_sequence",
    sequenceName = "Student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Student_sequence")
    private Long studentId;
    private String Full_name;
    private String Email;
    private String PhoneNo;

}
