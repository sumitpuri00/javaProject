package restapi.start.service_package;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Student {
    @Id
    @Column(
            unique = true
    )
    private String studentName;
    @Column(
            unique = true
    )
    private long studentId;


}
