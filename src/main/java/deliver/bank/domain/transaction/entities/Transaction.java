package deliver.bank.domain.transaction.entities;

import deliver.bank.domain.transaction.entities.enumerator.TransactionStatus;
import deliver.bank.domain.user.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {

    @Id
    private Long id;
    private LocalDateTime occurred;
    private User toUser;
    private User fromUser;
    private BigDecimal value;
    private TransactionStatus status;
    private LocalDateTime startedAt;
}
