package study.ch12.Ex;

class Payment {
    int amount;  // 결제 금액

    Payment(int amount) {
        this.amount = amount;
    }

    // 기본 결제 방식
    void pay() {
        System.out.println(amount + "원 결제");
    }
}

class CardPayment extends Payment {

    CardPayment(int amount) {
        super(amount);
    }

    // 카드 결제로 오버라이딩
    @Override
    void pay() {
        System.out.println("카드 결제: " + amount + "원");
    }
}

class CashPayment extends Payment {

    CashPayment(int amount) {
        super(amount);
    }

    // 현금 결제로 오버라이딩
    @Override
    void pay() {
        System.out.println("현금 결제: " + amount + "원");
    }
}

public class Ex10 {
    public static void main(String[] args) {

        // 부모 타입 배열에 여러 자식 객체를 저장
        Payment[] payments = {
                new CardPayment(10000),
                new CashPayment(5000),
                new CardPayment(30000)
        };

        // 각 객체의 오버라이딩된 pay()가 실행됨
        for (Payment p : payments) {
            p.pay();
        }
    }
}
