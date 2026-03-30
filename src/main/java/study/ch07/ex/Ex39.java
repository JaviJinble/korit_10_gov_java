package study.ch07.ex;

public class Ex39 {
    public static void main(String[] args) {
        // 1부터 100까지의 소수를 모두 출력하는 코드를 작성하시오
        // (중첩 for + break 활용)
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        // 출력: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
        // 최적화: j < i 대신 j <= Math.sqrt(i)로 검사 범위를 줄일 수 있다.
    }
}
