package saghaie.building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saghaie.building.model.unit;

@Repository
public interface unitRepository extends JpaRepository<unit, Long> {
}
