package study.ch07.ex;

public class Ex24 {
    public static void main(String[] args) {
        // 36의 모든 약수를 출력하는 for 문을 작성하시오.
        // 출력 예시: 1 2 3 4 6 9 12 18 36
        for (int i = 1; i <= 36; i++) {
            if (36 % i == 0) {
                System.out.print(i + " ");
            }
        }
        // 출력: 1 2 3 4 6 9 12 18 36
    }
}
