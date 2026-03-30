package study.ch07.ex;

public class Ex38 {
    public static void main(String[] args) {
        // 피보나치 수열
        // for 문을 사용하여 피보나치 수열의 처음 10개를 출력하는 코드를 작성하시오.
        // 출력: 0 1 1 2 3 5 8 13 21 34
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        // 출력: 0 1 1 2 3 5 8 13 21 34
    }
}
