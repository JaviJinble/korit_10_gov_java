package study.ch21.Ex;
//### 문제 3. 0 나누기
//
//두 정수를 받아 나눗셈 결과를 리턴하는 메서드를 작성하시오. 0으로 나눌 경우 예외를 잡아 -1을 리턴하시오.
//
//```java
//static int divide(int a, int b)
//
//divide(10, 3);  // 3
//divide(10, 0);  // -1 ("0으로 나눌 수 없습니다" 출력 후)
//```

//static int divide(int a, int b) {
//    try {
//        return a / b;
//    } catch (ArithmeticException e) {
//        System.out.println("0으로 나눌 수 없습니다");
//        return -1;
//    }
//}
public class Ex03 {
    public static void main(String[] args) {

    }
}
