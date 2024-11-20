package ie.atu.week11example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByEmployeeId(String employeeId);
}
