package ex2.repository;

import ex2.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Account save(Account account);
    Optional<Account> findById(int accountNo);
    Optional<Account> findByAccountNo(String accountNo);
    List<Account> findAll();
}
