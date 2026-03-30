package study.ch07.ex;

public class Ex28 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;  // 이 줄 추가!
        }
        // 문제점: i의 값이 변하지 않아 무한 루프 발생.
    }
}
