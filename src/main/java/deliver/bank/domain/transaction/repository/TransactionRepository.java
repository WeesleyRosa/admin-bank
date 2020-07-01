package deliver.bank.domain.transaction.repository;

import deliver.bank.domain.transaction.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
