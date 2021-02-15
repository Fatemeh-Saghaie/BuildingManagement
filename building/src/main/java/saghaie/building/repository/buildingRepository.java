package saghaie.building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import saghaie.building.model.building;

import java.util.List;

@Repository
public interface buildingRepository extends JpaRepository<building, Long> {

    List<building> findByName(@Param("buildingName") String buildingName);

    @Query("SELECT b.buildingName FROM building b where b.id = :id") building findNameById(@Param("id") Long id);


}
