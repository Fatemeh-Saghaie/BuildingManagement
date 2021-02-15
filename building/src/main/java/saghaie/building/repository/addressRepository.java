package saghaie.building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saghaie.building.model.address;

@Repository
public interface addressRepository extends JpaRepository<address, Long> {
}
