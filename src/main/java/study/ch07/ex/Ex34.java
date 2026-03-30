package study.ch07.ex;

public class Ex34 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        //**출력:** `1 2 4 5 7 8 10`
        //
        //3의 배수(3, 6, 9)에서 continue → 해당 숫자만 건너뛰고 나머지는 출력.

    }
}
