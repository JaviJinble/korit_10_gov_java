package ex3.service;

import ex3.model.Account;
import ex3.model.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    private final Map<Integer, Account> accounts = new HashMap<>();
    private final List<Transaction> history = new ArrayList<>();

    public Account createAccount(String owner, int balance) {
        Account account = new Account(owner, balance);
        accounts.put(account.getAccountNo(), account);
        return account;
    }
    public Account findByNo(int no) {
        return accounts.get(no);
    }

    public void deposit(int accountNo, int amount) {
        Account account = accounts.get(accountNo);

        if (account == null) {
            throw new RuntimeException("존재하지 않는 계좌번호입니다.");
        }

        account.deposit(amount);

        history.add(new Transaction(
                "입금",
                amount,
                account.getBalance(),
                java.time.LocalDateTime.now().toString()
        ));

    }
    public void withdraw(int accountNo, int amount) {
        Account account = accounts.get(accountNo);

        if (account == null) {
            throw new RuntimeException("존재하지 않는 계좌번호입니다.");
        }

        account.withdraw(amount);

        history.add(new Transaction(
                "출금",
                amount,
                account.getBalance(),
                java.time.LocalDateTime.now().toString()
        ));

    }
    public List<Account> getAccountList() {
        return new ArrayList<>(accounts.values());
    }
    public List<Transaction> getHistory() {
        return history;
    }
}
