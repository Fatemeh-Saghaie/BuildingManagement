package saghaie.building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saghaie.building.model.bankAccount;

@Repository
public interface bankAccountRepository extends JpaRepository<bankAccount, Long> {
}
