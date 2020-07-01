package deliver.bank.domain.user.repository;

import deliver.bank.domain.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
