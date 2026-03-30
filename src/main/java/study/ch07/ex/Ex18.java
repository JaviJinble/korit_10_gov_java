package study.ch07.ex;

public class Ex18 {
    public static void main(String[] args) {
        // 다음 코드의 출력 결과를 쓰시오.
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        // 출력: 55
        // 1+2+3+...+10 = 55 (가우스 공식: 10×11÷2 = 55)

    }
}
