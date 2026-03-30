package study.ch07.ex;

public class Ex20 {
    public static void main(String[] args) {
        //### 문제 20. 팩토리얼 계산
        //5! (5 팩토리얼)을 구하는 for 문을 작성하시오. (5! = 5×4×3×2×1 = 120)
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        System.out.println(result); // 120

    }
}
