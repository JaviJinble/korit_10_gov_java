package ex3.model;


import lombok.Getter;

@Getter
public class Account {
    private static int autoIncrement = 1000;

    private final int accountNo;
    private final String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.accountNo = ++autoIncrement;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new RuntimeException("입금액은 0보다 커야 합니다.");
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new RuntimeException("출금액은 0보다 커야 합니다.");
        }
        if (balance < amount) {
            throw new InsufficientBalanceException("잔액이 부족합니다");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
