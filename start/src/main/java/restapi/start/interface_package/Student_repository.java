package restapi.start.interface_package;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restapi.start.service_package.Student;
@Repository
public interface Student_repository extends JpaRepository<Student,String> {
}
