package study.ch07.ex;

public class Ex27 {
    public static void main(String[] args) {
        // while 합계
        int sum = 0;
        int n = 1;
        while (sum < 20) {
            sum += n;
            n++;
        }
        System.out.println("sum=" + sum + ", n=" + n);
        // 출력: sum=21, n=7
    }
}
