package study.ch07.ex;

public class Ex32 {
    public static void main(String[] args) {
        // while 문을 사용하여 정수 9876의 각 자릿수의 합(9+8+7+6=30)을 구하는 코드를 작성하시오.
        int num = 9876;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // 마지막 자리 추출하여 더하기
            num /= 10;         // 마지막 자리 제거
        }
        System.out.println(sum); // 30
    }
}
