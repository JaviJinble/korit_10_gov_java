package study.ch12.Ex;

class Calculator {
    int result = 0;  // 계산 결과 저장

    // 더하기
    void add(int n) {
        result += n;
    }

    // 빼기
    void sub(int n) {
        result -= n;
    }

    // 현재 결과 출력
    void printResult() {
        System.out.println("결과: " + result);
    }
}

class ScientificCalculator extends Calculator {

    // add() 기능을 확장
    @Override
    void add(int n) {
        System.out.println("과학 계산기 덧셈");
        super.add(n);  // 부모의 add() 호출
    }
}

public class Ex09 {
    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();

        sc.add(10);   // 메시지 출력 후 10 더하기
        sc.add(5);    // 메시지 출력 후 5 더하기
        sc.sub(3);    // 부모 메서드 그대로 사용
        sc.printResult();  // 결과 출력
    }
}