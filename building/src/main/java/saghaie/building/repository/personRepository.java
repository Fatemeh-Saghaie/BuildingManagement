package saghaie.building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saghaie.building.model.person;

@Repository
public interface personRepository extends JpaRepository<person, Long> {
}
