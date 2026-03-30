package study.ch07.ex;

public class Ex33 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 7 == 0) {
                break;
            }
            System.out.print(i + " ");
        }
        // **출력:** `1 2 3 4 5 6`
        //
        //`i`가 7일 때 `7 % 7 == 0`이 true → break로 탈출. 7은 출력되지 않음.
    }
}
