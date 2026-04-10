package study.ch21.Ex;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class ShopException extends Exception {
    public ShopException(String message) {
        super(message);
    }

}

class PaymentException extends ShopException {
    public PaymentException(String message) {
        super(message);
    }
}

class OrderException extends  ShopException {
    public OrderException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends PaymentException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class CardExpiredException extends PaymentException {
    public CardExpiredException(String message) {
        super(message);
    }
}

class OutOfStockException extends OrderException {
    public OutOfStockException(String message) {
        super(message);
    }
}
public class EX16 {
    public static void main(String[] args) {
        try {
            throw new OutOfStockException("재고가 부족합니다.");
        }catch (OutOfStockException e) {
            e.printStackTrace();
        }


    }
}
