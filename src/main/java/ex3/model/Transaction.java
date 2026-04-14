package ex3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Transaction {
    private String type;
    private int amount;
    private int balanceAfter;
    private String dateTime;
}
