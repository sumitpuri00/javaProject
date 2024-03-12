package com.dailycodebuffer.spring.data.jpa.tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "student_name_is",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_email",
                columnNames ="email"
        )
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence_is",
            sequenceName = "student_sequence_sum",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence_sum"
    )
    private long studentId;
    @Column(name = "first_name")
    private String name;

    @Embedded
    private Guardian guardian ;


}
