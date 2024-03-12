package com.dailycodebuffer.spring.data.jpa.tutorial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {
    @Column(
            nullable = false
    )

    private String guardianName;

    @Column(
            nullable = false
    )
    private String guardianEmail;


}
