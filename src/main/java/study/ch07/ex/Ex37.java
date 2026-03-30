package study.ch07.ex;

public class Ex37 {
    public static void main(String[] args) {
        // ### 문제 37. 종합 — FizzBuzz
        //1부터 30까지 출력하되, 3의 배수이면 "Fizz",
        // 5의 배수이면 "Buzz", 15의 배수이면 "FizzBuzz"를 출력하는 코드를 작성하시오.

        //출력 예시: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ...
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        //핵심: 15의 배수를 먼저 검사해야 한다. (3의 배수이면서 5의 배수이므로)
    }
}
