package study.ch07.ex;

public class Ex19 {
    public static void main(String[] args) {
        // 다음 코드의 출력 결과를 쓰시오.
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        // 출력: 15
        // 1~20에서 3의 배수이면서 5의 배수인 수 = 15의 배수 = 15만 해당.
    }
}
