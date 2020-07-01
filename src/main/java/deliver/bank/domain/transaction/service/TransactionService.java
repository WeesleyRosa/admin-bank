package deliver.bank.domain.transaction.service;

import deliver.bank.domain.transaction.api.v1.controller.request.CreateTransactionDto;
import deliver.bank.domain.transaction.entities.Transaction;
import deliver.bank.domain.transaction.entities.enumerator.TransactionStatus;
import deliver.bank.domain.transaction.repository.TransactionRepository;
import deliver.bank.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final UserService userService;

    public Transaction createTransaction(CreateTransactionDto request) {
        return transactionRepository.save(transactionDtoToEntity(request));
    }

    private Transaction transactionDtoToEntity(CreateTransactionDto request) {
        return Transaction.builder()
                .value(request.getValue())
                .fromUser(userService.getUserById(request.getFromUser()))
                .toUser(userService.getUserById(request.getToUser()))
                .startedAt(LocalDateTime.now())
                .status(TransactionStatus.Started)
                .build();
    }
}
